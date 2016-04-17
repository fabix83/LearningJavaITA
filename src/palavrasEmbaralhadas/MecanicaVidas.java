package palavrasEmbaralhadas;

public class MecanicaVidas implements MecanicaDoJogo {

	int vidasRestantes;
	int pontos;
	
	public MecanicaVidas(int vidasRestantes) {
		super();
		this.vidasRestantes = vidasRestantes;
		this.pontos = 0;
	}

	//metodo que retorna se houve erro ou acerto
	@Override
	public boolean acertouOuNao(String palavraEscolhida, String palavraDigitada ) {
		if (palavraDigitada.equals(palavraEscolhida)) {
			pontos += palavraDigitada.length();
			return true;
		}
		vidasRestantes--;
		return false;
	}

	//metodo de consulta para saber se o jogo deve continuar
	@Override
	public boolean continuaOuNao() {
		if (vidasRestantes == 0) return false;
		return true;
	}
	
	//metodo que devolve a pontuacao
	@Override
	public int getPontuacao() {
		return pontos;
	}
}
