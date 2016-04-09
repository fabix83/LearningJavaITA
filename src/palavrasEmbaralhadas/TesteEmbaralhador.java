package palavrasEmbaralhadas;

import java.io.IOException;
import org.junit.Test;

public class TesteEmbaralhador {

	/*
	@Test
	public void test() {
		EmbInverterString embaralhador = new EmbInverterString();
		assertEquals("oigada", embaralhador.embaralhamento("adagio"));	
	}*/
	
	/*
	@Test
	public void testEmbParImpar() {
		EmbInverterParImpar embaralhador = new EmbInverterParImpar();
		//assertEquals("acerac", embaralhador.embaralhamento("careca"));	
		embaralhador.embaralhamento("par");
	}*/
	
	/*
	@Test
	public void testMecVidas() throws IOException {
		MecanicaVidas mecanica = new MecanicaVidas(3);
		mecanica.mecanicaDoJogo();
	}*/
	
	
	@Test
	public void testMecVidas() throws IOException {
		FabricaEmbaralhadores fabrica = new FabricaEmbaralhadores();
		fabrica.getEmbaralhador();
	}
	
}
