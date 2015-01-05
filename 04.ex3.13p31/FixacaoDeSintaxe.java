class FixacaoDeSintaxe {
	public static void main (String [] args) {
		int num;
		// imprime todos os números de 150 a 300
		/* for (num = 150 ; num <=300 ; num++){
			System.out.println(num);
		}
		*/


		// imprime a soma de 1 até 1000
		/* int soma = 0;
		for (int i = 1 ; i <=1000 ; i++){
			soma += i;
			System.out.println(soma);
		}
		*/

		// imprime todos os múltiplos de 3, entre 1 e 100
		/* for (num = 1 ; num <= 100 ; num++){
			if (num % 3 == 0) {
				System.out.println(num + " é múltiplo de 3.");
			}
		}
		*/

		// imprime os fatoriais de 1 a 10
		/* for (long n = 1, fatorial = 1; n <= 40; n++) {
			fatorial = fatorial * n;
			System.out.println("O fatorial de " + n + " é " + fatorial);
		}
		*/

		// se x é par, imprime "x = x / 2". Se x for ímpar, imprime "x = 3 * x + 1"
		int x = 25;
		int mod = x % 2;
		if ( mod == 0 ){
			x = x / 2;
		}
		else{
			x = 3 * x + 1;
		}
		System.out.println(x);
		
	}
}
