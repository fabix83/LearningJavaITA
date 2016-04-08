package palavrasEmbaralhadas;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class MecanicaVidas implements MecanicaDoJogo {

	int vidasRestantes;
	int contadorPalavras;
	FileInputStream stream = null;
	
	public MecanicaVidas(int vidasRestantes) {
		super();
		this.vidasRestantes = vidasRestantes;
		inicializa();
	}
	
	void inicializa() {
		try {
			stream = new FileInputStream("/Users/fabix83/Documents/palavras.txt");
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
			contadorPalavras++;
			try {
				linha = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
		
		System.out.println("Temos " + contadorPalavras + " palavras!");
	}
	
	@Override
	public void mecanicaDoJogo(Embaralhador embaralha) {
		
		int contador = 0;
		int aleatorio = 0;
		int palavra = 0;
		
		Random gerador = new Random();
		
		while (contador <= 2) {
			
			aleatorio = gerador.nextInt(contadorPalavras);
			
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
				if (palavra == aleatorio) {
					System.out.println(linha);
				}
				palavra++;
				try {
					linha = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}	
			}
			contador++;
		}
	}	
}
