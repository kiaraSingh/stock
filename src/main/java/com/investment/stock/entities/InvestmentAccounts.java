package com.investment.stock.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name = "investment_accounts")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class InvestmentAccounts implements Serializable {

	private static final long serialVersionUID = 6732044685642900038L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "investment_account_id")
	private Integer investmentAccountId;
	@Column(name = "balance")
	private double balance;
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "customer_id", nullable = false)
	private Customer customer;
	@OneToMany(mappedBy = "investmentAccount", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<OrderStock> orderStocks;

	public Integer getInvestmentAccountId() {
		return investmentAccountId;
	}

	public void setInvestmentAccountId(Integer investmentAccountId) {
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