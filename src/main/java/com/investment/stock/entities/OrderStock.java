package com.investment.stock.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name = "order_stock")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class OrderStock implements Serializable {

	private static final long serialVersionUID = -1861054024458393687L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "quantity")
	private int quantity;
	@Column(name = "price")
	private double price;
	@Column(name = "order_stock_date") 
    @JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate date;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "investment_account_id", nullable = false)
	private InvestmentAccounts investmentAccount;
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "stock_id", nullable = false)
	private Stock stock;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getQunatity() {
		return quantity;
	}

	public void setQunatity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public InvestmentAccounts getInvestmentAccount() {
		return investmentAccount;
	}

	public void setInvestmentAccount(InvestmentAccounts investmentAccount) {
		this.investmentAccount = investmentAccount;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

}
