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
	void testImcMal(){
		double peso = -1;
		double altura = -1;
		double result = imcApplication.imc(peso, altura);

		assertEquals("No es un valor válido", result);
	}

	@Test
	void  testImc16(){
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
		double peso = 49;
		double altura = 1.70;
		String result = imcApplication.calcularIMC(peso, altura);
		assertEquals("Delgadez moderada", result);
	}


}
