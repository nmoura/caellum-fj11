package br.com.caelum.banco.testes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {

		System.out.println("Iniciando...");
		Collection<Integer> teste = new HashSet<>();

		int total = 30000;

		long inicioAdd = System.currentTimeMillis();

		for (int i = 0; i < total; i++) {
			teste.add(i);
		}

		long fimAdd = System.currentTimeMillis();
		long tempoAdd = fimAdd - inicioAdd;
		
		System.out.println("Tempo gasto: " + tempoAdd);
		
		long inicioBusca = System.currentTimeMillis();

		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}

		long fimBusca = System.currentTimeMillis();
		long tempoBusca = fimBusca - inicioBusca;

		System.out.println("Tempo gasto: " + tempoBusca);
	}

}
