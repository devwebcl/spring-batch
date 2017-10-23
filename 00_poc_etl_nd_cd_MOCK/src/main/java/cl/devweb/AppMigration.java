package cl.devweb;

import org.apache.log4j.Logger;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMigration {
	
	private static Logger logger = Logger.getLogger(AppMigration.class);
	
	public static void main(String[] args) {

		logger.debug("start.");
		
		String[] springConfig  = { "spring/batch/jobs/job-migration.xml" };
		/* we can do it here instead of import(ing) at job-migration.xml 
		   String[] springConfig  = 
			{	"spring/batch/config/database.xml", 
				"spring/batch/config/context.xml",
				"spring/batch/jobs/job-migration.xml" 
			};
		*/
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);
		
		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("migrationJob");

		try {

			JobExecution execution = jobLauncher.run(job, new JobParameters());
			logger.debug("Exit Status : " + execution.getStatus());

		} catch (Exception e) {
			e.printStackTrace();
		}

		logger.debug("End.");
	}
}

