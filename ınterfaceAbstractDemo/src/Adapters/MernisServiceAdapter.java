package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean Check?fRealPerson(Customer customer) {
		
	KPSPublicSoapProxy client=new KPSPublicSoapProxy();
	try {
		return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationality?d()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(), customer.getDateOfBirth());
	} catch (RemoteException e) {
		
		e.printStackTrace();
	}
	return false;
	}

}
