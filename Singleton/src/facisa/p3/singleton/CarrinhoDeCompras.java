package facisa.p3.singleton;

public class CarrinhoDeCompras {
	
	public int qtdItens = 10;
	
	//Referência a única instancia da classe.
	private static CarrinhoDeCompras INSTANCIA;
	
	//Construtor privado porque não permite ser visualizado fora da classe.
	private CarrinhoDeCompras(){
	}
	
	//Verifica se a Instancia é nula, para criar uma instancia, e retorna-lá.
	public static CarrinhoDeCompras getInstancia(){
		if(INSTANCIA == null){
			INSTANCIA = new CarrinhoDeCompras();
		}return INSTANCIA;
	}
}
