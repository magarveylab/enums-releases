package ca.mcmaster.magarveylab.enums.substrates;

import ca.mcmaster.magarveylab.enums.interfaces.Structure;
import ca.mcmaster.magarveylab.enums.interfaces.SubstrateType;
import ca.mcmaster.magarveylab.enums.structures.FungalAminoAcidStructures;

/**
 * Amino acid substrates specific to fungal natural products.
 * 
 * @author skinnider
 *
 */
public enum FungalAminoAcids implements SubstrateType {

	ANTHRANILATE(FungalAminoAcidStructures.ANTHRANILATE, "Anthranilic acid", "AA"),
	AMINOBUTYRIC_ACID(FungalAminoAcidStructures.AMINOBUTYRIC_ACID, "Aminobutyric acid", "Abu"),
	AMINOISOBUTYRIC_ACID(FungalAminoAcidStructures.AMINOISOBUTYRIC_ACID, "Aminoisobutyric acid", "Aib"),
	BETA_AMINOISOBUTYRIC_ACID(FungalAminoAcidStructures.BETA_AMINOISOBUTYRIC_ACID, 
			"&beta;-aminoisobutyric acid (f)", "&beta;-Aib"),
	HYDROXYPROLINE(FungalAminoAcidStructures.HYDROXYPROLINE, "Hydroxyproline", "OHPro"),
	HYDROXYPHENYLPYRUVATE(FungalAminoAcidStructures.HYDROXYPHENYLPYRUVATE, "4-hydroxyphenylpyruvate (f)", "OHPP"),
	DEHYDROALANINE(FungalAminoAcidStructures.DEHYDROALANINE, "Dehydroalanine", "Dha"),
	HYDROXYGLUTAMINE(FungalAminoAcidStructures.HYDROXYGLUTAMINE, "Hydroxyglutamine", "OHGln"),
	HOMOSERINE(FungalAminoAcidStructures.HOMOSERINE, "Homo-serine", "Hse"),
	HOMOTYROSINE(FungalAminoAcidStructures.HOMOTYROSINE, "Homo-tyrosine", "Hty"),
	HYDROXYHOMOTYROSINE_SULFATE(FungalAminoAcidStructures.HYDROXYHOMOTYROSINE_SULFATE, "Hydroxyhomotyrosine sulfate", "OHHty"),
	INDOLE_PYRUVIC_ACID(FungalAminoAcidStructures.INDOLE_PYRUVIC_ACID, "Indole pyruvic acid", "IPA"),
	N_METHOXY_TRYPTOPHAN(FungalAminoAcidStructures.N_METHOXY_TRYPTOPHAN, "N-methoxytryptophan", "OMeTrp"),
	;

	private final Structure structure;
	private final String name;
	private final String abbreviation;

	private FungalAminoAcids(final Structure structure, final String name,
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
