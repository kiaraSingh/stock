package com.investment.stock.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.investment.stock.response.pojo.Portfolio;
import com.investment.stock.service.PortfolioService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = PortfolioController.class)
public class PortfolioControllerTest {
	private final ObjectMapper om = new ObjectMapper();

	@MockBean
	PortfolioService portfolioService;
	@Autowired
	private MockMvc mvc;
	

	/**
	 * 
	 * Test with valid data
	 */
	@Test
	public void test1()throws Exception {
		String portfolioJson = "[{\"name\":\"Apple\",\"quantity\":10,\"price\":12.0,\"value\":120.0},{\"name\":\"Tesla\",\"quantity\":14,\"price\":18.0,\"value\":252.0}]";
		List<Portfolio> portfolios = om.readValue(portfolioJson, new TypeReference<List<Portfolio>>() {
		});
		
		when(portfolioService.getPortfolios("201")).thenReturn(portfolios);
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
				"/investments/investmentaccounts/201/portfolios").accept(
				MediaType.APPLICATION_JSON);
		MvcResult result = mvc.perform(requestBuilder).andReturn();
		assertEquals(portfolioJson,result.getResponse().getContentAsString());

	}
}
