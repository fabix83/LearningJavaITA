package Pizzaria;

import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		//Criação das 3 Pizzas a serem colocadas no carrinho
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza();
		Pizza p3 = new Pizza();
		Pizza p4 = new Pizza();
		
		//Criação de um Map para receber os ingredientes utilizados em forma de hash
		Map <String, Integer> totalIngredientes = new HashMap<String, Integer>();
		
		//Criação de dois carrinhos de Compras
		CarrinhoDeCompras c1 = new CarrinhoDeCompras();
		CarrinhoDeCompras c2 = new CarrinhoDeCompras();
		
		//Pizza 1
		p1.adicionaIngrediente("Queijo");
		p1.adicionaIngrediente("Azeitonas");
		
		double preco = p1.getPreco();
		System.out.println(" a Pizza P1 tem " + p1.somaIngredientes + " Ingredientes : Preco: " + preco);
		c1.adicionaPizza(p1);
		
		//Pizza 2
		p2.adicionaIngrediente("Queijo");
		p2.adicionaIngrediente("Bacon");
		p2.adicionaIngrediente("Tomates");
		p2.adicionaIngrediente("Azeitonas");
		
		preco = p2.getPreco();
		System.out.println(" a Pizza P2 tem " + p2.somaIngredientes + " Ingredientes : Preco: " + preco);
		c1.adicionaPizza(p2);
			
		//Pizza 3
		p3.adicionaIngrediente("Queijo");
		p3.adicionaIngrediente("Frango");
		p3.adicionaIngrediente("Azeitonas");
		p3.adicionaIngrediente("Tomates");
		p3.adicionaIngrediente("Catupiry");
		p3.adicionaIngrediente("Bacon");
		
		preco = p3.getPreco();
		System.out.println(" a Pizza P3 tem " + p3.somaIngredientes + " Ingredientes : Preco: " + preco);
		c1.adicionaPizza(p3);
		
		//Impressao do Total do Carrinho
		System.out.println("****************");
		System.out.println("Total Carrinho 1: " + c1.gettotalCarrinho());
		System.out.println("****************");
		
		//Pizza 4 - Sem Ingredientes para teste
		preco = p4.getPreco();
		System.out.println(" a Pizza tem P4 tem " + p4.somaIngredientes + "  Ingredientes : Preco: " + preco);
		c2.adicionaPizza(p4);
		
		System.out.println("****************");
		System.out.println("Total Carrinho 2: " + c2.gettotalCarrinho());
		System.out.println("****************");
		
		//Impressao dos ingredientes utilizados
		System.out.println("------------------------------");
		System.out.println("Impressão dos Ingredientes Utilizados: ");
		totalIngredientes = Pizza.totalIngredientes;
		for (String chave : totalIngredientes.keySet()) {
			Integer valor = totalIngredientes.get(chave);
			System.out.println(chave + " = " + valor);
		}	
	}

}
