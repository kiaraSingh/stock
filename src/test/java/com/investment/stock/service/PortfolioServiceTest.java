package com.investment.stock.service;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.investment.stock.entities.OrderStock;
import com.investment.stock.repository.OrderStockRepository;
import com.investment.stock.response.pojo.Portfolio;

public class PortfolioServiceTest {


	/**
	 * Test with valid data
	 */
	@Test
	public void test1()throws Exception {
		ObjectMapper om=new ObjectMapper();
		String portfolioJson="{\"id\":401,\"quantity\":4,\"price\":12.0,\"investmentAccount\":{\"id\":201},\"stock\":{\"stockName\":\"tesla\"}}";
		
		OrderStockRepository repo=mock(OrderStockRepository.class);
		OrderStock orderStock=om.readValue(portfolioJson, OrderStock.class);
		List<OrderStock> orderStocks=new ArrayList<>();
		orderStocks.add(orderStock);
		
		when(repo.findOrderStocksByInvestmentAccountId(201)).thenReturn(orderStocks);
		
		PortfolioService service=new PortfolioService(repo);
		List<Portfolio> portfolios = service.getPortfolios("201");
		
		assertEquals("tesla", portfolios.get(0).getName());
	}
	

	/**
	 * return empty array when there is no investment accountId match
	 */
	@Test
	public void test2()throws Exception {
		
		OrderStockRepository repo=mock(OrderStockRepository.class);
		List<OrderStock> orderStocks=new ArrayList<>();
		
		when(repo.findOrderStocksByInvestmentAccountId(201)).thenReturn(orderStocks);
		
		PortfolioService service=new PortfolioService(repo);
		List<Portfolio> portfolios = service.getPortfolios("201");
		
		assertTrue(portfolios.size()==0);
	}

}
