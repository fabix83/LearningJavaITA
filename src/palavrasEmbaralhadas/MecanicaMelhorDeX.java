package palavrasEmbaralhadas;
public class MecanicaMelhorDeX implements MecanicaDoJogo {

	int quantidade;
	int pontos;	
	
	public MecanicaMelhorDeX(int quantidade) {
		super();
		this.quantidade = quantidade;
		this.pontos = 0;
	}

	@Override
	public boolean acertouOuNao(String palavraEscolhida, String palavraDigitada) {
		if (palavraDigitada.equals(palavraEscolhida)) {
			pontos += palavraDigitada.length();
			quantidade--;
			return true;
		}
		quantidade--;
		return false;
	}

	@Override
	public boolean continuaOuNao() {
		if (quantidade == 0) return false;
		return true;
	}

	@Override
	public int getPontuacao() {
		return pontos;
	}

}
