
public class SelectionSort {
	
	public int[] ordenacao(int[] vetor){
		
		for(int i = 0; i < vetor.length; i++){
			int menor = i;	
			for(int j = i+ 1; j < vetor.length; j++){
				if(vetor[j] < vetor[menor]){
					menor = j;
				}	
			}
			int aux = vetor[i];
			vetor[i] = vetor[menor];
			vetor[menor] = aux;
		}
		
		return vetor;
	}
}