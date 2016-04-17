package palavrasEmbaralhadas;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

//Classe responsavel por gerenciar um banco de dados de palavras
public class BancoDePalavras {
	
	int contadorPalavras;
	private Map<Integer, String> palavras = new HashMap<Integer, String>();

	//Metodo construtor que gera o banco de dados de palavras a partir de um arquivo guardando numa HashMap
	BancoDePalavras () throws IOException {
		
		FileInputStream stream = null;
		
		try {
			stream = new FileInputStream("arquivo/palavras.txt");
		} catch (FileNotFoundException e1) {
			System.out.println("nao consegue ler o arquivo");
		}
		
		InputStreamReader reader = new InputStreamReader(stream);
		BufferedReader br = new BufferedReader(reader);
		
		String linha = br.readLine();

		while(linha != null) {
			palavras.put(contadorPalavras, linha);
			contadorPalavras++;
			try {
				linha = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
	}
	
	//Metodo que retorna uma palavra aleatoria do banco
	public String pegaPalavraBanco() {
		Random gerador = new Random();
		int numAleatorio;
		String palavraAleatoria;
		
		while (true) {
			numAleatorio = gerador.nextInt(contadorPalavras);
			//System.out.print("n(" + numAleatorio + ") -> ");	
			palavraAleatoria = palavras.get(numAleatorio);	
			
			if (palavraAleatoria.length() > 2 && palavraAleatoria.length() < 10) {
				break;
			}
		}
		
		palavraAleatoria = palavraAleatoria.toLowerCase();
		
		return palavraAleatoria;	
	}
	
}
