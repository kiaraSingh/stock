package com.investment.stock.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investment.stock.repository.StockRepo;

@Service
public class StockServiceImpl {

	@Autowired
	private StockRepo stockRepository;
}
