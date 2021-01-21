package ec.edu.ups.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ec.edu.ups.modelo.Cuenta;

@Stateless
public class cuentaDAO {

	
	@Inject
	private Connection con;
	@Inject
	private EntityManager em;
	
	//DAO crear
	public boolean insertJPA(Cuenta entity) throws SQLException {
			em.persist(entity);
			return true;
		}
	
	//DAO actualizar
		public void updateJPA(Cuenta cuenta) throws Exception {
	        try {
	            em.merge(cuenta);
	        } catch (Exception e) {
	            throw new Exception("Erro actualizar Cuenta " +e.getMessage());
	        }
	    }
		
	//DAO borrar
	    public void deleteId(int id) throws Exception {
	        try {
	            em.remove(read(id));
	        } catch (Exception e) {
	            throw new Exception("Error Eliminar Cuenta " +e.getMessage());
	        }
	    }

	//DAO buscar
	    public Cuenta read(int id) throws Exception {
	        try {
	            return em.find(Cuenta.class, id);
	        } catch (Exception e) {
	            throw new Exception("Erro leer Cuenta " +e.getMessage());
	        }
	    }



	//NOOO DAO buscar debuelve lista este no se esta usando
	/*	public List<Cuenta> getClientes(int id) {
			String jpql= "Select c from Cuenta c where c.id =?1";
			Query q = em.createQuery(jpql, Cuenta.class);
			q.setParameter(1, id);
			return (List<Cuenta>) q.getResultList();
		}*/
	
	
}
