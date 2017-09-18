package exerciciopart01;

public class Main {
	
	public static void main(String args[]){
		
		ContaCorrente conta = new ContaCorrente(1000,500);
		
		
		//valor do limite
		try{
			conta.setValorLimite(800);
		}catch (LimiteAtingidoException message){
			System.out.println(message.getMessage());
		}catch (ValorNegativoException message){
			System.out.println(message.getMessage());
		}
		
		//sacar
		try {
			conta.setValorLimite(800);
			conta.sacar(600);
		} catch (SaldoInsuficienteException message) {
			System.out.println(message.getMessage());
			
		} catch (LimiteAtingidoException message) {
			System.out.println(message.getMessage());
			
		}catch (ValorNegativoException message){
			System.out.println(message.getMessage());
		}
		
		//depositar
		try {
			conta.setValorLimite(200);
			conta.depositar(600);
		} catch (LimiteAtingidoException exception) {
			System.out.println(exception.getMessage());
		}catch (ValorNegativoException message){
			System.out.println(message.getMessage());
		}		
	}
}


