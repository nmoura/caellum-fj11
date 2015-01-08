package br.com.caelum.banco.contas;

/**
 * Classe responsável por modelar uma conta.
 * 
 * @author Nilton
 * @version 0.1
 * 
 *
 */

public abstract class Conta {

	protected double saldo;

	/**
	 * Método que verifica se o valor depositado é negativo e, caso seja positivo, manipula o saldo.
	 * 
	 * @param valor
	 */
	public void deposita(double valor) {
		if (valor < 0) {
			throw new ValorInvalidoException("Você tentou depositar um valor negativo.");
		} else {
			this.saldo += valor;
		}
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public abstract void atualiza(double taxa);

	public double getSaldo() {
		return this.saldo;
	}
}
