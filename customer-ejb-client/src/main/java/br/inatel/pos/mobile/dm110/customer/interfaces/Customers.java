package br.inatel.pos.mobile.dm110.customer.interfaces;

public interface Customers {
	
	String[] listCustomers();
	
	String getCustomerByEmail(String email);
	
	void addCustomer(String name, String email);

}
