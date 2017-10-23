package cl.devweb.processor;

import org.apache.log4j.Logger;
import org.springframework.batch.item.ItemProcessor;


public class CustomItemProcessor implements ItemProcessor<Object, Object> { //<Order, UsersBillingHistory

	private CustomMapper mapper;

	private Logger logger = Logger.getLogger(CustomItemProcessor.class);

	@Override
	public Object process(Object item) throws Exception {

		//logger.debug("Processing...." );

		//@deprecated anti-pattern
		//return new UsersBillingHistory(item);

		//we delegate to:
		return mapper.map(item);
	}


	public void setMapper(CustomMapper mapper) {
		this.mapper = mapper;
	}


}
