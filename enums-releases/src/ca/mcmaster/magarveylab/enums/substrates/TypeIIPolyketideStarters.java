package ca.mcmaster.magarveylab.enums.substrates;

import ca.mcmaster.magarveylab.enums.interfaces.Structure;
import ca.mcmaster.magarveylab.enums.interfaces.SubstrateType;
import ca.mcmaster.magarveylab.enums.structures.TypeIIPolyketideStarterStructures;

/**
 * Starter units for type II polyketide biosynthesis.
 * 
 * @author skinnider
 *
 */
public enum TypeIIPolyketideStarters implements SubstrateType {

	ACETATE(TypeIIPolyketideStarterStructures.ACETATE, "Acetate", "Ac"),
	MALONAMATE(TypeIIPolyketideStarterStructures.MALONAMATE, "Malonamate", "NHMal"),
	PROPIONATE(TypeIIPolyketideStarterStructures.PROPIONATE, "Propionate", "Pr"),
	BUTYRATE(TypeIIPolyketideStarterStructures.BUTYRATE, "Butyrate", "Bu"),
	ISOBUTYRATE(TypeIIPolyketideStarterStructures.ISOBUTYRATE, "Isobutyrate", "IBu"),
	_2_METHYLBUTYRATE(TypeIIPolyketideStarterStructures._2_METHYLBUTYRATE, "2-methylbutyrate", "MeBu"),
	HEXADIENOATE(TypeIIPolyketideStarterStructures.HEXADIENOATE,"Hexadienoate", "Hex"),
	BENZOATE(TypeIIPolyketideStarterStructures.BENZOATE,"Benzoate", "Bz"),
	;

	private final Structure structure;
	private final String name;
	private final String abbreviation;

	private TypeIIPolyketideStarters(final Structure structure, final String name,
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
