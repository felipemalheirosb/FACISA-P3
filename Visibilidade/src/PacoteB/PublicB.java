package PacoteB;

public class PublicB {
	
	void metodoDefaultB(){
	}
	
	protected void metodoProtectedB(){
	}
	
	public void metodoPublicB(){
	}
	
	public static void main(String args[]) {

		// A classe default e public pertecem ao mesmo pacote.
		DefaultB classeDefaultB = new DefaultB();
		classeDefaultB.metodoDefaultB();
		classeDefaultB.metodoProtectedB();
		classeDefaultB.metodoPublicB();

		// A classe default do pacote A não pode ser instanciada em uma classe de outro pacote.
		//PacoteA.DefaultA classeDefaultA = new PacoteB.DefaultB();

		// A classe public de um pacote pode ser instanciada em qualquer pacote, mas os metodos 
		//protected e default não podem.
		PacoteA.PublicA classePublicPacoteA = new PacoteA.PublicA();
		classePublicPacoteA.metodoPublicA();
		//classePublicPacoteA.metodoProtectedA();
		//classePublicPacoteA.metodoDefaultA();

	}

}
