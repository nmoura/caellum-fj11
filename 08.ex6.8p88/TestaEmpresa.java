class TestaEmpresa {

	public static void main(String[] args){

		Empresa empresa = new Empresa();
		empresa.setEmpregados(new Funcionario[10]);
		empresa.setNome("Developers Holding Co.");
		empresa.setCnpj("12345678/0001-30");

		for (int i=0; i < 10; i++) {
			Funcionario f = new Funcionario();
			f.setSalario(1000 + i * 100);
//			f.dataEntrada = new Data();
//			f.dataEntrada.dia = 10 + i;
//			f.dataEntrada.mes = 05;
//			f.dataEntrada.ano = 1999;
			f.setDepartamento("TI");
			f.setNome("Nome " + i);
			empresa.adicionaFuncionario(f);
//		    empresa.contem(f);
		}

		System.out.println(empresa.getFuncionario(2));
	}
}
