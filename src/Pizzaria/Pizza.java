package Pizzaria;

import java.util.HashMap;
import java.util.Map;

public class Pizza {

		double preco;
		static Map <String, Integer> totalIngredientes = new HashMap <String, Integer>();
		public int somaIngredientes = 0;
		
		public void adicionaIngrediente(String ingrediente) {
			if (totalIngredientes.containsKey(ingrediente)) {
				contabilizaIngrediente(ingrediente);
			} else {
				totalIngredientes.put(ingrediente, 1);
			}
			somaIngredientes++;
		}
		
		static void contabilizaIngrediente(String ingrediente) {
			int incremento;
			incremento = totalIngredientes.get(ingrediente)+ 1;
			totalIngredientes.put(ingrediente, incremento);
		}
		
		public double getPreco() {
			if (somaIngredientes <= 0){
				return 0;
			}
			if (somaIngredientes <= 2) {
				return 15;
			}
			if (somaIngredientes <=5 ) {
				return 20;
			}
			return 23;
		}

		public Map<String, Integer> gettotalIngredientes () {
			return totalIngredientes;
		}
}
