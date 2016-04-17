package palavrasEmbaralhadas;

import java.util.Random;

//devolve o embaralhador aleatoriamente
public class FabricaEmbaralhadores {
	
	private Embaralhador embaralhador;

	public Embaralhador getEmbaralhador() {
		Random gerador = new Random();
		int escolha = gerador.nextInt(2);
		
		if (escolha == 0) {
			embaralhador = new EmbInverterString();
		} else {
			embaralhador = new EmbInverterParImpar();
		}
		return embaralhador;	
	}

}
