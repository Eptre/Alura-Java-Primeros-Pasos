
public class EjemploCondicionales2 {
	public static void main(String[] args) {

		int edad = 18;
		int cantidadPersonas = 2;
		boolean esPareja = cantidadPersonas > 1;
		System.out.println("Valor de condición: " 
				+ esPareja);
		
		if (edad >= 18 && esPareja) {
			System.out.println("Usted puede entrar.");
			System.out.println("Bienvenido.");
		} else {
			System.out.println("Usted no está permitido "
					+ "entrar");
		}
		
	}
}
