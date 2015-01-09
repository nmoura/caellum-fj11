package br.com.caelum.banco.contas;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;		
	}

	@Override
	public int compareTo(ContaPoupanca o) {
		if (this.getNumero() < o.getNumero()) {
			return -1;
		}
		if (this.getNumero() > o.getNumero()) {
			return 1;
		}
		return 0;
	}

//	@Override
//	void atualiza(double taxa) {
//		super.atualiza(taxa *3);
//	}
}
