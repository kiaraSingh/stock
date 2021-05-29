package com.investment.stock.controller;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.investment.stock.entities.InvestmentAccounts;
import com.investment.stock.service.InvestmentAccountService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class InvestmentAccountsControllerTest {
	
	@Autowired
	private InvestmentAccountsController investmentAccountsController;
	
	@Autowired
	private InvestmentAccountService investmentAccountService;
		
	List<InvestmentAccounts> investmentAccountList;

	@BeforeEach
	void setUp() throws Exception {
		investmentAccountList =  new ArrayList<InvestmentAccounts>();
		InvestmentAccounts investmentAccounts = new InvestmentAccounts();
		investmentAccounts.setCustomerId(1);
		investmentAccounts.setInvestmentAccountId(1);
		investmentAccounts.setBalance(100);
	}

	@Test
	void testGetInvestmentAccounts() {
		assertNotNull(investmentAccountsController.getInvestmentAccounts(1));
	}
	
	@Test
	void testGetInvestmentAccountsException() {
		assertNotNull(investmentAccountsController.getInvestmentAccounts(100));
	}

}
