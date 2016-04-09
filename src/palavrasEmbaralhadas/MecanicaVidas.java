package palavrasEmbaralhadas;

public class MecanicaVidas implements MecanicaDoJogo {

	int vidasRestantes;
	int pontos;
	
	public MecanicaVidas(int vidasRestantes) {
		super();
		this.vidasRestantes = vidasRestantes;
		this.pontos = 0;
	}

	@Override
	public boolean acertouOuNao(String palavraEscolhida, String palavraDigitada ) {
		if (palavraDigitada.equals(palavraEscolhida)) {
			pontos += palavraDigitada.length();
			return true;
		}
		vidasRestantes--;
		return false;
	}

	@Override
	public boolean continuaOuNao() {
		if (vidasRestantes == 0) return false;
		return true;
	}
	
	@Override
	public int getPontuacao() {
		return pontos;
	}
}
