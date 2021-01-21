package ec.edu.ups.ON;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.DAO.clienteDAO;
import ec.edu.ups.modelo.Cliente;

@Stateless
public class ClienteON {

	@Inject
	private clienteDAO daoPersona;
	
	
	//ON crear
	public boolean registrarCliente(Cliente cliente) throws Exception {
			if (cliente.getCedula().length() != 10)
				throw new Exception("La cedula no cumple con la longitud correcta");
			try {
				daoPersona.insertJPA(cliente);
			} catch (SQLException e) {
				e.printStackTrace();
				throw new Exception("Error al registrar");
			}
			return true;
		}
	//ON actualizar
		public boolean actualizarCliente(Cliente cliente) throws Exception {
			if (cliente.getCedula().length() != 10)
				throw new Exception("La cedula no cumple con la longitud correcta");
			try {
				daoPersona.updateJPA(cliente);

			} catch (SQLException e) {
				e.printStackTrace();
				throw new Exception("Error al registrar");
			}
			return true;
		}
	//ON Eliminar
		public boolean eliminarCliente(String cedula) throws Exception {
			if (cedula.length() != 10)
				throw new Exception("La cedula no cumple con la longitud correcta");
			try {
				daoPersona.deleteId(cedula);
			} catch (SQLException e) {
				e.printStackTrace();
				throw new Exception("Error al registrar");
			}
			return true;
		}
	//ON Buscar
		public Cliente buscarPersona(String cedula) throws Exception {
			if (cedula.length() != 10)
				throw new Exception("La cedula no cumple con la longitud correcta");
			try {
				return  daoPersona.read(cedula);
			} catch (SQLException e) {
				e.printStackTrace();
				throw new Exception("Error al registrar");
			}
		}
	//On Buscar lista
	public List<Cliente> buscarCliente(String cedula){
			return  daoPersona.getCliente(cedula);
		}
}
