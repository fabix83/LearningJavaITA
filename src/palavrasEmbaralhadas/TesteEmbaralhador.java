package palavrasEmbaralhadas;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteEmbaralhador {

	/*
	@Test
	public void test() {
		EmbInverterString embaralhador = new EmbInverterString();
		assertEquals("oigada", embaralhador.embaralhamento("adagio"));	
	}
	
	@Test
	public void testEmbParImpar() {
		EmbInverterParImpar embaralhador = new EmbInverterParImpar();
		assertEquals("acerac", embaralhador.embaralhamento("careca"));	
	}
	*/
	
	@Test
	public void testMecVidas() {
		MecanicaVidas mecanica = new MecanicaVidas(3);
		mecanica.mecanicaDoJogo();
	}
}
