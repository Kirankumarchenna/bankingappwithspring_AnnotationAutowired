package com.nc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component("CurrentAccount")
public class CurrentAccount implements Account{
	
	private Card card;
	
	public Card getCard() {
		return card;
	}
	@Autowired
	
	public CurrentAccount(Card card ) {
		this.card = card;
	}
	
	@Override
	public String createAccount() {
		return "Current Account has been Created.........";
	}
}
