package palavrasEmbaralhadas;


public class EmbInverterString implements Embaralhador {
	
	@Override
	public String embaralhamento(String palavra) {
		String invertida = new StringBuilder(palavra).reverse().toString();
		return invertida;
	}
}
