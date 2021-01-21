package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Cuenta implements Serializable{
	private static final long serialVersionUID=1L;
	@Id
	private int numcuenta;
	private double monto;
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	@ManyToOne
	@JoinColumn
	private Cliente cliente;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cuenta")
	private List<Credito> ingreso=new ArrayList<Credito>();
	
	public int getNumcuenta() {
		return numcuenta;
	}
	public void setNumcuenta(int numcuenta) {
		this.numcuenta = numcuenta;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Credito> getIngreso() {
		return ingreso;
	}
	public void setIngreso(List<Credito> ingreso) {
		this.ingreso = ingreso;
	}
	
	
	
	
}
