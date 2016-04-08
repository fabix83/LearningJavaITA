package palavrasEmbaralhadas;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MecanicaVidas implements MecanicaDoJogo {

	int vidasRestantes;
	int pontos;
	int contadorPalavras;
	FileInputStream stream = null;
	private Map<Integer, String> palavras = new HashMap<Integer, String>();
	Embaralhador embaralhador;
	
	
	public MecanicaVidas(int vidasRestantes) {
		super();
		this.vidasRestantes = vidasRestantes;
		inicializa();
	}
	
	void inicializa() {
		try {
			stream = new FileInputStream("c:/temp/palavras.txt");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		
		InputStreamReader reader = new InputStreamReader(stream);
		BufferedReader br = new BufferedReader(reader);
		
		String linha = null;
		
		try {
			linha = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(linha != null) {
			palavras.put(contadorPalavras, linha);
			contadorPalavras++;
			try {
				linha = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
		System.out.println("Temos " + contadorPalavras + " palavras!");
		for (Integer chave : palavras.keySet()) {
			String valor = palavras.get(chave);
			System.out.println(chave + " " + valor);
		}
	}
	
	@Override
	public void mecanicaDoJogo() throws IOException {
		pontos = 0;
		Random gerador = new Random();
		int numAleatorio;
		String palavraAleatoria;
		String palavraEmbaralhada;
		String palavraDigitada;
		embaralhador = new EmbInverterParImpar();
		
	     InputStream is = System.in;
	     InputStreamReader isr = new InputStreamReader(is);
	     BufferedReader br = new BufferedReader(isr);
	     
		while (vidasRestantes > 0) {
			
			numAleatorio = gerador.nextInt(contadorPalavras);
			System.out.print("num " + numAleatorio);
			palavraAleatoria = palavras.get(numAleatorio);
			System.out.println(palavraAleatoria);
			palavraEmbaralhada = embaralhador.embaralhamento(palavraAleatoria);
			System.out.println(palavraEmbaralhada);
			System.out.print("esperando a resposta ... ");
			palavraDigitada = br.readLine();
			
			if (palavraDigitada.equals(palavraAleatoria)) {
				pontos++;
				System.out.println("resposta correta! tome outra palavra...");
				System.out.println("quantidade de vidas" + vidasRestantes);
			} else {
				System.out.println("resposta errada! menos 1 vida...");
				vidasRestantes--;
				System.out.println("quantidade de vidas" + vidasRestantes);
			}
		}
		System.out.println("jogo finalizado! vc fez " + pontos + "pontos");
	}	
}
