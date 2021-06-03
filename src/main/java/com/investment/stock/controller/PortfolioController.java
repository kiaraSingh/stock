package com.investment.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.investment.stock.response.pojo.Portfolio;
import com.investment.stock.service.PortfolioService;

@RestController
@RequestMapping("/investments")
public class PortfolioController {
	@Autowired
	PortfolioService portfolioService;
	
	@GetMapping("investmentaccounts/{id}/portfolios")
	public List<Portfolio> getPortifolio(@PathVariable("id") String id) {
		return portfolioService.getPortfolios(id);
	}
	

}
