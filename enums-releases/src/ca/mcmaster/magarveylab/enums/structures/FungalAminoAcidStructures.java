package ca.mcmaster.magarveylab.enums.structures;

import ca.mcmaster.magarveylab.enums.interfaces.Structure;

/**
 * Amino acids specific to fungal natural product structures.
 * 
 * @author skinnider
 *
 */
public enum FungalAminoAcidStructures implements Structure {
	
	ANTHRANILATE("NC1=CC=CC=C1C(I)=O"),
	AMINOBUTYRIC_ACID("CCC(NF)C(I)=O"),
	AMINOISOBUTYRIC_ACID("CC(C(I)=O)(C)NF"),
	BETA_AMINOISOBUTYRIC_ACID("CC(C(I)=O)CNF"),
	HYDROXYPROLINE("O=C(I)C1N(CC(O)C1)F"),
	HYDROXYPHENYLPYRUVATE("O=C(C(CC1=CC=C(C=C1)O)OF)I"),
	DEHYDROALANINE("IC(C(NF)=C)=O"),
	HYDROXYGLUTAMINE("IC(C(NF)C(O)CC(N)=O)=O"),
	HOMOSERINE("OCCC(C(I)=O)NF"),
	HOMOTYROSINE("OC1=CC=C(C=C1)CCC(C(I)=O)NF"),
	HYDROXYHOMOTYROSINE_SULFATE("OC1=CC=C(C(O)CC(NF)C(I)=O)C=C1OS(=O)([O-])=O"),
	INDOLE_PYRUVIC_ACID("IC(C(OF)CC1=CNC2=CC=CC=C21)=O"),
	N_METHOXY_TRYPTOPHAN("IC(C(NF)CC1=CN(OC)C2=C1C=CC=C2)=O"),
	;
	
	private final String smiles;

	private FungalAminoAcidStructures(final String smiles) {
		this.smiles = smiles;
	}

	public String smiles() {
		return smiles;
	}
	
}
