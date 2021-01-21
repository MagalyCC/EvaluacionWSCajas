package ec.edu.ups.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.modelo.Cliente;

@Stateless
public class clienteDAO {
	
	@Inject
	private Connection con;
	@Inject
	private EntityManager em;
	
	//DAO crear
	public boolean insertJPA(Cliente entity) throws SQLException {
			em.persist(entity);
			return true;
		}
	//DAO actualizar
		public void updateJPA(Cliente cliente) throws Exception {
	        try {
	            em.merge(cliente);
	        } catch (Exception e) {
	            throw new Exception("Error actualizar Cliente " +e.getMessage());
	        }
	    }
		
	//DAO borrar
	    public void deleteId(String cedula) throws Exception {
	        try {
	            em.remove(read(cedula));
	        } catch (Exception e) {
	            throw new Exception("Error Eliminar Cliente " +e.getMessage());
	        }
	    }

	//DAO buscar
	    public Cliente read(String cedula) throws Exception {
	        try {
	            return em.find(Cliente.class, cedula);
	        } catch (Exception e) {
	            throw new Exception("Erro leer Cliente " +e.getMessage());
	        }
	    }


	//NOOO DAO buscar debuelve lista este no se esta usando
		public List<Cliente> getCliente(String cedula) {
			String jpql= "Select c from Cliente c where c.cedula =?1";
			Query q = em.createQuery(jpql, Cliente.class);
			q.setParameter(1, cedula);
			return (List<Cliente>) q.getResultList();
		}
	

}
