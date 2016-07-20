package ca.mcmaster.magarveylab.enums.substrates;

import ca.mcmaster.magarveylab.enums.interfaces.Structure;
import ca.mcmaster.magarveylab.enums.interfaces.SubstrateType;
import ca.mcmaster.magarveylab.enums.structures.FattyAcidStructures;

/**
 * Short and long chain fatty acid substrates.
 * 
 * @author skinnider
 *
 */
public enum FattyAcids implements SubstrateType {

	MYRISTATE(FattyAcidStructures.MYRISTATE, "Myristate", "C<sub>14</sub>"),
	LONG_CHAIN_FATTY_ACID(FattyAcidStructures.LONG_CHAIN_FATTY_ACID, "Long-chain fatty acid", "C<sub>10</sub>"), 
	SHORT_CHAIN_FATTY_ACID(FattyAcidStructures.SHORT_CHAIN_FATTY_ACID, "Short-chain fatty acid", "C<sub>6</sub>"),
	_3_AMINONON_5_ENOIC_ACID(FattyAcidStructures._3_AMINONON_5_ENOIC_ACID, "3-aminonon-5-enoic acid", "C<sub>9</sub>"),
	;
	
	private final Structure structure;
	private final String name;
	private final String abbreviation;

	private FattyAcids(final Structure structure, final String name,
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
