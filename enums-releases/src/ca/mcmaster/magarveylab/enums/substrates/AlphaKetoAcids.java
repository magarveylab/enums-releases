package ca.mcmaster.magarveylab.enums.substrates;

import ca.mcmaster.magarveylab.enums.interfaces.Structure;
import ca.mcmaster.magarveylab.enums.interfaces.SubstrateType;
import ca.mcmaster.magarveylab.enums.structures.AlphaKetoAcidStructures;

/**
 * Alpha-keto or alpha-hydroxy acid substrates.
 * 
 * @author skinnider
 *
 */
public enum AlphaKetoAcids implements SubstrateType {

	PYRUVATE(AlphaKetoAcidStructures.PYRUVATE, "Pyruvate", "Pyr"), 
	ALPHA_KETOISOVALERATE(AlphaKetoAcidStructures.ALPHA_KETOISOVALERATE, "&alpha;-ketoisovalerate", "&alpha;kV"), 
	ALPHA_KETOISOCAPROATE(AlphaKetoAcidStructures.ALPHA_KETOISOCAPROATE, "&alpha;-ketoisocaproate", "&alpha;kL"), 
	_3_METHYL_2_OXOPENTANOIC_ACID(AlphaKetoAcidStructures._3_METHYL_2_OXOPENTANOIC_ACID, 
			"3-methyl-2-oxopentanoate", "&alpha;kI"), 
	PHENYLPYRUVATE(AlphaKetoAcidStructures.PHENYLPYRUVATE, "Phenylpyruvate", "&alpha;kF"), ;

	private final Structure structure;
	private final String name;
	private final String abbreviation;

	private AlphaKetoAcids(final Structure structure, final String name,
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
