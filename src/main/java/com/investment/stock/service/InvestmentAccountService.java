package com.investment.stock.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.investment.stock.entities.InvestmentAccounts;


public interface InvestmentAccountService {

	List<InvestmentAccounts> getInvestmentAccountsByCustomerId(Integer customerId);

}
