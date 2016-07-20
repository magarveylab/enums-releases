package ca.mcmaster.magarveylab.enums.substrates;

import ca.mcmaster.magarveylab.enums.interfaces.Structure;
import ca.mcmaster.magarveylab.enums.interfaces.SubstrateType;
import ca.mcmaster.magarveylab.enums.structures.ProteinogenicAminoAcidStructures;

/**
 * The 20 proteinogenic amino acids.
 * 
 * @author skinnider
 *
 */
public enum ProteinogenicAminoAcids implements SubstrateType {
	
	ALANINE(ProteinogenicAminoAcidStructures.ALANINE, "Alanine", "A"),
	ASPARAGINE(ProteinogenicAminoAcidStructures.ASPARAGINE, "Asparagine", "N"),
	ASPARTATE(ProteinogenicAminoAcidStructures.ASPARTATE, "Aspartate", "D"),
	ARGININE(ProteinogenicAminoAcidStructures.ARGININE, "Arginine", "R"),
	CYSTEINE(ProteinogenicAminoAcidStructures.CYSTEINE, "Cysteine", "C"),
	GLYCINE(ProteinogenicAminoAcidStructures.GLYCINE, "Glycine", "G"),
	GLUTAMINE(ProteinogenicAminoAcidStructures.GLUTAMINE, "Glutamine", "Q"),
	GLUTAMATE(ProteinogenicAminoAcidStructures.GLUTAMATE, "Glutamate", "E"),
	HISTIDINE(ProteinogenicAminoAcidStructures.HISTIDINE, "Histidine", "H"),
	ISOLEUCINE(ProteinogenicAminoAcidStructures.ISOLEUCINE, "Isoleucine", "I"),
	LEUCINE(ProteinogenicAminoAcidStructures.LEUCINE, "Leucine", "L"),
	LYSINE(ProteinogenicAminoAcidStructures.LYSINE, "Lysine", "K"),
	METHIONINE(ProteinogenicAminoAcidStructures.METHIONINE, "Methionine", "M"),
	PHENYLALANINE(ProteinogenicAminoAcidStructures.PHENYLALANINE, "Phenylalanine", "F"),
	PROLINE(ProteinogenicAminoAcidStructures.PROLINE, "Proline", "P"),
	SERINE(ProteinogenicAminoAcidStructures.SERINE, "Serine", "S"),
	THREONINE(ProteinogenicAminoAcidStructures.THREONINE, "Threonine", "T"),
	TRYPTOPHAN(ProteinogenicAminoAcidStructures.TRYPTOPHAN, "Tryptophan", "W"),
	TYROSINE(ProteinogenicAminoAcidStructures.TYROSINE, "Tyrosine", "Y"),
	VALINE(ProteinogenicAminoAcidStructures.VALINE, "Valine", "V"),
	UNKNOWN(ProteinogenicAminoAcidStructures.UNKNOWN, "Unknown", "U"),
	;
	
	private final Structure structure;
	private final String name;
	private final String abbreviation;

	private ProteinogenicAminoAcids(final Structure structure, final String name,
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
