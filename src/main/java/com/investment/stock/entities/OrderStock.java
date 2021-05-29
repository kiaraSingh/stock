package com.investment.stock.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "order_stock")
public class OrderStock implements Serializable {

	private static final long serialVersionUID = -1861054024458393687L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "quantity")
	private int quantity;
	@Column(name = "price")
	private double price;
	@Column(name = "order_stock_date")
	private LocalDate date;
	@Column(name = "investment_account_id")
	private int investmentAccountsId;
	@Column(name = "stock_id")
	private int stock_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public int getInvestmentAccountsId() {
		return investmentAccountsId;
	}

	public void setInvestmentAccountsId(int investmentAccountsId) {
		this.investmentAccountsId = investmentAccountsId;
	}

	public int getStock_id() {
		return stock_id;
	}

	public void setStock_id(int stock_id) {
		this.stock_id = stock_id;
	}

	@Override
	public String toString() {
		return "OrderStock [id=" + id + ", quantity=" + quantity + ", price=" + price + ", date=" + date
				+ ", investmentAccountsId=" + investmentAccountsId + ", stock_id=" + stock_id + "]";
	}

	

}
