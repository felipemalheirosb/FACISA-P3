
public class MaisRico {

	public static void main(String[] args) {

		int Gates = 1000000;
		int Jobs = 0;
		int Silvio = 100000;
		int Lula = 13;
		int Malheiros = -1;
		 
		int ranking[] = {Gates,Jobs,Silvio,Lula,Malheiros};
		
		int clone;
		
		for(int i = 0; i < ranking.length; i++){
			for(int j = 0; j < ranking.length -1; j++){
				if(ranking[j] > ranking[j+1]){
					clone = ranking[j];
					ranking[j] = ranking[j+1];
					ranking[j+1] = clone;
				}
			}
		}
		
		System.out.println(ranking[4]);
		System.out.println(ranking[0]);

	}

}
