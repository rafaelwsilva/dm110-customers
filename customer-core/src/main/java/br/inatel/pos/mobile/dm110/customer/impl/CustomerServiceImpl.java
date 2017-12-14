package br.inatel.pos.mobile.dm110.customer.impl;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import br.inatel.pos.mobile.dm110.customer.api.CustomerService;
import br.inatel.pos.mobile.dm110.customer.interfaces.CustomerRemote;

@RequestScoped
public class CustomerServiceImpl implements CustomerService {

	@EJB(lookup = "java:app/customer-ejb-1.0.0-SNAPSHOT/CustomerBean!br.inatel.pos.mobile.dm110.customer.interfaces.CustomerRemote")
	private CustomerRemote customerRemote;

	@Override
	public String[] getCustomers() {
		return customerRemote.listCustomers();
	}

	@Override
	public String customerByEmail(String email) {
		return customerRemote.getCustomerByEmail(email);
	}

	@Override
	public void addCustomer(String name, String email) {
		customerRemote.addCustomer(name, email);
	}

}
