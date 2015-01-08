package banco;

import java.io.FileNotFoundException;

public class Teste1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
		// try {
		new java.io.FileInputStream("arquivo.txt");
		// } catch (FileNotFoundException e) {
		// System.out.println(e.getMessage());
		// }
	}
}