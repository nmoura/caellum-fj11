class Funcionario {

	String nome;
	String departamento;
	double salario;
	String dataEntrada;
	String rg;

	void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salário: " + this.salario);
		System.out.println("Data de Entrada: " + this.dataEntrada);
		System.out.println("RG: " + this.rg);
	}

	void recebeAumento(double aumento) {
		if (aumento > 0) {
			salario += aumento;
		}
	}

	double calculaGanhoAnual() {
		double ganhoAnual = salario * 12;
		return ganhoAnual;
	}

	void transfereDepartamento(String novoDepartamento) {
		departamento = novoDepartamento;
	}
}
