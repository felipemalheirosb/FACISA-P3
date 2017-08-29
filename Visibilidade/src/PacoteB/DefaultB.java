package PacoteB;

class DefaultB {

	void metodoDefaultB() {
	}

	protected void metodoProtectedB() {
	}

	public void metodoPublicB() {
	}

	public static void main(String args[]) {

		// A classe default e public pertecem ao mesmo pacote.
		PublicB classePublicB = new PublicB();
		classePublicB.metodoProtectedB();
		classePublicB.metodoPublicB();
		classePublicB.metodoDefaultB();

		// A classe default do pacote A n�o pode ser instanciada em uma classe de outro pacote.
		//PacoteA.DefaultA classeDefaultA = new PacoteA.DefaultA();

		// A classe public de um pacote pode ser instanciada em qualquer pacote.
		PacoteA.PublicA classePublicPacoteA = new PacoteA.PublicA();
		classePublicPacoteA.metodoPublicA();

		// Visibilidade Protected s� permite o acesso da classe no mesmo pacote
		// em suas subclasses.
		//classePublicPacoteA.metodoProtectedA();
		// Visibilidade Default s� pode ser acessado dentro do mesmo pacote.
		// classePublicPacoteA.metodoDefaultA();
	}

}
