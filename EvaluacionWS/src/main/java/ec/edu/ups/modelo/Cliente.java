package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cliente implements Serializable{
	private static final long serialVersionUID=1L;
	@Id
	private String cedula;
	private String nombre;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
	private List<Cuenta> ingreso=new ArrayList<Cuenta>();
	
	
	
	public List<Cuenta> getIngreso() {
		return ingreso;
	}
	public void setIngreso(List<Cuenta> ingreso) {
		this.ingreso = ingreso;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
