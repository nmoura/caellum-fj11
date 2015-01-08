package br.com.caelum.banco.contas;

public class ContaPoupanca extends Conta {

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;		
	}

//	@Override
//	void atualiza(double taxa) {
//		super.atualiza(taxa *3);
//	}
}
