package palavrasEmbaralhadas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Principal {

	public static void main(String[] args) throws IOException {
		
		String escolhaModalidade;
		MecanicaDoJogo mecanica;
		
		Embaralhador embaralhador;
		BancoDePalavras banco = new BancoDePalavras();
		
		String palavraBanco;
		String palavraEmbaralhada;
		String palavraDigitada;
		
	    InputStream is = System.in;
	    InputStreamReader isr = new InputStreamReader(is);
	    BufferedReader br = new BufferedReader(isr);
		
		while (true) {
			//Imprime inicio do jogo e espera a modalidade que o jogador quer tentar
			System.out.println("*****************************");
			System.out.println("***** Jogo das Palavras *****");
			System.out.println("Escolha a modalidade do Jogo:");
			System.out.println("1. 3 Vidas!");
			System.out.println("2. Melhor de 10 Tentativas");
			System.out.println("*****************************");
		    System.out.print("esperando a resposta ... ");
		     
		    escolhaModalidade = br.readLine();
		    mecanica = new FabricaMecanicaDoJogo().getMecanica(escolhaModalidade);
		     
		    if (!(mecanica == null)) {
		    	break;
		    }
		     
		    System.out.println("Alternativa incorreta!");
		}
	    
		System.out.print("Vamos comecar. A palavra é: ");
		
		while (mecanica.continuaOuNao()) {
			
			embaralhador = new FabricaEmbaralhadores().getEmbaralhador();
			
			palavraBanco = banco.pegaPalavraBanco().toUpperCase();
			palavraEmbaralhada = embaralhador.embaralhamento(palavraBanco).toUpperCase();
			
			System.out.println(palavraEmbaralhada);
			System.out.print("esperando a resposta ... ");
		     
		    palavraDigitada = br.readLine().toUpperCase();
		    
		    if (mecanica.acertouOuNao(palavraBanco, palavraDigitada)) {
		    	System.out.print("Acertou Mizeravi!!!");
		    	if (mecanica.continuaOuNao()) System.out.print("Tome outra palavra: ");
		    } else {
		    	System.out.print("ERROOOOOU!!!");
		    	if (mecanica.continuaOuNao()) System.out.print("Tome outra palavra: ");
		    }
		    
		}
		
		//Finalizando o Jogo
		System.out.println("");
		System.out.println("");
		System.out.println("Jogo finalizado!");
		System.out.println("Pontuacao: " + mecanica.getPontuacao());	
	}

}
