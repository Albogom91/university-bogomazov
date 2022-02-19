package com.belhard.university;

import java.math.BigDecimal;

import com.belhard.university.exceptions.*;

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
		super();
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
		try {
			if (amount.compareTo(BigDecimal.ZERO) < 0) {
				throw new IllegalSalary("Invalid salary(can't be negative!");
			}
		}catch (Exception e){
			e.printStackTrace();
			return;
		}
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		String name = new String();
		name = String.valueOf(amount) + " " + currency;
		return name;
	}
}


