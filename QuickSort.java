
public class QuickSort {
	
	
	public int particiona(int[] vetor,int inicio, int fim ){
		int esq, dir, pivo, aux;
		
		esq = inicio;
		dir = fim;
		pivo = vetor[inicio];

		while(esq < dir){
			while(vetor[esq] <= pivo){
				esq++;
			}
			while(vetor[dir] > pivo){
				dir--;
			}
			if(esq < dir){
				aux = vetor[esq];
				vetor[esq] = vetor[dir];
				vetor[dir] = aux;
			}
		}
		vetor[inicio] = vetor[dir];
		vetor[dir] = pivo;
		return dir; 
	}
	
	public void quickSort(int[] vetor, int inicio, int fim){
		int pivo;
		if( inicio > fim){
			pivo = particiona(vetor, inicio, fim);
			quickSort(vetor, inicio, pivo - 1);
			quickSort(vetor, pivo + 1, fim);
		}
		
		
	}
	
	
}
