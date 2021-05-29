package com.investment.stock.service.impl;

import com.investment.stock.entities.Stock;
import com.investment.stock.repository.StockRepository;
import com.investment.stock.service.StockService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockServiceImpl implements StockService {

	@Autowired
	private StockRepository stockRepository;
	
	@Override
	public List<Stock> findByInvestmentAccountId(int investmentAccountId) {
		
		return stockRepository.findByInvestmentAccountId(investmentAccountId);
	}

}
