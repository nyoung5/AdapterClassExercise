package elon.edu.adapter;

import java.util.ArrayList;

/**
 * 
 * Class to be developed as part of exercise
 *
 */


public class Compound implements ChemicalCompound {
	String compound;
	ChemicalDataBank chemDataBank;

	public Compound(String compound) {
		this.compound = compound;
		chemDataBank = new ChemicalDataBank();
	}

	@Override
	public String display() {
		String description = "";
		String dComp = "Compound: " + compound + "------";
		String dBp = "BoilingPoint: " + getBoilingPoint();
		String dMp = "Melting Point: " + getMeltingPoint();
		String dMw = "Molecular Weight: " + getMolecularWeight();
		String dMs = "Molecular Structure: " + getMolecularFormula();
		ArrayList<String> descArr = new ArrayList<String>();
		descArr.add(dComp);
		descArr.add(dMs);
		descArr.add(dMw);
		descArr.add(dMp);
		descArr.add(dBp);
		for (String subStr : descArr) {
			description += subStr + "\n";
		}
		System.out.print(description);
		return description;
	}

	@Override
	public double getBoilingPoint() {
		float boilingPoint = chemDataBank.getCriticalPoint(compound,"B");
		
		return boilingPoint;
	}

	@Override
	public double getMeltingPoint() {
		float meltingPoint = chemDataBank.getCriticalPoint(compound,"M");
		return meltingPoint;
	}

	@Override
	public String getMolecularFormula() {
		String molecForm = chemDataBank.getMolecularStructure(compound);
		return molecForm;
	}

	@Override
	public double getMolecularWeight() {
		double molecWeight = chemDataBank.getMolecularWeight(compound);
		return molecWeight;
	}

}
