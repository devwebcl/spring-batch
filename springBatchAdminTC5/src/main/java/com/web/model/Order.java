package com.web.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.web.validator.AcceptedValues;


public class Order implements Serializable {

	private static final long serialVersionUID = 1853355651832301663L;

	@Size(min = 5, max = 5, message = "Invalid code value")
	private String code;
	
	@AcceptedValues(acceptValues = { "fix", "mobile", "bundle", "internet" }, message = "Invalid service type")
	private String serviceType;

	@Min(value = 1, message = "Quantity less than 1")
	@Max(value = 9, message = "Quantity more than 9")
	private int quantity;
	
	@AcceptedValues(acceptValues = { "small", "medium", "large", "fiber32" }, message = "Invalid offer")
	private String offer;

	@AcceptedValues(acceptValues = { "prepaid", "postpaid_mail","postpaid_email" }, message = "Invalid bill type")
	private String billType;

	@NotNull(message = "Date is required")
	@Past(message = "Order date should be in the past")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date orderDate;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getOffer() {
		return offer;
	}

	public void setOffer(String offer) {
		this.offer = offer;
	}

	public String getBillType() {
		return billType;
	}

	public void setBillType(String billType) {
		this.billType = billType;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Order [code=" + code + ", type=" + serviceType + ", quantity="
				+ quantity + ", offer=" + offer + ", billType=" + billType
				+ ", orderDate=" + orderDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((billType == null) ? 0 : billType.hashCode());
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((offer == null) ? 0 : offer.hashCode());
		result = prime * result
				+ ((orderDate == null) ? 0 : orderDate.hashCode());
		result = prime * result + quantity;
		result = prime * result
				+ ((serviceType == null) ? 0 : serviceType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (billType == null) {
			if (other.billType != null)
				return false;
		} else if (!billType.equals(other.billType))
			return false;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (offer == null) {
			if (other.offer != null)
				return false;
		} else if (!offer.equals(other.offer))
			return false;
		if (orderDate == null) {
			if (other.orderDate != null)
				return false;
		} else if (!orderDate.equals(other.orderDate))
			return false;
		if (quantity != other.quantity)
			return false;
		if (serviceType == null) {
			if (other.serviceType != null)
				return false;
		} else if (!serviceType.equals(other.serviceType))
			return false;
		return true;
	}

}
