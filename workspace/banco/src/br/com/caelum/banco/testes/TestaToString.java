package br.com.caelum.banco.testes;

import java.io.PrintStream;
import java.lang.System;

public class TestaToString {

	public static void main(String[] args) {

		String valor1 = "10";
		int valorinteiro = 0;
		
		int valor2 = 10;
		String valor2string;
		
		valorinteiro = Integer.parseInt(valor1);
		
		valor2string = Integer.toString(valor2);
		
		System.out.println(valorinteiro);
		System.out.println(valor2string);
		
		 PrintStream saida = System.out;
	}

}
