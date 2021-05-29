package com.investment.stock.advices;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.investment.stock.exceptionhandler.CustomerNotFoundException;
import com.investment.stock.exceptionhandler.InvestmentAccountsNotFoundException;


@ControllerAdvice
public class InvestmentAccountsNotFoundAdvice {

	@ResponseBody
	@ExceptionHandler(InvestmentAccountsNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String investmentAccountsNotFoundExceptionHandler(InvestmentAccountsNotFoundException ex) {
		return ex.getMessage();
	}
}