package palavrasEmbaralhadas;


public class EmbInverterString implements Embaralhador {
	
	//metodo de embaralhamento
	@Override
	public String embaralhamento(String palavra) {
		String invertida = new StringBuilder(palavra).reverse().toString();
		return invertida;
	}
}
