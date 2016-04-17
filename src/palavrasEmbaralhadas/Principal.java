package palavrasEmbaralhadas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
/* Classe Principal do Jogo
 * 
 */

public class Principal {

	public static void main(String[] args) throws IOException {
		
		//Classes Colaboradoras
		MecanicaDoJogo mecanica;
		Embaralhador embaralhador;
		BancoDePalavras banco = new BancoDePalavras();
		
		//Gerencia as palavras utilizadas
		String escolhaModalidade;
		String palavraBanco;
		String palavraEmbaralhada;
		String palavraDigitada;
		
		//IO
	    InputStream is = System.in;
	    InputStreamReader isr = new InputStreamReader(is);
	    BufferedReader br = new BufferedReader(isr);
		
	    //Inicio do jogo / Escolhe a modalidade do jogo / Utiliza a FabricaMecanicaDoJogo
		while (true) {
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
		    	limpaTela();
		    	break;
		    }
		     
		    System.out.println("Alternativa incorreta! Digite Novamente!");
		    
		}
	    
		System.out.print("Vamos comecar. A palavra é: ");
		
		//Inicia e verifica sempre se o jogo chegou ao fim
		while (mecanica.continuaOuNao()) {
			
			//pega um embaralhador aleatorio
			embaralhador = new FabricaEmbaralhadores().getEmbaralhador();
			
			//embaralha a palavra
			palavraBanco = banco.pegaPalavraBanco().toUpperCase();
			palavraEmbaralhada = embaralhador.embaralhamento(palavraBanco).toUpperCase();
			System.out.println(palavraEmbaralhada);
		     
			//pega a resposta
			System.out.println("esperando a resposta ... ");
		    palavraDigitada = br.readLine().toUpperCase();
		    
		    limpaTela();
		    
		    //verifica a resposta e faz a pontuacao
		    if (mecanica.acertouOuNao(palavraBanco, palavraDigitada)) {
		    	System.out.print("Acertou Mizeravi!!!");
		    	if (mecanica.continuaOuNao()) System.out.print("Tome outra palavra: ");
		    } else {
		    	System.out.print("ERROOOOOU!!!");
		    	if (mecanica.continuaOuNao()) System.out.print("Tome outra palavra: ");
		    }
		    
		}
		
		//Finalizando o Jogo
		limpaTela();
		System.out.println("Jogo finalizado!");
		System.out.println("Pontuacao: " + mecanica.getPontuacao());	
	}

	//Gambiarra limpa tela do console
	public static void limpaTela() {  
		for (int i = 0; i < 100; i++){
			System.out.println("\n");
		}
	}
}
