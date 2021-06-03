package com.investment.stock.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investment.stock.entities.OrderStock;
import com.investment.stock.repository.OrderStockRepository;
import com.investment.stock.response.pojo.Portfolio;

@Service
public class PortfolioService {

	
	OrderStockRepository orderStockRepository;

	@Autowired
	public PortfolioService(OrderStockRepository orderStockRepository) {
		this.orderStockRepository=orderStockRepository;
 	}

	public List<Portfolio> getPortfolios(String id) {

		List<OrderStock> orderStocks = orderStockRepository.findOrderStocksByInvestmentAccountId(Integer.valueOf(id));
		
		return orderStocks.stream().map(orderStock -> createPortfolio(orderStock)).collect(Collectors.toList());
	}

	private Portfolio createPortfolio(OrderStock orderStock) {
		Portfolio portfolio = new Portfolio();
		portfolio.setName(orderStock.getStock().getStockName());
		portfolio.setPrice(orderStock.getPrice());
		portfolio.setQuantity(orderStock.getQunatity());
		getPortfolioValue(orderStock);
		portfolio.setValue(getPortfolioValue(orderStock));
		return portfolio;
	}

	private double getPortfolioValue(OrderStock orderStock) {
		return  orderStock.getPrice() * orderStock.getQunatity();
	}

}
