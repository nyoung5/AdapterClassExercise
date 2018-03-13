package elon.edu.adapter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CompoundTest {
Compound compound;
	@BeforeEach
	void setUp() throws Exception {
		compound = new Compound("Water");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testDisplay() {
		String expected = "Compound: Water------\n" + 
				"Molecular Structure: H2O\n" + 
				"Molecular Weight: 18.015\n" + 
				"Melting Point: 0.0\n" + 
				"BoilingPoint: 100.0\n";
		String actual = compound.display();
		assertEquals(expected, actual);
	}

}
