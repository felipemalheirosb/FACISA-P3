
public class MaisGordinho {
	
	public static void main(String[] args) {
		
		int felipeN = 60;
		int felipeM = 70;
		int samuel = 80;
		int joel = 10;
		int lucas = 15000000;
		
		int grupo[] = {felipeN, felipeM, samuel, joel, lucas};
		
		int aux;
		
		
		for(int i = 0; i < grupo.length; i++){
			for(int j = 0; j < grupo.length -1; j++){
				if(grupo[j] > grupo[j+1]){
					aux = grupo[j];
					grupo[j] = grupo[j+1];
					grupo[j+1] = aux;
				}
			}
		}
		
		for(int i = 0; i < grupo.length; i++){
			System.out.println(grupo[i]);
		}
		
		System.out.println("O mais Gordinho é Lucas com "+grupo[4]+" kilos");
		System.out.println("O desnutrido é Joel "+grupo[0]+" kilos");
	}

}
