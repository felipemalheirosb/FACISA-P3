
public class SelectionSinuca {
	
	public int[] ordenacao(int[] bolas){
		for(int i = 0; i < bolas.length; i++){
			int menor = 0;
			for(int j = i + 1; j < bolas.length; j++){
				if(bolas[j] < bolas[menor]){
					menor = j;
				}
			}
			int aux = bolas[i];
			bolas[i] = bolas[menor];
			bolas[i] = aux;
		}
		return bolas;
	}
	

}
