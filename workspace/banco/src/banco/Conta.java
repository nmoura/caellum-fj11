package banco;

public abstract class Conta {

	protected double saldo;

	void deposita(double valor) {
		this.saldo += valor;
	}

	void saca(double valor) {
		this.saldo -= valor;
	}

	public abstract void atualiza(double taxa);

	public double getSaldo() {
		return this.saldo;
	}
}
