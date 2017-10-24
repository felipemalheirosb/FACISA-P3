
public class QuickSortMain {

	public static void main(String[] args) {

		QuickSort ordenacao = new QuickSort();
		int[] vetor = {5,6,40,9,0,3};
		
		ordenacao.quickSort(vetor, 0, 5);
		
		
		System.out.println(vetor);
		

	}

}
