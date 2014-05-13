package br.edu.fa7.topicosavancados.tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import br.edu.fa7.topavancados.Conversor;

@RunWith(Parameterized.class)
public class ConversorTest {

	private double tempCelcius;
	private double tempFahr;
	
	public ConversorTest(double tempCelcius, double tempFahr) {
		this.tempCelcius = tempCelcius;
		this.tempFahr = tempFahr;
	}
	
	@Parameters
	public static Collection<Object[]> getParams() {
		return Arrays.asList(new Object[][] {
			// celcius, fahrenheit
			{27.0, 81.0},
			{100.0, 212.0},
			{0.0, 32.0},
			{-35.55, -32.0},
			{115.55, 240.0}
		});
	}
	
	@Test
	public void testConversorFahrToCelcius() {
		assertEquals(this.tempCelcius, Conversor.fahrToCelsios(this.tempFahr), 1);
	}

	@Test
	public void testConversorCelciusToFahr() {
		assertEquals(this.tempFahr, Conversor.celsiosToFahr(this.tempCelcius), 1);
	}

	@Test
	public void testInverterString() {
		assertEquals("asdf", Conversor.inverterLetras("fdsa"));
	}
	
}
