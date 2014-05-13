package br.edu.fa7.topavancados;

public class Retangulo {
	
	private double base;
	private double altura;
	
	public Retangulo() {
		// TODO Auto-generated constructor stub
	}
		
	public Retangulo(double base, double altura) {
		this.setBase(base);
		this.setAltura(altura);
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		if(base <= 0) {
			throw new IllegalArgumentException("valor invalido para base" + base);
		}
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if(altura <= 0) {
			throw new IllegalArgumentException("valor invalido para altura" + altura);
		}
		this.altura = altura;
	}
	
	public double calcularArea() {
		return this.base * this.altura;
	}
	
	@Override
	public String toString() {
		return "{base : }" + this.base + ", altura: " + this.altura + ", area : " + this.calcularArea() + "}";
	}
	
}
