package exerciciopart01;

import exerciciopart01.SaldoInsuficienteException;

public class ContaCorrente {
	
	private float limite;
	private float saldo;
	private float valorLimite;
	
	
	public ContaCorrente(float saldo, float valorLimite) {
		super();
		this.saldo = saldo;
		this.valorLimite = valorLimite;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}


	public void sacar(float valor) throws SaldoInsuficienteException, LimiteAtingidoException, ValorNegativoException {
		if(valor > this.valorLimite){
			throw new LimiteAtingidoException("Atingiu o limite de saque.");
		}
		if(valor < 0){
			throw new ValorNegativoException("Valor negativo"); 
		}
		if(valor > this.saldo){
			throw new SaldoInsuficienteException("Saldo Insuficiente");
		}
		this.saldo -= valor;
		
	}
	
	public void depositar(float valor) throws LimiteAtingidoException, ValorNegativoException {
		if(valor < 0){
			throw new ValorNegativoException("Valor negativo");
		}
		if((valor > valorLimite) || (valor + this.saldo > valorLimite)){
			throw new LimiteAtingidoException("Atingiu o Limite da conta");
		}
		saldo += valor;
	}
	
	public void setValorLimite(float valorLimite) throws LimiteAtingidoException, ValorNegativoException {
		if(valorLimite < 0){
			throw new ValorNegativoException("Valor do limite negativo");
		}
		if(valorLimite > this.limite){
			throw new LimiteAtingidoException("O Limite não pode ser maior que o Valor Limite");
		}
		this.valorLimite = valorLimite;
	}
	
	

}
