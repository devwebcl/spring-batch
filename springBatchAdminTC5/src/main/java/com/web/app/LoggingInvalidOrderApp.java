package com.web.app;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoggingInvalidOrderApp {

	private static final Logger log = Logger.getLogger(LoggingInvalidOrderApp.class);
	private static ClassPathXmlApplicationContext context;

	public static void main(String[] args) {

		String exitStatus = "Exit Status: ";

		String[] springConfig = { "launch-context.xml",
				"META-INF/spring/batch/jobs/job-orderInvalidLogging.xml" };

		context = new ClassPathXmlApplicationContext(springConfig);

		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("orderLoggingJob");

		try {
			JobParametersBuilder jobParametersBuilder = new JobParametersBuilder();

			jobParametersBuilder.addString("dateTime", (new Date()).toString());
			jobParametersBuilder.addString("inputDataFile",
					"classpath:cvs/skipInvalidOrderData.csv");

			JobParameters param = jobParametersBuilder.toJobParameters();
			JobExecution execution = jobLauncher.run(job, param);

			exitStatus += execution.getStatus().toString();

		} catch (Exception e) {
			log.info(e.getStackTrace());
		} finally {
			if (context != null)
				context.close();
		}

		log.info(exitStatus);
		log.info("Job Finished");

	}

}
