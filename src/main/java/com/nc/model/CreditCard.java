package com.nc.model;

import org.springframework.stereotype.Component;


public class CreditCard implements Card{

	@Override
	public String getCardDetails() {
		return "Credit card has been issued successfully";
	}
}
