package com.web.mapper;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.web.model.Order;

public class OrderMapper implements FieldSetMapper<Order>{

	@Override
	public Order mapFieldSet(FieldSet fieldSet) throws BindException {
		Order order = new Order();
		
		order.setCode(fieldSet.readString(0));
		order.setServiceType(fieldSet.readString(1));
		order.setQuantity(fieldSet.readInt(2));
		order.setOffer(fieldSet.readString(3));
		order.setBillType(fieldSet.readString(4));
		order.setOrderDate(fieldSet.readDate(5, "dd-MM-yyyy"));
		
		return order;
	}

}
