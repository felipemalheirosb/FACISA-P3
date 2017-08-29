package facisa.p3.singleton;

public class Main {

	public static void main(String args[]) {

		CarrinhoDeCompras carrinhoDeCompras = CarrinhoDeCompras.getInstancia();
		System.out.println(carrinhoDeCompras);
		
		CarrinhoDeCompras carrinhoDeCompras2 = CarrinhoDeCompras.getInstancia();
		System.out.println(carrinhoDeCompras2);
	}
}
