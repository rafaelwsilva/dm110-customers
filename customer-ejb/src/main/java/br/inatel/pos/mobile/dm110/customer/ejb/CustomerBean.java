package br.inatel.pos.mobile.dm110.customer.ejb;

import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.inatel.pos.mobile.dm110.customer.dao.CustomerDAO;
import br.inatel.pos.mobile.dm110.customer.entities.Customer;
import br.inatel.pos.mobile.dm110.customer.interfaces.CustomerLocal;
import br.inatel.pos.mobile.dm110.customer.interfaces.CustomerRemote;

@Stateless
@Local(CustomerLocal.class)
@Remote(CustomerRemote.class)
public class CustomerBean implements CustomerLocal, CustomerRemote {

	@EJB
	private CustomerDAO dao;

	@Override
	public String[] listCustomers() {
		return dao.findAll().stream().map(Customer::getName).collect(Collectors.toList()).toArray(new String[0]);
	}

	@Override
	public String getCustomerByEmail(String email) {
		Customer customer = dao.getCustomerEmail(email);
		return customer.getName();
	}

	@Override
	public void addCustomer(String name, String email) {
		Customer customer = new Customer();
		customer.setName(name);
		customer.setEmail(email);
		dao.insert(customer);
	}

}
