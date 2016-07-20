package ca.mcmaster.magarveylab.enums.structures;

import ca.mcmaster.magarveylab.enums.interfaces.Structure;

/**
 * The 20 proteinogenic amino acid structures.
 * 
 * @author skinnider
 *
 */
public enum ProteinogenicAminoAcidStructures implements Structure {
	
	ALANINE("IC(C(C)NF)=O"),
	ASPARAGINE("FNC(C(I)=O)CC(N)=O"),
	ASPARTATE("FNC(C(I)=O)CC(O)=O"),
	ARGININE("FNC(C(I)=O)CCCNC(N)=N"),
	CYSTEINE("IC(C(CS)NF)=O"),
	GLYCINE("IC(CNF)=O"),
	GLUTAMINE("FNC(C(I)=O)CCC(N)=O"),
	GLUTAMATE("FNC(C(I)=O)CCC(O)=O"),
	HISTIDINE("FNC(CC1=CN=CN1)C(I)=O"),
	ISOLEUCINE("IC(C(C(C)CC)NF)=O"),
	LEUCINE("IC(C(CC(C)C)NF)=O"),
	LYSINE("FNC(C(I)=O)CCCCN"),
	METHIONINE("FNC(CCSC)C(I)=O"),
	PHENYLALANINE("FNC(CC1=CC=CC=C1)C(I)=O"),
	PROLINE("FN1CCCC1C(I)=O"),
	SERINE("IC(C(CO)NF)=O"),
	THREONINE("IC(C(C(C)O)NF)=O"),
	TRYPTOPHAN("FNC(CC1=CNC2=C1C=CC=C2)C(I)=O"),
	TYROSINE("FNC(CC1=CC=C(O)C=C1)C(I)=O"),
	VALINE("IC(C(C(C)C)NF)=O"),
	UNKNOWN("IC(C([*])NF)=O"),
	;
	
	private final String smiles;

	private ProteinogenicAminoAcidStructures(final String smiles) {
		this.smiles = smiles;
	}
	
	public String smiles() {
		return smiles;
	}

}
