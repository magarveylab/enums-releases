package ca.mcmaster.magarveylab.enums.structures;

import ca.mcmaster.magarveylab.enums.interfaces.Structure;

/**
 * Type II polyketide starter unit structures. 
 * 
 * @author skinnider
 *
 */
public enum TypeIIPolyketideStarterStructures implements Structure {
	
	ACETATE("CC(I)=O"),
	MALONAMATE("IC(CC(N)=O)=O"),
	PROPIONATE("CCC(I)=O"),
	BUTYRATE("O=C(I)CCC"),
	ISOBUTYRATE("CC(C)C(I)=O"),
	_2_METHYLBUTYRATE("O=C(C(C)CC)I"),
	HEXADIENOATE("O=C(I)/C=C/C=C/C"),
	BENZOATE("O=C(I)C1=CC=CC=C1"),
	;
	
	private final String smiles;

	private TypeIIPolyketideStarterStructures(final String smiles) {
		this.smiles = smiles;
	}

	public String smiles() {
		return smiles;
	}
	
}
