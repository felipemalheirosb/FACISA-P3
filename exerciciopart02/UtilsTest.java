package exerciciopart02;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class UtilsTest {

	@Test
	public void testToCelsiusZero() throws FahrenheitException {
		Utils utils = new Utils();
		Assert.assertEquals(0.0, utils.toCelsius(32),0.0);		
	}
	
	@Test
	public void testToCelsiusPositivo() throws FahrenheitException {
		Utils utils = new Utils();
		Assert.assertEquals(10.0, utils.toCelsius(50), 00.00);
	}
	
	@Test
	public void testToCelsiusNegativo() throws FahrenheitException {
		Utils utils = new Utils();
		Assert.assertEquals(-10.0, utils.toCelsius(14), 00.00);
	}
	
	@Test(expected = FahrenheitException.class) 
	public void testToCelsiusZeroAbsoluto() throws FahrenheitException {
		Utils utils = new Utils();
		utils.toCelsius(-459.68);
	}
}

