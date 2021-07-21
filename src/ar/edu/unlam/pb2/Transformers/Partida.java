package ar.edu.unlam.pb2.Transformers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public class Partida {
	private String nombrePartida;
	private Map<Integer, Batalla> batallas;
	private Set<Transformer> transformers;
	private Set<Strike> strikes;
	
	
	public Partida(String nombrePartido) {
		this.nombrePartida = nombrePartido;
		this.batallas = new HashMap<Integer, Batalla>();
		this.transformers = new HashSet<Transformer>();
		this.strikes = new TreeSet<Strike>();
	}
	
	
	public Boolean MandarABatalla(Transformer Trans) {
		return this.transformers.add(Trans);
	}
	
	public void iniciarBatalla(Integer identidad, String escuadronA, String escuadronB) {
		this.batallas.put(identidad, new Batalla(identidad, escuadronA, escuadronB));
	}
	
	Transformer buscarPorSerie(Integer serie) {
		for (Transformer transformer : transformers) {
			if (transformer.getSerial().equals(serie)) {
				return transformer;
			}
		}
		return null;
	}
	public Boolean contarStrike(Transformer transformer1, Transformer transformer2, Strike Strike) throws TransformerNotExistingException {
		
	Transformer Transformerv1 = buscarPorSerie(transformer1.getSerial());
	Transformer Transformerv2 = buscarPorSerie(transformer2.getSerial());
      Boolean Asignado=false;
		if ((Transformerv1 != null) && (Transformerv2 != null))  {
			if (Strike.getEscuadron() != null) {
                if(Transformerv1.getAtk()>Transformerv2.getAtk()) {
				Transformerv1.asignarStrike(Strike);
				Asignado=true;}
                else {
                	Transformerv2.asignarStrike(Strike);
    				Asignado=true;
                }
				return this.strikes.add(Strike);
                    
			} else {

				throw new TransformerNotExistingException("El Transformer No Existe");

			}
		} 
			return Asignado;
	}
	


	public Transformer confirmarStrike(double d, Transformer transformer){
		for (Strike strike : strikes) {
			if (strike.getAtaque().equals(d) && (strike.getTransformer()== transformer)) {
				return strike.getTransformer();
			}
		}
		return null;
	}
	
	
	public String DeterminarVictoria() {

		Integer strikesA = 0;
		Integer strikesB = 0;

		for (Strike strike : strikes) {
			switch (strike.getEscuadron()) {
			case "Escuadron A":

				strikesA++;

				break;

			case "Escuadron B":

				strikesB++;

				break;

			default:
				break;
			}
		}

		if (strikesA > strikesB) {
			return "VICTORIA:el escuadron A";
		}
		if (strikesA < strikesB) {
			return "VICTORIA: el escuadron B";
		}
		if (strikesA == strikesB) {
			return "EMPATE";
			}

		return "";
	}


	public Batalla getBatalla(Integer batalla) {
		return this.batallas.get(batalla);
	}
	
	
}
