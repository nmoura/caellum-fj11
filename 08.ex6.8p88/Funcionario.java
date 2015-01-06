class Funcionario {

	private String nome;
	private String departamento;
	private double salario;
	private Data dataEntrada;
	private String rg;
	private static int identificador;

	public Funcionario() {
		this.identificador++;
	}

	public Funcionario(String nome) {
		this.setNome(nome);
		this.identificador++;
	}

	public int getTotalDeFuncionarios() {
		return this.identificador;
	}

	public String getFuncionario() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salário: " + this.salario);
		System.out.println("RG: " + this.rg);
		return (this.nome + ", " + this.departamento + ", " + this.salario + ", " + this.rg);
	}

	public void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salário: " + this.salario);
		System.out.println("Dia de Entrada: " + this.dataEntrada.dia);
		System.out.println("Mês de Entrada: " + this.dataEntrada.mes);
		System.out.println("Ano de Entrada: " + this.dataEntrada.ano);
		System.out.println("RG: " + this.rg);
	}

	public void recebeAumento(double aumento) {
		if (aumento > 0) {
			salario += aumento;
		}
	}

	public double getGanhoAnual() {
		double ganhoAnual = this.salario * 12;
		return ganhoAnual;
	}

	public void transfereDepartamento(String novoDepartamento) {
		departamento = novoDepartamento;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return this.departamento;
	}

	public void setDataEntrada(Data dataEntrada){
		this.dataEntrada = dataEntrada;
	}

	public Data getDataEntrada(Data dataEntrada){
		return this.dataEntrada;
	}

	public void setRg(String rg){
		this.rg = rg;
	}

	public String getRg(){
		return this.rg;
	}
}

class Data {
	int dia;
	int mes;
	int ano;
}

class Empresa {

	private String nome;
	private String cnpj;
	private Funcionario[] empregados;
	private int posicaoLivre;

	public void setEmpregados(Funcionario[] empregados) {
		this.empregados = empregados;
	}

	public void adicionaFuncionario(Funcionario f) {
		if (this.posicaoLivre < this.empregados.length){
			this.empregados[this.posicaoLivre++] = f;
		}
	}

	public Funcionario getFuncionario(int posicao) {
		return this.empregados[posicao];
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return this.cnpj;
	}

/*	boolean contem(Funcionario f) {
		for (int i = 0; i < this.posicaoLivre; i++) {
			if (this.empregados[i] == f) {
				System.out.println("Empregado " + i + " existe.");
				return true;
			}
		}
	}
*/
}
