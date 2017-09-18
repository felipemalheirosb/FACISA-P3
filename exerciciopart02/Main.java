package exerciciopart02;

public class Main {
	
	public static void main (String args[]) throws FahrenheitException{
		Utils conversor = new Utils();
		
		try {
			conversor.toCelsius(32);
		} catch (FahrenheitException message) {
			System.out.println(message.getMessage());
		}
		double resultado = conversor.toCelsius(50);
		System.out.println(resultado);
		
	}

}
