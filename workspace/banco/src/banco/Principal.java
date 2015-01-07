package banco;

public class Principal {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente();
		Conta conta2 = new ContaCorrente();
		Conta conta3 = new ContaPoupanca();
		
		conta.deposita(100.0);
		conta2.deposita(100.0);
		conta3.deposita(100.0);
		
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
		
		adc.roda(conta);
		adc.roda(conta2);
		adc.roda(conta3);
		
		System.out.println("Saldo Total: " + adc.getSaldoTotal());
	}
}