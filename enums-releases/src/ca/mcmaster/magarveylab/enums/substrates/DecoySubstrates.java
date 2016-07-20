package ca.mcmaster.magarveylab.enums.substrates;

import ca.mcmaster.magarveylab.enums.interfaces.SubstrateType;

/**
 * Substrates not actually associated with structures. 
 * 
 * @author skinnider
 *
 */
public enum DecoySubstrates implements SubstrateType {
	
	QUINOMYCIN_STARTER_UNIT_BIOSYNTHESIS("Hydroxyquinaldic acid biosynthesis", "A"),
	GLYCOPEPTIDE_STARTER_UNIT_BIOSYNTHESIS("Beta-hydroxytyrosine biosynthesis", "A"),
	;

	private final String name;
	private final String abbreviation;

	private DecoySubstrates(final String name, final String abbreviation) {
		this.name = name;
		this.abbreviation = abbreviation;
	}

	public String smiles() {
		return null;
	}

	public String fullName() {
		return name;
	}

	public String abbreviation() {
		return abbreviation;
	}
	
}
