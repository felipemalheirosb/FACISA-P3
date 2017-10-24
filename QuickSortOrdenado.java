import java.util.Arrays;

public class QuickSortOrdenado {
	
	public static int particiona(int[] vetor, int inicio, int fim){
		
		int esq, dir, aux, pivo;
		
		pivo = vetor[inicio];
		esq = inicio + 1;
		dir = fim;
		
		while(esq <= dir){
			
			if(vetor[esq] <= pivo){
				esq++;
			}
			else if(vetor[dir] > pivo){
				dir--;
			}
			else{
				aux = vetor[esq];
				vetor[esq] = vetor[dir];
				vetor[dir] = aux;
				esq++;
				dir--;
			}
			
		}
		vetor[inicio] = vetor[dir];
		vetor[dir] = pivo;
		
		return dir;
	}
	
	public static void ordenar(int[] vetor, int inicio, int fim){
		int pivo;
		if(inicio < fim){
			pivo = particiona(vetor, inicio, fim);
			ordenar(vetor, inicio, pivo - 1);
			ordenar(vetor, pivo + 1, fim);
		}
	}
	
	 public static void main(String[] args) {
	       
	        int[] vetorDesordenado = {5,6,40,9,0,3};
	       
	        ordenar1(vetorDesordenado);
	       
	        System.out.println(Arrays.toString(vetorDesordenado));
	       
	    }
	   
	    public static void ordenar1(int[] vetor) {
	        ordenar(vetor, 0, vetor.length-1);
	    }

}
