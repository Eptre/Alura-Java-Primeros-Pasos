
public class TipoVariable {
	public static void main(String ... args) {
		int edad = 28;
		double salario = 1250.50;
		double salarioMitad = salario / 2;
		System.out.println("Edad: " + edad 
				          + " Salario: " + salario 
						  + " Mitad: " + salarioMitad);
		
		double variable1 = 230.89;
		int variable1Entero  = (int) variable1; //cast
		System.out.println("Variable entera: " + variable1Entero);
	}
}
