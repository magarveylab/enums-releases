package ca.mcmaster.magarveylab.enums.structures;

import ca.mcmaster.magarveylab.enums.interfaces.Structure;

/**
 * Nonproteinogenic amino acids unique to nonribosomal peptides.
 * 
 * @author skinnider
 *
 */
public enum NonproteinogenicAminoAcidStructures implements Structure {

	_2_AMINO_ADIPIC_ACID("O=C(O)C(NF)CCCC(I)=O"),
	BETA_ALANINE("O=C(C(C)CNF)I"),
	_3_HYDROXYANTHRANILATE("OC1=C(N)C(C(I)=O)=CC=C1"),
	AMINOCAPROLACTAM("O=C1NCCCCC1NF"),
	BETA_HYDROXY_ASPARAGINE("O=C(C(C(O)C(N)=O)NF)I"),
	BETA_HYDROXY_ASPARTATE("O=C(C(C(O)C(O)=O)NF)I"),
	METHYL_ASPARTIC_ACID("O=C(C(C(C(O)=O)C)NF)I"),
	BETA_HYDROXYTYROSINE("OC(C(C(I)=O)NF)c1ccc(O)cc1"),
	_4R_4E_2_BUTENYL_4_METHYL_L_THREONINE("IC(C(C(O)C(C)C/C=C/C)NF)=O"),
	CAPREOMYCIDINE("O=C(I)C(NF)C1NC(N)=NCC1"),
	DIAMINOPROPIONATE("O=C(I)C(NF)CN"),
	_2_4_DIAMINO_BUTYRIC_ACID("O=C(C(CCN)NF)I"),
	DEHYDROAMINOBUTYRIC_ACID("C/C=C(C(I)=O)\\NF"),
	_3_5_DIHYDROXYPHENYLGLYCINE("O=C(C(C1=CC(O)=CC(O)=C1)NF)I"),
	METHYL_GLUTAMATE("IC(C(C(CC(O)=O)C)NF)=O"),
	_4_HYDROXY_PHENYLGLYCINE("OC(C=C1)=CC=C1C(C(I)=O)NF"),
	HYDROXYVALINE("O=C(C(C(C)(C)O)NF)I"),
	AMINOBUTYRIC_ACID("CCC(NF)C(I)=O"),
	BETA_HYDROXY_LEUCINE("IC(C(C(O)C(C)C)NF)=O"),
	BETA_LYSINE("O=C(I)CC(NF)CCCN"),
	ORNITHINE("O=C(I)C(NF)CCCN"),
	N5_HYDROXYORNITHINE("O=C(I)C(NF)CCCNO"),
	HYDROXY_ACETYL_ORNITHINE("O=C(I)C(NF)CCCN(C(C)=O)O"),
	BETA_PHENYLALANINE("IC(CC(NF)C1=CC=CC=C1)=O"),
	BETA_METHYL_PHENYLALANINE("IC(C(C(C)C1=CC=CC=C1)NF)=O"),
	BETA_HYDROXY_PHENYLALANINE("IC(C(C(O)C1=CC=CC=C1)NF)=O"),
	PIPECOLIC_ACID("O=C(I)C1N(F)CCCC1"),
	HYDROXYPIPECOLIC_ACID("O=C(C1N(CCCC1O)F)I"),
	PIPERAZIC_ACID("O=C(C1N(NCCC1)F)I"),
	METHYL_PROLINE("O=C(C1N(F)CC(C1)C)I"),
	ALLO_THREONINE("OC(C)C(C(I)=O)NF"),
	;
	
	private final String smiles;

	private NonproteinogenicAminoAcidStructures(final String smiles) {
		this.smiles = smiles;
	}

	public String smiles() {
		return smiles;
	}

}
