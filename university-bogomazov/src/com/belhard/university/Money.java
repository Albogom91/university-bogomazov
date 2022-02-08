package com.belhard.university;

import java.math.BigDecimal;

public class Money {
	private Currency currency;
	private BigDecimal amount;
	
	public enum Currency{
		USD,
		$,
		DOLLAR,
		DOLLARS,
	}
	
	public Money(Currency currency, BigDecimal amount) {
		this.currency = currency;
		setAmount(amount);
	}
	
	public Currency getGurrency() {
		return currency;
	}
	
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	
	public BigDecimal getAmount() {
		return amount;
	}
	
	public void setAmount(BigDecimal amount) {
		if (amount.compareTo(BigDecimal.ZERO) > 0) {
			this.amount = amount;
		}
	}
}


