package ec.edu.ups.Service;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import ec.edu.ups.ON.CreditoON;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Credito;
import ec.edu.ups.modelo.Cuenta;

@WebService
public class ClienteSOAP {

	@Inject
	private CreditoON co;
	
	@WebMethod
	public void insertarCredito(Credito credito) {
		try {
			co.insertarCredito(credito);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
