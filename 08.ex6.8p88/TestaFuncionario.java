class TestaFuncionario {

	public static void main(String[] args){
		Funcionario f = new Funcionario("João da Silva Sauron");
//		f.setNome("João da Silva");
		f.setDepartamento("RH");
		f.setSalario(2800);
		f.setRg("0123456789");

		Funcionario f2 = new Funcionario("Bilbo");
//		f.setNome("João da Silva");
		f2.setDepartamento("Condado");
		f2.setSalario(2800);
		f2.setRg("1234567890");

		Funcionario f3 = new Funcionario("Tauriel");
//		f.setNome("João da Silva");
		f3.setDepartamento("Floresta");
		f3.setSalario(3800);
		f3.setRg("2345678901");

/*		Data data = new Data();
		f.dataEntrada = data;
		f.dataEntrada.dia = 27;
		f.dataEntrada.mes = 8;
		f.dataEntrada.ano = 1990;
*/
		f.getFuncionario();
		f2.getFuncionario();
		f3.getFuncionario();

		System.out.println(f.getTotalDeFuncionarios());

	}
}
