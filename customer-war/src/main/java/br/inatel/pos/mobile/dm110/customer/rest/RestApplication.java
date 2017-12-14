package br.inatel.pos.mobile.dm110.customer.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.inatel.pos.mobile.dm110.customer.impl.CustomerServiceImpl;

@ApplicationPath("/api")
public class RestApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<>();
		classes.add(CustomerServiceImpl.class);

		return classes;
	}
}
