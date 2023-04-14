package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	Calculadora tester = new Calculadora();
	
	@Test
	void prueba1() {
		assertEquals(240, tester.multiplicar(80, 3));
	}

	@Test
	void prueba2() {
		assertEquals(110, tester.dividir(tester.sumar(150, 180), 3));
	}

	@Test
	void prueba3() {
		assertNotEquals(605, tester.multiplicar(tester.restar(90, 50), 15));
	}

	@Test
	void prueba4() {
		assertNotEquals(2700, tester.multiplicar(tester.sumar(70, 40), 25));
	}

}