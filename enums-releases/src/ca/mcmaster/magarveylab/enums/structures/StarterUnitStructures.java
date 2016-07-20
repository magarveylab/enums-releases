package ca.mcmaster.magarveylab.enums.structures;

import ca.mcmaster.magarveylab.enums.interfaces.Structure;

/**
 * Non-fatty acid natural product starter unit structures. 
 * 
 * @author skinnider
 *
 */
public enum StarterUnitStructures implements Structure {
	
	// aromatic
	_2_3_DIHYDROXYBENZOIC_ACID("O=C(C1=C(O)C(O)=CC=C1)I"),
	SALICYLIC_ACID("IC(C1=C(O)C=CC=C1)=O"),
	CINNAMIC_ACID("IC(/C=C/C1=CC=CC=C1)=O"),
	_3_AMINO_5_HYDROXYBENZOIC_ACID("O=C(I)C1=CC(N)=CC(O)=C1"),
	_3_FORMAMIDO_5_HYDROXYBENZOIC_ACID("IC(C1=C(O)C(NC=O)=CC=C1)=O"),
	_3_HYDROXYPICOLINIC_ACID("IC(C1=C(O)C=CC=N1)=O"),
	_3_HYDROXYQUINALDIC_ACID("IC(C1=NC2=CC=CC=C2C=C1O)=O"),
	QUINOXALINE("IC(C1=NC2=CC=CC=C2N=C1)=O"),
	PHENYLACETATE("O=C(I)CC1=CC=CC=C1"),
	PARA_HYDROXYBENZOIC_ACID("O=C(C1=CC=C(C=C1)O)I"),
	PARA_AMINOBENZOIC_ACID("O=C(C1=CC=C(C=C1)N)I"),
	
	// small starters
	BETA_AMINOALANINAMIDE("ICC(C(N)=O)N"),
	CYCLOHEXANECARBOXYLATE("IC(C1CCCCC1)=O"),
	DIHYDROXYCYCLOHEXANECARBOXYLIC_ACID("OC1C(CCC(C1)C(I)=O)O"),
	ALKYLMALONYL_COA("IC(CF)=O"),
	_3_HYDROXYBUTANOIC_ACID("IC(CC(O)C)=O"),
	AMINOLEVULINIC_ACID("IC1=C(O)CCC1=O"),
	;

	private final String smiles;

	private StarterUnitStructures(final String smiles) {
		this.smiles = smiles;
	}

	public String smiles() {
		return smiles;
	}
	
}
