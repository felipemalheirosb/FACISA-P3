import static org.junit.Assert.*;

import org.junit.Test;

public class BubbleSortExercicioTest {

	@Test
	public void test() {
		
		BubbleSortExercicio ordenacao = new BubbleSortExercicio();
		int[] elementos = {5,2,9,3,7,1,0};
		int[] ordenacaoEsperada = {0,1,2,3,5,7,9};
		assertArrayEquals(ordenacaoEsperada, ordenacao.ordenacaoBubble(elementos));
	}

}
