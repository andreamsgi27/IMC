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


}
