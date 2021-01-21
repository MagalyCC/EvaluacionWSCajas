package ec.edu.ups.ON;

import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.DAO.clienteDAO;
import ec.edu.ups.DAO.creditoDAO;
import ec.edu.ups.DAO.cuentaDAO;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Credito;
import ec.edu.ups.modelo.Cuenta;

@Stateless
public class CreditoON {

	@Inject
	private cuentaDAO daocuenta;
	
	@Inject
	private clienteDAO daocli;
	
	@Inject
	private creditoDAO daoc;
	
	
	
	public void insertar(Cliente entity) {
		try {
			
			daocli.insertJPA(entity);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void insertar(Cuenta entity) {
		try {
			
			daocuenta.insertJPA(entity);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
		public void insertarCredito(Credito credito)throws Exception{
			try {
				Cliente cli=credito.getCliente();
				Cuenta cu=credito.getCuenta();
				daocli.insertJPA(cli);
				daocuenta.insertJPA(cu);
				daoc.insertJPA(credito);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new Exception("Error al registrar");
			}
		}
	
		
}
