package exerciciopart01;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ContaCorrenteTest {
	
	//SACAR

	@Test
	public void testSacar() throws Exception {
		ContaCorrente conta = new ContaCorrente(500, 1000);
		conta.sacar(100);
		Assert.assertEquals(400.00, conta.getSaldo(), 00.00);
	}
	@Test(expected = SaldoInsuficienteException.class)
	public void testSacarSaldoInsuficiente() throws Exception {
		ContaCorrente conta = new ContaCorrente(500, 1000);
		conta.sacar(600);
	}
	
	@Test(expected = Exception.class)
	public void testSacarValorNegativo() throws Exception {
		ContaCorrente conta = new ContaCorrente(500,1000);
		conta.sacar(-100);
	}
	
	@Test(expected = LimiteAtingidoException.class)
	public void testSacarLimiteAtingido() throws Exception {
		ContaCorrente conta = new ContaCorrente(500, 1000);
		conta.sacar(1001);
	}
	
	//DEPOSITAR
	
	@Test
	public void testDepositar()  throws Exception {
		ContaCorrente conta = new ContaCorrente(500, 1000);
		conta.depositar(100);
		Assert.assertEquals(600, conta.getSaldo(), 0.00);
	}
	
	@Test(expected = LimiteAtingidoException.class)
	public void testDepositarMaisQueLimite() throws Exception {
		ContaCorrente conta = new ContaCorrente(500, 1000);
		conta.depositar(600);
	}
	
	@Test(expected = Exception.class)
	public void testDepositarValorNegativo() throws Exception {
		ContaCorrente conta = new ContaCorrente(500, 1000);
		conta.depositar(-100);
	}
	
	//MUDAR VALOR DO LIMITE

	@Test
	public void testSetValorLimite()throws Exception {
		ContaCorrente conta = new ContaCorrente(500, 1000);
		conta.setValorLimite(0);
	}
	
	@Test(expected = LimiteAtingidoException.class)
	public void testSetValorLimiteAtingido() throws Exception {
		ContaCorrente conta = new ContaCorrente(500, 1000);
		conta.setValorLimite(7000);
	}
	
	@Test(expected = Exception.class)
	public void testSetValorLimiteNegativo() throws Exception {
		ContaCorrente conta = new ContaCorrente(500, 1000);
		conta.setValorLimite(-100);
	}

	

}
