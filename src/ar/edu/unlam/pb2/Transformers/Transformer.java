package ar.edu.unlam.pb2.Transformers;

import java.util.HashSet;
import java.util.Set;

public class Transformer extends Cybertronian{

	private Faccion faccion;
	private String escuadron;
	private Double Atk;
	private Set<Strike> strikes;
	
	
	public Transformer(Faccion faccion, Integer serial, String nombre,String escuadron,Double Atk) {
		super();
		this.faccion = faccion;
		this.serial = serial;
		this.escuadron = escuadron;
		this.nombre = nombre;
		this.Atk = Atk;
		this.strikes = new HashSet<Strike>();
	}
	

	public void asignarStrike(Strike strike) {
		this.strikes.add(strike);
	}

	public Faccion getFaccion() {

		return faccion;
	}

	public Integer getSerial() {
		return serial;
	}


	public void setSerial(Integer serial) {
		this.serial = serial;
	}


	public String getEscuadron() {
		return escuadron;
	}


	public void setEscuadron(String escuadron) {
		this.escuadron = escuadron;
	}


	public Set<Strike> getStrikes() {
		return strikes;
	}


	public void setStrikes(Set<Strike> strikes) {
		this.strikes = strikes;
	}


	public void setFaccion(Faccion faccion) {
		this.faccion = faccion;
	}

	public Double getAtk() {
		return Atk;
	}


	public void setAtk(Double atk) {
		Atk = atk;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((escuadron == null) ? 0 : escuadron.hashCode());
		result = prime * result + ((faccion == null) ? 0 : faccion.hashCode());
		result = prime * result + ((serial == null) ? 0 : serial.hashCode());
		result = prime * result + ((strikes == null) ? 0 : strikes.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transformer other = (Transformer) obj;
		if (escuadron == null) {
			if (other.escuadron != null)
				return false;
		} else if (!escuadron.equals(other.escuadron))
			return false;
		if (faccion != other.faccion)
			return false;
		if (serial == null) {
			if (other.serial != null)
				return false;
		} else if (!serial.equals(other.serial))
			return false;
		if (strikes == null) {
			if (other.strikes != null)
				return false;
		} else if (!strikes.equals(other.strikes))
			return false;
		return true;
	}
	
	
}
