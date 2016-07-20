package ca.mcmaster.magarveylab.enums.structures;

import ca.mcmaster.magarveylab.enums.interfaces.Structure;

/**
 * Short and long chain fatty acid structures.
 * 
 * @author skinnider
 *
 */
public enum FattyAcidStructures implements Structure {

	MYRISTATE("CCCCCCCCCCCCCC(I)=O"),
	LONG_CHAIN_FATTY_ACID("O=C(I)CCCCCCCCC"), 
	SHORT_CHAIN_FATTY_ACID("O=C(I)CCCCC"),
	_3_AMINONON_5_ENOIC_ACID("CCC/C=C/CC(N)CC(I)=O"),
	;
	
	private final String smiles;

	private FattyAcidStructures(final String smiles) {
		this.smiles = smiles;
	}

	public String smiles() {
		return smiles;
	}

}
