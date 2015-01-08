package banco;

public abstract class Conta {

	protected double saldo;

	void deposita(double valor) {
		if (valor < 0) {
			throw new ValorInvalidoException("Você tentou depositar um valor negativo.");
		} else {
			this.saldo += valor;
		}
	}

	void saca(double valor) {
		this.saldo -= valor;
	}

	public abstract void atualiza(double taxa);

	public double getSaldo() {
		return this.saldo;
	}
}
