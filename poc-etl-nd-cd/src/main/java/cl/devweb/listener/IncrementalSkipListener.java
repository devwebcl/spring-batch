package cl.devweb.listener;


import org.apache.log4j.Logger;

import org.springframework.batch.core.annotation.OnSkipInProcess;
import org.springframework.batch.core.annotation.OnSkipInRead;
import org.springframework.batch.core.annotation.OnSkipInWrite;


public class IncrementalSkipListener {

	private Logger logger = Logger.getLogger(IncrementalSkipListener.class);


	@OnSkipInRead
	public void onSkipInRead(Throwable t) {
		logger.error("Reader skip:" + t.getCause());
	}

	@OnSkipInWrite
	public void onSkipInWrite(Object item, Throwable t) {
		logger.error("Reader skip:" + t.getCause());
	}

	@OnSkipInProcess
	public void onSkipInProcess(Object item, Throwable t) {
		logger.error("Processor skip: " + item);
	}

}
