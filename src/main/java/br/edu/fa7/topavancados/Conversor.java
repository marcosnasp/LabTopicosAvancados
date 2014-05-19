package br.edu.fa7.topavancados;


public class Conversor {

	
	public static double fahrToCelsius(double fahrTemp) {
		return 5.0 * (fahrTemp - 32) / 9.0;
	}
	
	public static double celsiusToFahr(double celciusTemp) {
		return (9.0 * celciusTemp / 5.0) + 32; 
	}
	
	public static double somar(double a, double b) {
		return a + b;
	}
	
	public static double subtrair(double a, double b) {
		return a - b;
	}
	
	public static String inverterLetras(String frase) {
		StringBuilder builder = new StringBuilder(frase);
		return builder.reverse().toString();
	}
	
}
