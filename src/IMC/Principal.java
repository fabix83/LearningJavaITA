package IMC;

public class Principal {

	public static void main(String[] args) {
		
		//instanciação e construção dos objetos
		Paciente paciente1 = new Paciente(84, 1.70);
		Paciente paciente2 = new Paciente(64, 1.90);
		Paciente paciente3 = new Paciente(123, 1.70);
		
		//Impressão do diagnostico
		System.out.println("IMC P1 = " + paciente1.CalcularIMC() + " / Diagnostico: " + paciente1.diagnostico()+ "\n");
		System.out.println("IMC P2 = " + paciente2.CalcularIMC() + " / Diagnostico: " + paciente2.diagnostico()+ "\n");
		System.out.println("IMC P3 = " + paciente3.CalcularIMC() + " / Diagnostico: " + paciente3.diagnostico()+ "\n");
		
	}
}
