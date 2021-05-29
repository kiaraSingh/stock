package com.investment.stock.exceptionhandler;

public class InvestmentAccountsNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 8194700151567558495L;

	public InvestmentAccountsNotFoundException(Integer id) {
		super("Could not find InvestmentAccounts Details for customer: " + id);
	}
}

