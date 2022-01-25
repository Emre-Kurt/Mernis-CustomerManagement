package ýnterfaceAbstractDemo;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args)  {
		
		
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		
		customerManager.Save(new Customer(1,"yunus emre","kurt",1994,"23797754048"));
		
		
	}

}
