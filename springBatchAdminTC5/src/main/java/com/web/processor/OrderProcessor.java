package com.web.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.validator.ValidationException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;

import com.web.model.Order;

public class OrderProcessor implements ItemProcessor<Order, Order> {

	private Validator validator;

	public void setValidator(Validator validator) {
		this.validator = validator;
	}

	@Override
	public Order process(Order item) throws Exception {

		BindingResult results = BindAndValidate(item);
		if (results.hasErrors())
			buildValidationException(results);

		item.setOffer(item.getOffer().toUpperCase());
				
		return item;
	}

	private BindingResult BindAndValidate(Order item) {
		DataBinder binder = new DataBinder(item);
		binder.setValidator(validator);

		binder.validate();

		return binder.getBindingResult();

	}

	private void buildValidationException(BindingResult results) {
		StringBuilder msg = new StringBuilder();
		for (ObjectError error : results.getAllErrors()) {
			msg.append("-*-*-*- \n" + error.toString() + "-*-*-*- \n");
		}
		throw new ValidationException(msg.toString());
	}

}
