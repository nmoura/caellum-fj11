package interfaces;

public class Teste {
	
	public static void main(String[] args) {
		AreaCalculavel r = new Retangulo(3,2);
		AreaCalculavel q = new Quadrado(6);
		AreaCalculavel c = new Circulo(10);
		System.out.println("Área do retângulo 3x2" + r.calculaArea());
		System.out.println("Área do quadrado 6" + q.calculaArea());
		System.out.println("Área do círculo 10" + c.calculaArea());
	}
}
