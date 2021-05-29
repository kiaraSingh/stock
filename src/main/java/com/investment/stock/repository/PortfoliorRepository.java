package com.investment.stock.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.investment.stock.entities.OrderStock;

public interface PortfoliorRepository extends PagingAndSortingRepository<OrderStock, Integer>{
	@Query("select os from OrderStock os where investment_account_id=:id")
	public List<OrderStock> findStocksByInvestmentAccountId(Integer id);
	
	
	
}	
