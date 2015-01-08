package banco;

public class ValorInvalidoException extends RuntimeException {

	public ValorInvalidoException(String msgErro) {
		super(msgErro);
	}

}