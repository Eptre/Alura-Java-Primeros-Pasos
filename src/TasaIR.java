
public class TasaIR {
	public static void main(String[] args) {
		double salario = 3300.00;
		
		if (salario <= 1900.00 && salario <= 2800.00) {
			System.out.println("IR: 7.5%");
			System.out.println("Se deducen 142.");
		} else if (salario >= 2800.01 && salario <= 3751.00) {
			System.out.println("IR: 15%");
			System.out.println("Se deducen 350.");
		} else if (salario >= 3751.01 && salario <= 4664.00) {
			System.out.println("IR: 22.5%");
			System.out.println("Se deducen 636.");
		}
	}
}
