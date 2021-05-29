package com.investment.stock.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="investment_accounts")
public class InvestmentAccounts implements Serializable {

	private static final long serialVersionUID = 6732044685642900038L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "investment_account_id")
	private int investmentAccountId;
	@Column(name = "balance")
	private double balance;
	@Column(name = "customer_id")
	private int customerId;

	public int getInvestmentAccountId() {
		return investmentAccountId;
	}

	public void setInvestmentAccountId(int investmentAccountId) {
		this.investmentAccountId = investmentAccountId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "InvestmentAccounts [investmentAccountId=" + investmentAccountId + ", balance=" + balance
				+ ", customerId=" + customerId + "]";
	}
	
	

}