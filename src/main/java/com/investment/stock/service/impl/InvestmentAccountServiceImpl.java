package com.investment.stock.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investment.stock.entities.InvestmentAccounts;
import com.investment.stock.repository.InvestmentAccountsRepository;
import com.investment.stock.service.InvestmentAccountService;

@Service
public class InvestmentAccountServiceImpl implements InvestmentAccountService {
	
	@Autowired
	private InvestmentAccountsRepository investmentAccountsRepository;

	@Override
	public List<InvestmentAccounts> getInvestmentAccountsByCustomerId(Integer customerId) {
		return investmentAccountsRepository.findInvestmentAccountsByCustomerId(customerId);
	}
	
	
	


}
