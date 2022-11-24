package com.nc.model;

import org.springframework.stereotype.Component;

@Component("DebitCard")
public class DebitCard implements Card {
	
	@Override
	public String getCardDetails() {
		return "Debit card has been issued successfully";
	}

}
