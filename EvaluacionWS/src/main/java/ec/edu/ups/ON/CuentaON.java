package ec.edu.ups.ON;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.DAO.clienteDAO;
import ec.edu.ups.DAO.cuentaDAO;
import ec.edu.ups.modelo.Cuenta;

@Stateless
public class CuentaON {

	
	@Inject
	private cuentaDAO daoc;
	
	//ON crear
	public boolean registrar(Cuenta c) throws Exception {
			
			try {
				daoc.insertJPA(c);
			} catch (SQLException e) {
				e.printStackTrace();
				throw new Exception("Error al registrar");
			}
			return true;
		}
	//ON actualizar
		public boolean actualizar(Cuenta c) throws Exception {
			
			try {
				daoc.updateJPA(c);

			} catch (SQLException e) {
				e.printStackTrace();
				throw new Exception("Error al registrar");
			}
			return true;
		}
	//ON Eliminar
		public boolean eliminar(int id) throws Exception {
			
			try {
				daoc.deleteId(id);
			} catch (SQLException e) {
				e.printStackTrace();
				throw new Exception("Error al registrar");
			}
			return true;
		}
	//ON Buscar
		public Cuenta buscar(int id) throws Exception {
			
			try {
				return  daoc.read(id);
			} catch (SQLException e) {
				e.printStackTrace();
				throw new Exception("Error al registrar");
			}
		}
	
}
