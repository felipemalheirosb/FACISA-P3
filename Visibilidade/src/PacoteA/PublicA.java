package PacoteA;

public class PublicA {

	void metodoDefaultA() {
	}

	protected void metodoProtectedA() {
	}

	public void metodoPublicA() {
	}

	public static void main(String args[]) {

		// A classe default e public pertecem ao mesmo pacote.
		DefaultA classeDefaultA = new DefaultA();
		classeDefaultA.metodoDefaultA();
		classeDefaultA.metodoProtectedA();
		classeDefaultA.metodoPublicA();

		// A classe default do pacote B não pode ser instanciada em uma classe de outro pacote.
		//PacoteB.DefaultB classeDefaultB = new PacoteB.DefaultB();

		// A classe public de um pacote pode ser instanciada em qualquer pacote, mas os metodos 
		//protected e default não podem.
		PacoteB.PublicB classePublicPacoteB = new PacoteB.PublicB();
		classePublicPacoteB.metodoPublicB();
		//classePublicPacoteB.metodoProtectedB();
		//classePublicPacoteB.metodoDefaultB();

	}

}
