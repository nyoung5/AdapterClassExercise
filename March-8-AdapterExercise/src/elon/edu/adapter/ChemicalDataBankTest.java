package elon.edu.adapter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ChemicalDataBankTest {
	ChemicalDataBank chemDataBank;
	
	@BeforeEach
	void setUp() throws Exception {
	    chemDataBank = new ChemicalDataBank();
	}

	@AfterEach
	void tearDown() throws Exception {
		chemDataBank = null;
	}

	@Test
	void testGetCriticalMeltingPointWater() {
		float expectedTemp = 0.0f;
		float actualTemp = chemDataBank.getCriticalPoint("water","M");
		assertEquals(expectedTemp, actualTemp);
		
	}
	@Test
	void testGetCriticalMeltingPointBenzene() {
		float expectedTemp = 5.5f;
		float actualTemp = chemDataBank.getCriticalPoint("benzene","M");
		assertEquals(expectedTemp, actualTemp);
	}
	@Test
	void testGetCriticalMeltingPointAlcohol() {
		float expectedTemp = -114.1f;
		float actualTemp = chemDataBank.getCriticalPoint("alcohol","M");
		assertEquals(expectedTemp, actualTemp);
	}


	@Test
	void testGetMolecularStructureWater() {
		String expectedStruct = "H2O";
		String actualStruct = chemDataBank.getMolecularStructure("water");
		assertEquals(expectedStruct,actualStruct);
	}

	@Test
	void testGetMolecularWeightWater() {
		double expectedMW = 18.015;
		double actualMW = chemDataBank.getMolecularWeight("water");
		assertEquals(expectedMW, actualMW);
	}

}
