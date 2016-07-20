package ca.mcmaster.magarveylab.enums.substrates;

import ca.mcmaster.magarveylab.enums.interfaces.Structure;
import ca.mcmaster.magarveylab.enums.interfaces.SubstrateType;
import ca.mcmaster.magarveylab.enums.structures.NonproteinogenicAminoAcidStructures;

/**
 * Nonproteinogenic amino acids unique to nonribosomal peptides.
 * 
 * @author skinnider
 *
 */
public enum NonproteinogenicAminoAcids implements SubstrateType {

	_2_AMINO_ADIPIC_ACID(NonproteinogenicAminoAcidStructures._2_AMINO_ADIPIC_ACID, "2-amino-adipic acid", "Aad"),
	BETA_ALANINE(NonproteinogenicAminoAcidStructures.BETA_ALANINE, "Beta-alanine", "&beta;-Ala"),
	_3_HYDROXYANTHRANILATE(NonproteinogenicAminoAcidStructures._3_HYDROXYANTHRANILATE, "3-hydroxyanthranilic acid", "3HA"),
	AMINOCAPROLACTAM(NonproteinogenicAminoAcidStructures.AMINOCAPROLACTAM, "L-aminocaprolactam", "ACL"),
	BETA_HYDROXY_ASPARAGINE(NonproteinogenicAminoAcidStructures.BETA_HYDROXY_ASPARAGINE, "&beta;-hydroxy-asparagine", "OHAsn"),
	BETA_HYDROXY_ASPARTATE(NonproteinogenicAminoAcidStructures.BETA_HYDROXY_ASPARTATE, "&beta;-hydroxy-aspartic acid", "OHAsp"),
	METHYL_ASPARTIC_ACID(NonproteinogenicAminoAcidStructures.METHYL_ASPARTIC_ACID, "Methyl aspartic acid", "MeAsp"),
	BETA_HYDROXYTYROSINE(NonproteinogenicAminoAcidStructures.BETA_HYDROXYTYROSINE, "&beta;-hydroxytyrosine", "OHTyr"),
	_4R_4E_2_BUTENYL_4_METHYL_L_THREONINE(NonproteinogenicAminoAcidStructures._4R_4E_2_BUTENYL_4_METHYL_L_THREONINE, 
			"(4R)-4[(E)-2-butenyl]-4-methyl-L-threonine", "Bmt"),
	CAPREOMYCIDINE(NonproteinogenicAminoAcidStructures.CAPREOMYCIDINE, "Capreomycidine", "Cap"),
	DIAMINOPROPIONATE(NonproteinogenicAminoAcidStructures.DIAMINOPROPIONATE, "2,3-diaminopropionate", "Dap"),
	_2_4_DIAMINO_BUTYRIC_ACID(NonproteinogenicAminoAcidStructures._2_4_DIAMINO_BUTYRIC_ACID, "2,4-diamino-butyric acid", "Dab"),
	DEHYDROAMINOBUTYRIC_ACID(NonproteinogenicAminoAcidStructures.DEHYDROAMINOBUTYRIC_ACID, 
			"2,3-dehydroaminobutyric acid", "Dhab"),
	_3_5_DIHYDROXYPHENYLGLYCINE(NonproteinogenicAminoAcidStructures._3_5_DIHYDROXYPHENYLGLYCINE, 
			"3,5-dihydroxyphenylglycine", "Dhpg"),
	METHYL_GLUTAMATE(NonproteinogenicAminoAcidStructures.METHYL_GLUTAMATE, "Methyl-glutamate", "MeGlu"),
	_4_HYDROXY_PHENYLGLYCINE(NonproteinogenicAminoAcidStructures._4_HYDROXY_PHENYLGLYCINE, "Hydroxyphenylglycine", "Hpg"),
	HYDROXYVALINE(NonproteinogenicAminoAcidStructures.HYDROXYVALINE, "Hydroxyvaline", "OHVal"),
	AMINOBUTYRIC_ACID(NonproteinogenicAminoAcidStructures.AMINOBUTYRIC_ACID, "2-amino-butyric acid", "Abu"),
	BETA_HYDROXY_LEUCINE(NonproteinogenicAminoAcidStructures.BETA_HYDROXY_LEUCINE, "&beta;-hydroxy-leucine", "OHLeu"),
	BETA_LYSINE(NonproteinogenicAminoAcidStructures.BETA_LYSINE, "Beta-lysine", "&beta;-Lys"),
	ORNITHINE(NonproteinogenicAminoAcidStructures.ORNITHINE, "Ornithine", "Orn"),
	N5_HYDROXYORNITHINE(NonproteinogenicAminoAcidStructures.N5_HYDROXYORNITHINE, "N5-hydroxyornithine", "OHOrn"),
	HYDROXY_ACETYL_ORNITHINE(NonproteinogenicAminoAcidStructures.HYDROXY_ACETYL_ORNITHINE, "Hydroxyacetyl-ornithine", "HAOrn"),
	BETA_PHENYLALANINE(NonproteinogenicAminoAcidStructures.BETA_PHENYLALANINE, "&beta;-phenylalanine", "&beta;-Phe"),
	BETA_METHYL_PHENYLALANINE(NonproteinogenicAminoAcidStructures.BETA_METHYL_PHENYLALANINE, 
			"&beta;-methyl-phenylalanine", "MePhe"),
	BETA_HYDROXY_PHENYLALANINE(NonproteinogenicAminoAcidStructures.BETA_HYDROXY_PHENYLALANINE, 
			"&beta;-hydroxy-phenylalanine", "OHPhe"),
	PIPECOLIC_ACID(NonproteinogenicAminoAcidStructures.PIPECOLIC_ACID, "Pipecolic acid", "Pip"),
	HYDROXYPIPECOLIC_ACID(NonproteinogenicAminoAcidStructures.HYDROXYPIPECOLIC_ACID, "3-hydroxypipecolic acid", "OHPip"),
	PIPERAZIC_ACID(NonproteinogenicAminoAcidStructures.PIPERAZIC_ACID, "Piperazic acid", "Piz"),
	METHYL_PROLINE(NonproteinogenicAminoAcidStructures.METHYL_PROLINE, "Methyl-proline", "MePro"),
	ALLO_THREONINE(NonproteinogenicAminoAcidStructures.ALLO_THREONINE, "Allo-threonine", "Thr"),
	;
	
	private final Structure structure;
	private final String name;
	private final String abbreviation;

	private NonproteinogenicAminoAcids(final Structure structure, final String name,
			final String abbreviation) {
		this.structure = structure;
		this.name = name;
		this.abbreviation = abbreviation;
	}

	public String smiles() {
		return structure.smiles();
	}

	public String fullName() {
		return name;
	}

	public String abbreviation() {
		return abbreviation;
	}
	
}
