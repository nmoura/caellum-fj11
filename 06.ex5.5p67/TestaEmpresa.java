class TestaEmpresa {

	public static void main(String[] args){

		Empresa empresa = new Empresa();
		empresa.empregados = new Funcionario[10];
		empresa.nome = "Developers Holding Co.";
		empresa.cnpj = "12345678/0001-30";

		for (int i=0; i < 10; i++) {
			Funcionario f = new Funcionario();
			f.salario = 1000 + i * 100;
			f.dataEntrada = new Data();
			f.dataEntrada.dia = 10 + i;
			f.dataEntrada.mes = 05;
			f.dataEntrada.ano = 1999;
			f.departamento = "TI";
			f.nome = "Nome " + i;
			empresa.adiciona(f);
		    empresa.contem(f);
		}

		empresa.mostraEmpregados();
	}
}
