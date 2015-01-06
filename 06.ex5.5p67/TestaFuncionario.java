class TestaFuncionario {

	public static void main(String[] args){
		Funcionario f = new Funcionario();
		f.nome = "João da Silva";
		f.departamento = "RH";
		f.salario = 2800;
		f.rg = "0123456789";

		Data data = new Data();
		f.dataEntrada = data;
		f.dataEntrada.dia = 27;
		f.dataEntrada.mes = 8;
		f.dataEntrada.ano = 1990;

		f.mostra();

	}
}
