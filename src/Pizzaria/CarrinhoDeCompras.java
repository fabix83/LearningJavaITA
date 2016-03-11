package Pizzaria;

public class CarrinhoDeCompras {
	
	double totalCarrinho;
	
	void adicionaPizza (Pizza p) {
		if (p.somaIngredientes == 0) {
			System.out.println("Erro: Pizza sem ingredientes");
		} else {
			totalCarrinho += p.getPreco(); 
		}
	}
	
	double gettotalCarrinho () {
		return totalCarrinho;
	}
}
