package ca.mcmaster.magarveylab.enums.substrates;

import ca.mcmaster.magarveylab.enums.interfaces.Structure;
import ca.mcmaster.magarveylab.enums.interfaces.SubstrateType;
import ca.mcmaster.magarveylab.enums.structures.StarterUnitStructures;

/**
 * Non-fatty acid natural product starter units. 
 * 
 * @author skinnider
 *
 */
public enum StarterUnits implements SubstrateType {
	
	// aromatic
	_2_3_DIHYDROXYBENZOIC_ACID(StarterUnitStructures._2_3_DIHYDROXYBENZOIC_ACID, "2,3-dihydroxybenzoic acid", "2,3DHB"),
	SALICYLIC_ACID(StarterUnitStructures.SALICYLIC_ACID, "Salicylic acid", "Sal"),
	CINNAMIC_ACID(StarterUnitStructures.CINNAMIC_ACID, "Cinnamic acid", "Cinn"),
	_3_AMINO_5_HYDROXYBENZOIC_ACID(StarterUnitStructures._3_AMINO_5_HYDROXYBENZOIC_ACID, 
			"3-amino-5-hydroxybenzoic acid", "AHBA"),
	_3_FORMAMIDO_5_HYDROXYBENZOIC_ACID(StarterUnitStructures._3_FORMAMIDO_5_HYDROXYBENZOIC_ACID, 
			"3-formamido-5-hydroxybenzoic acid", "FHBA"),
	_3_HYDROXYPICOLINIC_ACID(StarterUnitStructures._3_HYDROXYPICOLINIC_ACID, "3-hydroxypicolinic acid", "3-HPA"),
	_3_HYDROXYQUINALDIC_ACID(StarterUnitStructures._3_HYDROXYQUINALDIC_ACID, "3-hydroxyquinaldic acid", "3-HQA"),
	QUINOXALINE(StarterUnitStructures.QUINOXALINE, "Quinoxaline-2-carboxylic acid", "QX"),
	PHENYLACETATE(StarterUnitStructures.PHENYLACETATE, "Phenylacetate", "PAA"),
	PARA_HYDROXYBENZOIC_ACID(StarterUnitStructures.PARA_HYDROXYBENZOIC_ACID, "Para-hydroxybenzoic acid", "PHBA"),
	PARA_AMINOBENZOIC_ACID(StarterUnitStructures.PARA_AMINOBENZOIC_ACID, "Para-aminobenzoic acid", "PABA"),
	
	// small starters
	BETA_AMINOALANINAMIDE(StarterUnitStructures.BETA_AMINOALANINAMIDE, "&beta;-aminoalaninamide", "&beta;-Aln"),
	CYCLOHEXANECARBOXYLATE(StarterUnitStructures.CYCLOHEXANECARBOXYLATE, "Cyclohexanecarboxylic acid", "CHC"),
	DIHYDROXYCYCLOHEXANECARBOXYLIC_ACID(StarterUnitStructures.DIHYDROXYCYCLOHEXANECARBOXYLIC_ACID, 
			"Dihydroxycyclohexanecarboxylic acid", "DHCHC"),
	ALKYLMALONYL_COA(StarterUnitStructures.ALKYLMALONYL_COA, "Alkylmalonyl-CoA", "CoL"),
	_3_HYDROXYBUTANOIC_ACID(StarterUnitStructures._3_HYDROXYBUTANOIC_ACID, "3-hydroxybutanoic acid", "OHBu"),
	AMINOLEVULINIC_ACID(StarterUnitStructures.AMINOLEVULINIC_ACID, "5-aminolevulinic acid", "5-ALA"),
	;

	private final Structure structure;
	private final String name;
	private final String abbreviation;

	private StarterUnits(final Structure structure, final String name,
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
