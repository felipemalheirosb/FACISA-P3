
public class SelectionMaisMaligno {
	
	public int[] ordenacao(int[] blackList){
		for(int i = 0; i < blackList.length; i++){
			int menor = i;
			for(int j = i+1; j < blackList.length; j++){
				if(blackList[j] < blackList[menor]){
					menor = j;
				}
			}
			int aux = blackList[i];
			blackList[i] = blackList[menor];
			blackList[i] = aux;
		}
		
		return  blackList;
	}

}
