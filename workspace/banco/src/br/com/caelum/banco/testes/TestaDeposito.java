package br.com.caelum.banco.testes;

import br.com.caelum.banco.contas.Conta;
import br.com.caelum.banco.contas.ContaPoupanca;
import br.com.caelum.banco.contas.ValorInvalidoException;

public class TestaDeposito {

	public static void main(String[] args) {

		Conta cp = new ContaPoupanca();
		try {
			cp.deposita(-100);
		} catch (ValorInvalidoException e) {
			System.out.println(e);
		}

	}
}