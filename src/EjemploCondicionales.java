
public class EjemploCondicionales {
	public static void main(String[] args) {

		int edad = 8;
		int cantidad = 2;
		if (edad >= 18) {
			System.out.println("Usted puede entrar.");
			System.out.println("Bienvenido.");
		} else {
			if (cantidad >= 2) {
				System.out.println("Usted es menor de edad "
						+ "pero está permitido entrar.");
			} else {
				System.out.println("Usted no está "
						+ "permitido entrar.");
			}
		}
	}
}
