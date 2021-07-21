package ar.edu.unlam.pb2.Transformers;

import java.util.Set;
import java.util.TreeSet;


public class Escuadron {
	private String nombre;
	private Set<Transformer> transformers;
	
	
	public Escuadron(String nombre) {
		this.nombre = nombre;
		this.transformers = new TreeSet<Transformer>();
	}
	
	
	public void reclutar(Transformer transformers) {
		this.transformers.add(transformers);
	}

	public Integer cantidadDeCombatientes() {
		return this.transformers.size();
	}
	
	
}
