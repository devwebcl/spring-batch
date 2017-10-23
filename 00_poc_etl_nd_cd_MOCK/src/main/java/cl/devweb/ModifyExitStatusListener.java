package cl.devweb;

import org.apache.log4j.Logger;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.listener.StepExecutionListenerSupport;


public class ModifyExitStatusListener extends StepExecutionListenerSupport {

	private Logger logger = Logger.getLogger(ModifyExitStatusListener.class);
	
	public ExitStatus afterStep(StepExecution stepExecution) {

		if (stepExecution.getReadCount() == 0) {
			logger.error("ERROR: Zero rows...");
	        return ExitStatus.FAILED;
	    }
		
	    return null;
	}

}
