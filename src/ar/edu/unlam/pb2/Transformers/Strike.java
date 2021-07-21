package ar.edu.unlam.pb2.Transformers;



public class Strike {
	private Double ataque;
	private Transformer transformer;
	private String AoB;
	

	public Strike(Transformer transformer, Double ataque, String localOVisitante) {
		this.transformer=transformer;
		this.ataque=ataque;
		this.AoB=AoB;
	}
	
	
	public String getEscuadron() {
		return AoB;
	}

	public Double getAtaque() {
		return ataque;
	}
	
	public Transformer getTransformer() {
		return transformer;
	}
	
}
