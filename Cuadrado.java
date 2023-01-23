package Geometria;

public class Cuadrado {
	
	float lado;
	
	public Cuadrado() {
		this(178190);
	}
	
	public Cuadrado(int lado) {
		this.lado = lado;
	}
	
	public double diagonal() {
		double d = Math.sqrt(Math.pow(lado, 2) + Math.pow(lado, 2));
		return d;
	}
	
	public float perimetro() {
		float p = 4 * lado;
		return p;
	}
	
	public float area() {
		float a = lado * lado;
		return a;
	}
}
