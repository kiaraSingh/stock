package com.investment.stock.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class InvestmentAccounts {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "investmentaccountid")
	private int investmentAccountId;
	private double balance;
	@OneToMany(mappedBy = "customerid")
	private Customer customer;
	
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
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
}
