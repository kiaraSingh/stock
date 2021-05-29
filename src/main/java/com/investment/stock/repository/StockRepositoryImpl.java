/*package com.investment.stock.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import com.investment.stock.entities.Stock;

@Repository
@Transactional
public class StockRepositoryImpl <T, ID extends Serializable>
  										extends SimpleJpaRepository<T, ID> implements StockRepo<T, ID> {
    
    public StockRepositoryImpl(Class<T> domainClass, EntityManager em) {
		super(domainClass, em);
	}

	private EntityManager entityManager;

	public StockRepositoryImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
		super(entityInformation, entityManager);
		this.entityManager = entityManager;
	}

	@Override
	public List<Stock> findByInvestmentAccountId(int investmentAccountId) {

		TypedQuery<Stock> query = entityManager.createQuery("select a from stock a where a.customer = ?1", Stock.class);
		query.setParameter(1, investmentAccountId);

		return query.getResultList();
	}
}
*/