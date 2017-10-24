
public class PesoPesado {

	public static void main(String[] args) {
		
		double suporte;
		
		double peso30kg = 30;
		double peso25kg = 25;
		double peso20kg = 20;
		double peso15kg = 15;
		double peso10kg = 10;
		double peso05kg = 05;
		
		double sequencia[] = {peso05kg, peso25kg, peso10kg, peso30kg, peso20kg, peso15kg};
		
		for(int i = 0; i < sequencia.length; i++){
			for(int j = 0; j < sequencia.length - 1; j++){
				if(sequencia[j] > sequencia[j+1]){
					suporte = sequencia[j];
					sequencia[j] = sequencia[j+1];
					sequencia[j+1] = suporte;
				}
			}
		}
		
		System.out.println(sequencia[0]);
		System.out.println(sequencia[5]);
		
	}

}
