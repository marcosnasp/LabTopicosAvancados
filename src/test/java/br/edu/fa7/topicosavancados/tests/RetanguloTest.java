package br.edu.fa7.topicosavancados.tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import br.edu.fa7.topavancados.Retangulo;

@RunWith(Parameterized.class)
public class RetanguloTest {

	private double base;
	private double altura;
	private double area;
	
	public RetanguloTest(double base, double altura, double area) {
		this.base = base;
		this.altura = altura;
		this.area = area;
	}
	
	@Parameters
	public static Collection<Object[]> generateData() {
		return Arrays.asList(new Object[][] {
			{3.0, 10.0, 30.0},
			{2.0, 10.0, 20.0},
			{5.0, 10.0, 50.0}
		});
	}	
	
	@Test
	public void testCalculaArea() {
		Retangulo r = new Retangulo(this.base, this.altura);
		assertEquals(this.area, r.calcularArea(), 0.1);	
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCalculaAreaComNumeroNegativo() {
		
		this.base = -1.0;
		this.altura = 10;
		
		Retangulo r = new Retangulo(this.base, this.altura);
		r.calcularArea();
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCalculaAreaComBaseZero() {
		
		this.base = 0.0;
		this.altura = 10;
		
		Retangulo r = new Retangulo(this.base, this.altura);
		r.calcularArea();

	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCalculaAreaComAlturaValorZero() {
		
		this.base = 10.0;
		this.altura = 0.0;
		
		Retangulo r = new Retangulo(this.base, this.altura);
		r.calcularArea();

	}
	
}
