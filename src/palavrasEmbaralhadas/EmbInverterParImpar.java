package palavrasEmbaralhadas;

public class EmbInverterParImpar implements Embaralhador {

	//metodo de embaralhamento
	@Override
	public String embaralhamento(String palavra) {
		int tamanho;
		tamanho = palavra.length();
		int i = 0;
		
		char[] troca = new char[tamanho];
		
		while (i < tamanho) {
			if (i == tamanho - 1) {
				troca[i] = palavra.charAt(i);
				break;
			}
			troca[i] = palavra.charAt(i+1);
			troca[i+1] = palavra.charAt(i);
			i += 2;
		}
		
		String palavraRetornada = new String(troca);
		return palavraRetornada;
	}
}
