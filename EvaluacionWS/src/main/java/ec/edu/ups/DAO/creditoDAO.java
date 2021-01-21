package ec.edu.ups.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ec.edu.ups.modelo.Credito;

@Stateless
public class creditoDAO {

	
	@Inject
	private Connection con;
	@Inject
	private EntityManager em;
	
	//DAO crear
	public boolean insertJPA(Credito entity) throws SQLException {
			em.persist(entity);
			return true;
		}
	
	//DAO actualizar
		public void updateJPA(Credito cuenta) throws Exception {
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
	    public Credito read(int id) throws Exception {
	        try {
	            return em.find(Credito.class, id);
	        } catch (Exception e) {
	            throw new Exception("Erro leer Cuenta " +e.getMessage());
	        }
	    }



	
}
