package exerciciopart02;

public class Utils {
	

	public double toCelsius(double f) throws FahrenheitException {
		if( f < -459.67){
			throw new FahrenheitException();
			
		}return (5*(f - 32)) / 9;
	}
}
