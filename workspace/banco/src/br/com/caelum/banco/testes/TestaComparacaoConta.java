package br.com.caelum.banco.testes;

import br.com.caelum.banco.contas.ContaCorrente;

public class TestaComparacaoConta {

	public static void main(String[] args) {

		ContaCorrente cc1 = new ContaCorrente();
		ContaCorrente cc2 = new ContaCorrente();
		
		if (cc1.equals(cc2)) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}
	}

}
