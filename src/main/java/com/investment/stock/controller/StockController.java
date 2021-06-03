//package com.investment.stock.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.investment.stock.entities.Stock;
//import com.investment.stock.service.StockService;
//
//import lombok.extern.slf4j.Slf4j;
//
//@RestController
//@RequestMapping("/investments/v1")
//@Slf4j
//public class StockController {
//
//	@Autowired
//	private StockService stockService;
//	
//	@GetMapping("/investmentaccounts/{id}/stocks")
//	public List<Stock> getStocks(@PathVariable int id) {
//		return stockService.findByInvestmentAccountId(id);
//	}
//}
