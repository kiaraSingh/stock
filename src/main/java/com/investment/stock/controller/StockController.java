package com.investment.stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.investment.stock.service.StockService;

@RestController
public class StockController {

	@Autowired
	private StockService stockService;
	
	
}
