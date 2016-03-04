package IMC;

public class Paciente {

	private double peso;
	private double altura;
	
	//Construtor da Classe
	Paciente(double peso, double altura){
		this.peso = peso;
		this.altura = altura;
	}
	
	//método para calcular o IMC
	double CalcularIMC () {
		double IMC;
		IMC = (peso / (altura * altura));
		return IMC;
	}
	
	//método que repassa o diagnostico do paciente
	String diagnostico() {
		double IMC;
		String diagnostico = "null";
		
		IMC = this.CalcularIMC();
				
		if (IMC < 16) { 
			diagnostico = "Baixo peso muito grave"; 
			return diagnostico;
		}
		if (IMC < 16.99) { 
			diagnostico = "Baixo peso grave"; 
			return diagnostico;
		}	
		if (IMC < 18.49) { 
			diagnostico = "Baixo peso"; 
			return diagnostico;
		}		
		if (IMC < 24.99) { 
			diagnostico = "Peso Normal"; 
			return diagnostico;
		}
		if (IMC < 29.99) { 
			diagnostico = "Sobrepeso"; 
			return diagnostico;
		}
		if (IMC < 34.99) { 
			diagnostico = "Obesidade Grau I"; 
			return diagnostico;
		}
		if (IMC < 39.99) { 
			diagnostico = "Obesidade Grau II"; 
			return diagnostico;
		}
		if (IMC > 40) { 
			diagnostico = "Obesidade Grau III - (obesidade mórbida)"; 
			return diagnostico;
		}	
		
		return diagnostico;
	}
}
