import static org.junit.Assert.*;

import org.junit.Test;

public class SelectionSortTest {

	@Test
	public void test() {
		
		SelectionSort ordenacao = new SelectionSort();
		int[] elementos = {5,2,9,3,7,1,0};
		int[] ordenacaoEsperada = {0,1,2,3,5,7,9};
		assertArrayEquals(ordenacaoEsperada, ordenacao.ordenacao(elementos));
	}

}
