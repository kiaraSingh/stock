package com.investment.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.investment.stock.entities.InvestmentAccounts;
import com.investment.stock.exceptionhandler.InvestmentAccountsNotFoundException;
import com.investment.stock.service.InvestmentAccountService;


@RestController
public class InvestmentAccountsController {

	@Autowired
	private InvestmentAccountService investmentAccountService;

	@GetMapping("/investments/v1/customers/{id}/investmentaccounts")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<List<InvestmentAccounts>> getInvestmentAccounts(@PathVariable Integer id) {
		List<InvestmentAccounts> investmentAccountsList =  investmentAccountService.getInvestmentAccountsByCustomerId(id);
		if(investmentAccountsList.isEmpty()) {
			throw new InvestmentAccountsNotFoundException(id);
		}
		return ResponseEntity.accepted().body(investmentAccountsList);
	}

}
