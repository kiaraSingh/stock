package com.investment.stock.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investment.stock.entities.OrderStock;
import com.investment.stock.repository.PortfoliorRepository;
import com.investment.stock.response.pojo.Portfolio;

@Service
public class PortfolioService {

	@Autowired
	PortfoliorRepository portfoliorRepository;
	
	public List<Portfolio> getPortfolios(String id){
		 List<OrderStock> orderStocks = portfoliorRepository.findStocksByInvestmentAccountId(Integer.valueOf(id));
		 List<Portfolio> portfolios=new ArrayList<>();
		 for(OrderStock orderStock:orderStocks) {
			 Portfolio portfolio=new Portfolio();
			 portfolio.setPrice(orderStock.getPrice());
			 portfolio.setQuantity(orderStock.getQuantity());
			 getPortfolioValue(orderStock);
			 portfolio.setValue(getPortfolioValue(orderStock));
			 
			 portfolios.add(portfolio);
		 }
		 return portfolios;
	}

	private double getPortfolioValue(OrderStock orderStock) {
		return orderStock.getPrice() * orderStock.getQuantity();
	}
	
}
