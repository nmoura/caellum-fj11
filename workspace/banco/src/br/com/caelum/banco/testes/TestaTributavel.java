package br.com.caelum.banco.testes;

import br.com.caelum.banco.contas.ContaCorrente;
import br.com.caelum.banco.contas.Tributavel;

public class TestaTributavel {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.calculaTributos());
		
		// testando polimorfismo:
		Tributavel t = cc;
		System.out.println(t.calculaTributos());
 	}
}