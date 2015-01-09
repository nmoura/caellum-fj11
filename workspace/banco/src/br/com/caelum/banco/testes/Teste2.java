package br.com.caelum.banco.testes;

import br.com.caelum.banco.contas.ContaCorrente;

public class Teste2 {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc);
		System.out.println(cc.toString());
	}
}