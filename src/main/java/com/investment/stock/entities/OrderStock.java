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
	private int qunatity;
	private double price;
	private LocalDate date;

	@OneToMany(mappedBy = "investment_account")
	private InvestmentAccounts investmentAccounts;
	@OneToMany(mappedBy = "stock")
	private Stock stock;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQunatity() {
		return qunatity;
	}

	public void setQunatity(int qunatity) {
		this.qunatity = qunatity;
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

	public InvestmentAccounts getInvestmentAccounts() {
		return investmentAccounts;
	}

	public void setInvestmentAccounts(InvestmentAccounts investmentAccounts) {
		this.investmentAccounts = investmentAccounts;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "OrderStock [id=" + id + ", qunatity=" + qunatity + ", price=" + price + ", date=" + date
				+ ", investmentAccounts=" + investmentAccounts + ", stock=" + stock + "]";
	}

}
