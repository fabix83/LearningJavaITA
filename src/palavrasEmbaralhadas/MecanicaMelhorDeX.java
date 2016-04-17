package palavrasEmbaralhadas;
public class MecanicaMelhorDeX implements MecanicaDoJogo {

	int quantidade;
	int pontos;	
	
	public MecanicaMelhorDeX(int quantidade) {
		super();
		this.quantidade = quantidade;
		this.pontos = 0;
	}

	//metodo que retorna se houve erro ou acerto
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

	//metodo de consulta para saber se o jogo deve continuar
	@Override
	public boolean continuaOuNao() {
		if (quantidade == 0) return false;
		return true;
	}

	//metodo que devolve a pontuacao
	@Override
	public int getPontuacao() {
		return pontos;
	}

}
