package ca.mcmaster.magarveylab.enums.structures;

import ca.mcmaster.magarveylab.enums.interfaces.Structure;

/**
 * Malonate-derived polyketide monomer structures. 
 * 
 * @author skinnider
 *
 */
public enum PolyketideMonomerStructures implements Structure {
	
	_2_METHYLBUTERYL_COA("IC(C(CC)(C)F)=O"),
	BENZOYL_COA("IC(C(F)c1ccccc1)=O"),
	ETHYLMALONYL_COA("IC(C(CC)F)=O"),
	ISOBUTERYL_COA("IC(C(C)(C)F)=O"),
	MALONYL_COA("IC(CF)=O"),
	METHYLMALONYL_COA("IC(C(C)F)=O"),
	METHOXYLMALONYL_COA("IC(C(OC)F)=O"),
	PROPIONYL_COA("IC(C(CC)F)=O"),
	;
	
	private final String smiles;

	private PolyketideMonomerStructures(final String smiles) {
		this.smiles = smiles;
	}

	public String smiles() {
		return smiles;
	}
	
}
