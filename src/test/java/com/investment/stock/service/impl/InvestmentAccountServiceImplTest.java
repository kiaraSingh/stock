package com.investment.stock.service.impl;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.investment.stock.entities.InvestmentAccounts;
import com.investment.stock.repository.InvestmentAccountsRepository;
import com.investment.stock.service.InvestmentAccountService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class InvestmentAccountServiceImplTest {
	
	@Autowired
	private InvestmentAccountService investmentAccountService;
	
	@Test
	void testGetInvestmentAccountsByCustomerId() {
		assertNotNull(investmentAccountService.getInvestmentAccountsByCustomerId(1));
	}

}
