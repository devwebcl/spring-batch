package com.web.listener;

import org.apache.log4j.Logger;
import org.springframework.batch.core.annotation.OnSkipInProcess;
import org.springframework.batch.core.annotation.OnSkipInRead;
import org.springframework.batch.core.annotation.OnSkipInWrite;
import org.springframework.batch.item.file.FlatFileParseException;

public class OrderRecordSkipHandler {

	public static final Logger log = Logger.getLogger("recordLogger");

	@OnSkipInRead
	public void onSkipInRead(Throwable t) {
		if (t instanceof FlatFileParseException) {
			FlatFileParseException ffpe = (FlatFileParseException) t;
			logSkippedItem("Reader skip:" + ffpe.getInput());
		}
	}

	@OnSkipInWrite
	public void onSkipInWrite(Object item, Throwable t) {
		logSkippedItem("Writer skip: " + item);
	}

	@OnSkipInProcess
	public void onSkipInProcess(Object item, Throwable t) {
		logSkippedItem("Processor skip: " + item);
	}

	public void logSkippedItem(Object item) {		
		log.fatal(item);		
	}

}

