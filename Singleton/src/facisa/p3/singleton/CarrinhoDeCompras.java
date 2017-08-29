package facisa.p3.singleton;

public class CarrinhoDeCompras {
	
	public int qtdItens = 10;
	
	//Refer�ncia a �nica instancia da classe.
	private static CarrinhoDeCompras INSTANCIA;
	
	//Construtor privado porque n�o permite ser visualizado fora da classe.
	private CarrinhoDeCompras(){
	}
	
	//Verifica se a Instancia � nula, para criar uma instancia, e retorna-l�.
	public static CarrinhoDeCompras getInstancia(){
		if(INSTANCIA == null){
			INSTANCIA = new CarrinhoDeCompras();
		}return INSTANCIA;
	}
}
