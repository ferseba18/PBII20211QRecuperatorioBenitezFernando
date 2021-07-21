package ar.edu.unlam.pb2.Transformers;

public class Batalla {
	private Integer identidad;
	private String escuadronA;
	private String escuadronB;
	
	
	public Batalla(Integer identidad, String escuadronA, String escuadronB) {
		this.identidad = identidad;
		this.escuadronA = escuadronA;
		this.escuadronB = escuadronB;
	}
	
	
	public Integer getidentidad() {
		return identidad;
	}

	public String getEscuadronA() {
		return escuadronA;
	}

	public String getEscuadronB() {
		return escuadronB;
	}

}
