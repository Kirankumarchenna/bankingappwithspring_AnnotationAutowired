package com.nc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component("SavingsAccount")
public class SavingsAccount implements Account {
	
	private Card card;
	
	public Card getCard() {
		return card;
	}
	@Autowired
	public void setCard(Card card) {
		this.card = card;
	}
	
	@Override
	public String createAccount() {
		return "Savings Account has been created successfully........";
	}

}
