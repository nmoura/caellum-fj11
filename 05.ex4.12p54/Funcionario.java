class Funcionario {

	String nome;
	String departamento;
	double salario;
	//String dataEntrada;
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
