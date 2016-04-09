package palavrasEmbaralhadas;

public interface MecanicaDoJogo {
	boolean acertouOuNao(String palavraEscolhida, String palavraDigitada);
	boolean continuaOuNao();
	int getPontuacao();
}

