import static org.junit.Assert.*;

import org.junit.Test;

public class SelectionMaisMalignoTest {

	@Test
	public void test() {
		SelectionMaisMaligno malignoTop = new SelectionMaisMaligno();
		
		int[] maisMalignos = {10,5,99,8,23,65,0};
		int[] topMalignos = {0,5,8,10,23,65,99};
		assertArrayEquals(topMalignos, malignoTop.ordenacao(topMalignos));
		
		System.out.println("Bitão é o mais maligno com "+ topMalignos[6]+" pontos.");

		System.out.println("Joel é o capeta mirin com "+ topMalignos[0]+" pontos.");
		
	
	}
	

}
