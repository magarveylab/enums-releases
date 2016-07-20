package ca.mcmaster.magarveylab.enums.structures;

import ca.mcmaster.magarveylab.enums.interfaces.Structure;

/**
 * Alpha-keto or alpha-hydroxy acids.
 * 
 * @author skinnider
 *
 */
public enum AlphaKetoAcidStructures implements Structure {

	PYRUVATE("IC(C(C)OF)=O"), 
	ALPHA_KETOISOVALERATE("IC(C(C(C)C)OF)=O"), 
	ALPHA_KETOISOCAPROATE("IC(C(CC(C)C)OF)=O"), 
	_3_METHYL_2_OXOPENTANOIC_ACID("IC(C(OF)C(CC)C)=O"), 
	PHENYLPYRUVATE("IC(C(OF)CC1=CC=CC=C1)=O"),
	;

	private final String smiles;

	private AlphaKetoAcidStructures(final String smiles) {
		this.smiles = smiles;
	}

	public String smiles() {
		return smiles;
	}

}
