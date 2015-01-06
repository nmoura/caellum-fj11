class Funcionario {

	String nome;
	String departamento;
	double salario;
	Data dataEntrada;
	String rg;

	void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salário: " + this.salario);
		System.out.println("Dia de Entrada: " + this.dataEntrada.dia);
		System.out.println("Mês de Entrada: " + this.dataEntrada.mes);
		System.out.println("Ano de Entrada: " + this.dataEntrada.ano);
		System.out.println("RG: " + this.rg);
	}

	void recebeAumento(double aumento) {
		if (aumento > 0) {
			salario += aumento;
		}
	}

	double calculaGanhoAnual() {
		double ganhoAnual = this.salario * 12;
		return ganhoAnual;
	}

	void transfereDepartamento(String novoDepartamento) {
		departamento = novoDepartamento;
	}

}

class Data {
	int dia;
	int mes;
	int ano;
}

class Empresa {

	String nome;
	String cnpj;
	Funcionario[] empregados;
	int posicaoLivre;

	void adiciona(Funcionario f) {
		if (this.posicaoLivre < this.empregados.length){
			this.empregados[this.posicaoLivre++] = f;
		}
	}

	void mostraEmpregados() {
		for (int i = 0; i < this.posicaoLivre; i++) {
			this.empregados[i].mostra();
		}
	}

/*	boolean contem(Funcionario f) {
		for (int i = 0; i < this.posicaoLivre; i++) {
			if (this.empregados[i] == f) {
				System.out.println("Empregado " + i + " existe.");
				return true;
*/
			}
		}
	}
}
