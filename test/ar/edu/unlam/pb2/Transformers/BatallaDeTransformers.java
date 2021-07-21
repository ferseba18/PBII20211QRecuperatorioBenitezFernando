package ar.edu.unlam.pb2.Transformers;

import static org.junit.Assert.*;

import org.junit.Test;


public class BatallaDeTransformers {

	@Test
	public void queSePuedanAgregarTransformers() {
		Escuadron DinastyOfPrimes = new Escuadron("DnPrime");

		Transformer Optimus = new Transformer(Faccion.AUTOBOT,5712385, "Optimus Prime", "DinastyOfPrimes", 120.0);
		Transformer Zeta = new Transformer(Faccion.AUTOBOT,32278, "Zeta Prime","DinastyOfPrimes", 110.0);
		Transformer Sentinel = new Transformer(Faccion.AUTOBOT,36972, "Sentinel Prime","DinastyOfPrimes", 90.0);
		Transformer Nova = new Transformer(Faccion.AUTOBOT,573571, "Nova Prime","DinastyOfPrimes", 140.0);
		Transformer Rodimus = new Transformer(Faccion.AUTOBOT,64238, "Rodimus Prime","DinastyOfPrimes", 132.0);
		Transformer Vector = new Transformer(Faccion.AUTOBOT,3, "Vector Prime","DinastyOfPrimes", 170.0);
		DinastyOfPrimes.reclutar(Optimus);
		DinastyOfPrimes.reclutar(Zeta);
		DinastyOfPrimes.reclutar(Sentinel);
		DinastyOfPrimes.reclutar(Nova);
		DinastyOfPrimes.reclutar(Rodimus);
		DinastyOfPrimes.reclutar(Vector);
		assertEquals((Integer)6, DinastyOfPrimes.cantidadDeCombatientes());
		
	}
	
	@Test
	public void queNoSePuedanAgregarUnTransformerRepetido() {
		Escuadron DinastyOfPrimes = new Escuadron("DnPrime");

		Transformer Optimus = new Transformer(Faccion.AUTOBOT,5712385, "Optimus Prime", "DinastyOfPrimes", 120.0);
		Transformer Zeta = new Transformer(Faccion.AUTOBOT,32278, "Zeta Prime","DinastyOfPrimes", 110.0);
		Transformer Sentinel = new Transformer(Faccion.AUTOBOT,36972, "Sentinel Prime","DinastyOfPrimes", 90.0);
		Transformer Nova = new Transformer(Faccion.AUTOBOT,573571, "Nova Prime","DinastyOfPrimes", 140.0);
		Transformer Rodimus = new Transformer(Faccion.AUTOBOT,64238, "Rodimus Prime","DinastyOfPrimes", 132.0);
		Transformer Vector = new Transformer(Faccion.AUTOBOT,3, "Vector Prime","DinastyOfPrimes", 170.0);
		DinastyOfPrimes.reclutar(Optimus);
		DinastyOfPrimes.reclutar(Zeta);
		DinastyOfPrimes.reclutar(Sentinel);
		DinastyOfPrimes.reclutar(Vector);
		DinastyOfPrimes.reclutar(Nova);
		DinastyOfPrimes.reclutar(Rodimus);
		DinastyOfPrimes.reclutar(Vector);
		
		assertEquals((Integer)6, DinastyOfPrimes.cantidadDeCombatientes());

		
	}
	
	@Test
	public void CrearUnaPartida() {
		
		Escuadron DinastyOfPrimes = new Escuadron("DnPrime");

		Transformer Optimus = new Transformer(Faccion.AUTOBOT,5712385, "Optimus Prime", "DinastyOfPrimes", 120.0);
		Transformer Zeta = new Transformer(Faccion.AUTOBOT,32278, "Zeta Prime","DinastyOfPrimes", 110.0);
		Transformer Sentinel = new Transformer(Faccion.AUTOBOT,36972, "Sentinel Prime","DinastyOfPrimes", 90.0);
		Transformer Nova = new Transformer(Faccion.AUTOBOT,573571, "Nova Prime","DinastyOfPrimes", 140.0);
		Transformer Rodimus = new Transformer(Faccion.AUTOBOT,64238, "Rodimus Prime","DinastyOfPrimes", 132.0);
		Transformer Vector = new Transformer(Faccion.AUTOBOT,3, "Vector Prime","DinastyOfPrimes", 170.0);
		DinastyOfPrimes.reclutar(Optimus);
		DinastyOfPrimes.reclutar(Zeta);
		DinastyOfPrimes.reclutar(Sentinel);
		DinastyOfPrimes.reclutar(Vector);
		DinastyOfPrimes.reclutar(Nova);
		DinastyOfPrimes.reclutar(Rodimus);
		
		Escuadron CouncilOfDecepticons = new Escuadron("CdDecepticons");

		Transformer Megatron = new Transformer(Faccion.DECEPTICON,12345, "Megatron","CdDecepticons",120.0);
		Transformer Caido = new Transformer(Faccion.DECEPTICON,32278, "Megatronus Prime","CdDecepticons",120.0);
		Transformer Deathsaurus = new Transformer(Faccion.DECEPTICON,36972, "Deathsaurus","CdDecepticons",120.0);
		Transformer Zarak = new Transformer(Faccion.DECEPTICON,573571, "Scorponok","CdDecepticons",120.0);
		Transformer Ransack = new Transformer(Faccion.DECEPTICON,64238, "Ransanck","CdDecepticons",120.0);
		Transformer Scourge = new Transformer(Faccion.DECEPTICON,3, "Scourge","CdDecepticons",120.0);
		CouncilOfDecepticons.reclutar(Megatron);
		CouncilOfDecepticons.reclutar(Caido);
		CouncilOfDecepticons.reclutar(Deathsaurus);
		CouncilOfDecepticons.reclutar(Zarak);
		CouncilOfDecepticons.reclutar(Ransack);
		CouncilOfDecepticons.reclutar(Scourge);
		
		
		Partida VUnicron = new Partida("contra los heraldos de unicron");
		VUnicron.MandarABatalla(Ransack);
		VUnicron.MandarABatalla(Vector);
		VUnicron.MandarABatalla(Optimus);
		VUnicron.MandarABatalla(Megatron);
		
		
		
		VUnicron.iniciarBatalla(564, "DinastyOfPrimes", "CdDecepticons");
		assertEquals("DinastyOfPrimes", VUnicron.getBatalla(1232).getEscuadronA());
		assertEquals("CdDecepticons", VUnicron.getBatalla(1232).getEscuadronB());
		
	}
	
	@Test
	public void queTomeUnStrike() throws TransformerNotExistingException{
		Escuadron DinastyOfPrimes = new Escuadron("DnPrime");

		Transformer Optimus = new Transformer(Faccion.AUTOBOT,5712385, "Optimus Prime", "DinastyOfPrimes", 120.0);
		Transformer Zeta = new Transformer(Faccion.AUTOBOT,32278, "Zeta Prime","DinastyOfPrimes", 110.0);
		Transformer Sentinel = new Transformer(Faccion.AUTOBOT,36972, "Sentinel Prime","DinastyOfPrimes", 90.0);
		Transformer Nova = new Transformer(Faccion.AUTOBOT,573571, "Nova Prime","DinastyOfPrimes", 140.0);
		Transformer Rodimus = new Transformer(Faccion.AUTOBOT,64238, "Rodimus Prime","DinastyOfPrimes", 132.0);
		Transformer Vector = new Transformer(Faccion.AUTOBOT,3, "Vector Prime","DinastyOfPrimes", 170.0);
		DinastyOfPrimes.reclutar(Optimus);
		DinastyOfPrimes.reclutar(Zeta);
		DinastyOfPrimes.reclutar(Sentinel);
		DinastyOfPrimes.reclutar(Vector);
		DinastyOfPrimes.reclutar(Nova);
		DinastyOfPrimes.reclutar(Rodimus);
		
		Escuadron CouncilOfDecepticons = new Escuadron("CdDecepticons");

		Transformer Megatron = new Transformer(Faccion.DECEPTICON,12345, "Megatron","CdDecepticons",120.0);
		Transformer Caido = new Transformer(Faccion.DECEPTICON,32278, "Megatronus Prime","CdDecepticons",120.0);
		Transformer Deathsaurus = new Transformer(Faccion.DECEPTICON,36972, "Deathsaurus","CdDecepticons",120.0);
		Transformer Zarak = new Transformer(Faccion.DECEPTICON,573571, "Scorponok","CdDecepticons",120.0);
		Transformer Ransack = new Transformer(Faccion.DECEPTICON,64238, "Ransanck","CdDecepticons",120.0);
		Transformer Scourge = new Transformer(Faccion.DECEPTICON,3, "Scourge","CdDecepticons",120.0);
		CouncilOfDecepticons.reclutar(Megatron);
		CouncilOfDecepticons.reclutar(Caido);
		CouncilOfDecepticons.reclutar(Deathsaurus);
		CouncilOfDecepticons.reclutar(Zarak);
		CouncilOfDecepticons.reclutar(Ransack);
		CouncilOfDecepticons.reclutar(Scourge);
		
		
		Partida VUnicron = new Partida("contra los heraldos de unicron");
		VUnicron.MandarABatalla(Ransack);
		VUnicron.MandarABatalla(Vector);
		VUnicron.MandarABatalla(Optimus);
		VUnicron.MandarABatalla(Megatron);
		
		
		
		VUnicron.iniciarBatalla(564, "DinastyOfPrimes", "CdDecepticons");
		
		Strike UgotTheTouch = new Strike((Transformer)Optimus, 85.0, "DinastyOfPrimes");
		VUnicron.confirmarStrike(85.0, Optimus);
		
		assertEquals(Optimus, UgotTheTouch.getTransformer());
		
	}

}
