package cl.devweb;

import org.apache.log4j.Logger;
import org.springframework.batch.item.ItemProcessor;

import cl.devweb.model.Deal;
import cl.devweb.model.DealMapper;
import cl.devweb.model.Users_billing_history;

public class CustomItemProcessor implements ItemProcessor<Deal, Users_billing_history> {

	private DealMapper mapper;
	
	private Logger logger = Logger.getLogger(CustomItemProcessor.class);
	
	@Override
	public Users_billing_history process(Deal item) throws Exception {
		
		logger.debug("Processing...." + item);
		
		//@deprecated anti-pattern
		//return new Users_billing_history(item); 
	
		//we delegate to:
		return mapper.map(item);
	}
	
	
	public void setMapper(DealMapper mapper) {
		this.mapper = mapper;
	}
	
}
