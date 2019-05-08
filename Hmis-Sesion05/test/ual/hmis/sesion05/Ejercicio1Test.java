package ual.hmis.sesion05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio1Test {

	@ParameterizedTest
	@CsvSource({"16,1", 
			 	"21,7",
			 	"50,1", 
			 	"11,11"})
	void testTransformar(int input, int expected) {
		Ejercicio1 c = new Ejercicio1();
		assertEquals(expected, c.transformar(input));
	}

}
