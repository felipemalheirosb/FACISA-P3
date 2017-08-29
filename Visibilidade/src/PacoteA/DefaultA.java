package PacoteA;

class DefaultA {
	
	void metodoDefaultA(){
	}
	
	protected void metodoProtectedA(){
	}
	
	public void metodoPublicA(){
	}
	
	
	public static void main(String args[]){
		
		//A classe default e public pertecem ao mesmo pacote.
		PublicA classePublicA = new PublicA();
		classePublicA.metodoDefaultA();
		classePublicA.metodoPublicA();
		classePublicA.metodoDefaultA();
		
		//A classe default do pacote B não pode ser instanciada em uma classe de outro pacote.
		//PacoteB.Default classeDefault = new PacoteB.Default();
		
		//A classe public de um pacote pode ser instanciada em qualquer pacote.
		PacoteB.PublicB classePublicPacoteB = new PacoteB.PublicB();
		classePublicPacoteB.metodoPublicB();
		
		//Visibilidade Protected só permite o acesso da classe no mesmo pacote em suas subclasses.
		//classePublicPacoteB.metodoProtected();
		//Visibilidade Default só pode ser acessado dentro do mesmo pacote.
		//classePublicPacoteB.metodoDefault();
	}

}
