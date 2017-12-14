package br.inatel.pos.mobile.dm110.customer.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.inatel.pos.mobile.dm110.customer.entities.Customer;

@Stateless
public class CustomerDAO {
	
	@PersistenceContext(unitName = "customer")
	private EntityManager em;

	public void insert(Customer customer) {
		em.persist(customer);
	}

	public List<Customer> findAll() {
		return em.createQuery("from Customer c", Customer.class).getResultList();
	}
	
	public Customer getCustomerEmail(String email) {
		return em.createQuery("from Customer c where email = '" + email + "'", Customer.class).getSingleResult();
	}
	
	public void addCustomer(Customer customer) {
		em.persist(customer);
	}

}
