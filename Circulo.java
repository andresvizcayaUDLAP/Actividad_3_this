package Geometria;

public class Circulo {
	
	float radio;
	
	public Circulo() {
		this(178190);
	}
	
	public Circulo(int radio) {
		this.radio = radio;
	}
	
	public double circunferencia() {
		double c = (2 * 3.141592) * radio;
		return c;
	}
	
	public double area() {
		double a = 3.141592 * Math.pow(radio, 2);
		return a;
	}
}
