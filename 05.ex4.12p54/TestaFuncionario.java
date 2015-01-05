class TestaFuncionario {

	public static void main(String[] args){
		Funcionario f = new Funcionario();
		f.nome = "João da Silva";
		f.departamento = "RH";
		f.salario = 2800;
		f.dataEntrada = "01/01/2000";
		f.rg = "0123456789";
		//f.recebeAumento(482.33);

		f.mostra();

/*		Funcionario f2 = new Funcionario();
		f2.nome = "Maria Josefina";
		f2.departamento = "Marketing";
		f2.salario = 3800;
		f2.dataEntrada = "01/01/1998";
		f2.rg = "1234567890";
*/
		Funcionario f2 = f;

		f2.mostra();

		if (f == f2) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}
		
		/*
		System.out.println("Salário atual: " + f.salario);
		System.out.println("Ganho anual:   " + f.calculaGanhoAnual());
		System.out.println("Departamento atual de " + f.nome + ": " + f.departamento);
		f.transfereDepartamento("Suporte de TI");
		System.out.println("Novo departamento de " + f.nome + ": " + f.departamento);
		*/
	}
}
