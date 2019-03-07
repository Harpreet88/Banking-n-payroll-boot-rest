package com.cg.banking.daoservices;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.banking.beans.Transaction;
@Component("transactionDAO")
public class TransactionDAOImpl implements TransactionDAO{
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public Transaction save(Transaction transaction) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(transaction);
		entityManager.getTransaction().commit();
		entityManager.close();
		return transaction;

	}

	@Override
	public boolean update(Transaction transaction) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(transaction);
		entityManager.getTransaction().commit();
		entityManager.close();
		return true;
	}

	@Override
	public Transaction findOne(int transactionId) {
		return entityManagerFactory.createEntityManager().find(Transaction.class, transactionId);
	}

	@Override
	public List<Transaction> findAll() {
		Query query= entityManagerFactory.createEntityManager().createQuery("from Transaction a",Transaction.class);
		return query.getResultList();
	}	

}
