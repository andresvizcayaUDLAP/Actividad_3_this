package Geometria;

public class Main {

	public static void main(String[] args) {
		
		Cuadrado cuadrado1 = new Cuadrado();
		System.out.println("Cuadrado");
		System.out.println("Diagonal: " + cuadrado1.diagonal());
		System.out.println("Perímetro: " + cuadrado1.perimetro());
		System.out.println("Área: " + cuadrado1.area());
		
		Circulo circulo1 = new Circulo();
		System.out.println("Círculo");
		System.out.println("Circunferencia: " + circulo1.circunferencia());
		System.out.println("Área: " + circulo1.area());
		
		System.out.println("----------------------------------------");
		
		Cuadrado cuadrado2 = new Cuadrado(178191);
		System.out.println("Cuadrado");
		System.out.println("Diagonal: " + cuadrado2.diagonal());
		System.out.println("Perímetro: " + cuadrado2.perimetro());
		System.out.println("Área: " + cuadrado2.area());
		
		Circulo circulo2 = new Circulo(178191);
		System.out.println("Círculo");
		System.out.println("Circunferencia: " + circulo2.circunferencia());
		System.out.println("Área: " + circulo2.area());
	}

}
