package palavrasEmbaralhadas;

public class FabricaMecanicaDoJogo {

	private MecanicaDoJogo mecanica;

	public MecanicaDoJogo getMecanica(String escolha) {
		int opcao = Integer.parseInt(escolha);
		
		if (opcao == 1) {
			mecanica = new MecanicaVidas(3);
		} else {
			if (opcao == 2) {
				mecanica = new MecanicaMelhorDeX(10);
			} else {
				return null;
			}
		}
		return mecanica;	
	}
}
