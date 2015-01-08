package br.com.caelum.banco.contas;

public class ValorInvalidoException extends RuntimeException {

	public ValorInvalidoException(String msgErro) {
		super(msgErro);
	}

}