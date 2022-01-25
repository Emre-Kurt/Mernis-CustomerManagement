package Concrete;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean Check›fRealPerson(Customer customer) {
		
		return true;
	}
	
	

}
