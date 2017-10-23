package cl.devweb;

import java.sql.BatchUpdateException;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cl.devweb.model.devwebish.enums.CountryEnum;
import cl.devweb.util.JobEnum;
import cl.devweb.util.MigrationConstants;

public class AppMigration {

    private static final Logger logger = Logger.getLogger(AppMigration.class);


    public static void main(String[] args) {

        logger.debug("Start.");

        long startTime = System.currentTimeMillis();
        //execute job:
        try {
            String jobNameStr = System.getProperty(MigrationConstants.JOB_NAME_ARG);

            JobEnum jobEnum = JobEnum.getByName(jobNameStr);

            if (jobEnum != null) {

                String strCountry = System.getProperty(MigrationConstants.COUNTRY_ARG); //Possible values cl, co, pe, mx

                CountryEnum countryEnum;
                if (strCountry != null) {
                    countryEnum = CountryEnum.getCountryEnumByCountryCode(strCountry);
                } else {
                    countryEnum = null;
                }


                if (countryEnum != null) {
                    System.setProperty(MigrationConstants.COUNTRIES_PROPERTY, countryEnum.getId().toString());
                    System.setProperty(MigrationConstants.APP_DOMAINS_PROPERTY, countryEnum.getCdAppDomainId().toString());
                } else {
                    System.setProperty(MigrationConstants.COUNTRIES_PROPERTY, MigrationConstants.ALL_COUNTRIES_PROPERTY_VALUE);
                    System.setProperty(MigrationConstants.APP_DOMAINS_PROPERTY, MigrationConstants.ALL_APP_DOMAINS_PROPERTY_VALUE);
                }

                String limit = System.getProperty(MigrationConstants.LIMIT_PROPERTY);

                if (limit != null) {
                    System.setProperty(MigrationConstants.LIMIT_PROPERTY, String.format("LIMIT %s", limit));
                } else {
                    System.setProperty(MigrationConstants.LIMIT_PROPERTY, "");
                }

                logger.debug("executing: " + jobEnum);

                String[] springConfig = {String.format("spring/batch/jobs/%s.xml", jobEnum.getFileName())};

                @SuppressWarnings("resource")
                ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);
                JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
                Job job = (Job) context.getBean(jobEnum.getJobBean());

                JobExecution execution = jobLauncher.run(job, new JobParameters());
                ExitStatus status = execution.getExitStatus();

                logger.debug("Exit Status : " + execution.getStatus());

                //we handle nested exception to check SQL issues:
                if (!ExitStatus.COMPLETED.getExitCode().equals(status.getExitCode())) {

                    List<Throwable> exceptions = execution.getAllFailureExceptions();
                    for (Throwable throwable : exceptions) {

                        if (throwable.getCause() instanceof BatchUpdateException) {
                            //we assume next is SQLException:
                            BatchUpdateException e = (BatchUpdateException) throwable.getCause();
                            logger.error("getNextException -- handled error: " + e.getNextException());
                        }

                    }
                }
            } else {
                logger.error("The param -DjobName={NAME} is mandatory: ");
                printPossibleValues();
            }
        } catch (JobExecutionAlreadyRunningException | JobRestartException | JobInstanceAlreadyCompleteException | JobParametersInvalidException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException ex) {
            logger.error("Invalid job name: " + args[0]);
            printPossibleValues();
        }

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        logger.debug(elapsedTime + " milliseconds");

        logger.debug("End.");
    }

    private static void printPossibleValues() {
        System.out.println("Possible Values: ");
        for (JobEnum jobEnum : JobEnum.values()) {
            System.out.println(jobEnum.name().toLowerCase());
        }
    }
}
