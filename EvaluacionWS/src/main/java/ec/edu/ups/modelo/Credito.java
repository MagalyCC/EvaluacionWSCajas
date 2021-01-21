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
public class Credito implements Serializable{
	private static final long serialVersionUID=1L;
	
	@Id
	private int credito;
	
	@ManyToOne
	@JoinColumn
	private Cliente cliente;
	@ManyToOne
	@JoinColumn
	private Cuenta cuenta;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date plazo;
	
	
	public Date getPlazo() {
		return plazo;
	}
	public void setPlazo(Date plazo) {
		this.plazo = plazo;
	}
	public int getCredito() {
		return credito;
	}
	public void setCredito(int credito) {
		this.credito = credito;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Cuenta getCuenta() {
		return cuenta;
	}
	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	
	
}
