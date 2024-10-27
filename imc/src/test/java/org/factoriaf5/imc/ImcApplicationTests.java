package org.factoriaf5.imc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ImcApplicationTests {

	private ImcApplication imcApplication;

	@BeforeEach
	public void init(){
		this.imcApplication = new ImcApplication();
	}

	@Test
	void contextLoads() {
	}
	
	@Test
	void testImc() {
		double peso = 70;
		double altura = 1.70;

		double result = imcApplication.imc(peso, altura);

		assertEquals(25,22, result);
	}

	@Test
	void testImc16(){
		double peso = 45;
		double altura = 1.70;
		String result = imcApplication.calcularIMC(peso, altura);
		assertEquals("Delgadez Severa", result);
	}

	@Test
	void testImc17(){
		double peso = 49;
		double altura = 1.70;
		String result = imcApplication.calcularIMC(peso, altura);
		assertEquals("Delgadez moderada", result);
	}

	@Test
	void testImc19(){
		double peso = 55;
		double altura = 1.75;
		String result = imcApplication.calcularIMC(peso, altura);
		assertEquals("Delgadez Leve", result);
	}

	@Test
	void testImc25(){
		double peso = 73.7;
		double altura = 1.72;
		String result = imcApplication.calcularIMC(peso, altura);
		assertEquals("Peso Normal", result);
	}

	@Test
	void testImc30(){
		double peso = 100;
		double altura = 1.84;
		String result = imcApplication.calcularIMC(peso, altura);
		assertEquals("Sobrepeso", result);
	}

	@Test
	void testImc35(){
		double peso = 92;
		double altura = 1.69;
		String result = imcApplication.calcularIMC(peso, altura);
		assertEquals("Obesidad Leve", result);
	}

	@Test
	void testImc40(){
		double peso = 100;
		double altura = 1.69;
		String result = imcApplication.calcularIMC(peso, altura);
		assertEquals("Obesidad Moderada", result);
	}

	@Test
	void testImcMas40(){
		double peso = 140;
		double altura = 1.70;
		String result = imcApplication.calcularIMC(peso, altura);
		assertEquals("Obesidad Mórbida", result);
	}

	@Test
	void testImcError(){
		double peso = 565464;
		double altura = 0;
		String result = imcApplication.calcularIMC(peso, altura);
		assertEquals("Peso y altura deben ser mayores a 0", result);
	}

	@Test
	void testImcError2(){
		double peso = 0;
		double altura = 43534;
		String result = imcApplication.calcularIMC(peso, altura);
		assertEquals("Peso y altura deben ser mayores a 0", result);
	}

	@Test
	void testImcError3(){
		double peso = 0;
		double altura = 0;
		String result = imcApplication.calcularIMC(peso, altura);
		assertEquals("Peso y altura deben ser mayores a 0", result);
	}


}
