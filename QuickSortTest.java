import static org.junit.Assert.*;

import org.junit.Test;

public class QuickSortTest {

	@Test
	public void test() {
		QuickSort ordenacao = new QuickSort();
		int[] vetor = {5,6,40,9,0,3};
		int[] esperado = {0,3,5,6,9,40};
		ordenacao.quickSort(vetor, 0, 5);
		
		
	}

	

}
