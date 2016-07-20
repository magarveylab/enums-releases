package ca.mcmaster.magarveylab.enums.substrates;

import ca.mcmaster.magarveylab.enums.interfaces.Structure;
import ca.mcmaster.magarveylab.enums.interfaces.SubstrateType;
import ca.mcmaster.magarveylab.enums.structures.PolyketideMonomerStructures;

/**
 * Malonate-derived polyketide monomers. 
 * 
 * @author skinnider
 *
 */
public enum PolyketideMonomers implements SubstrateType {
	
	_2_METHYLBUTERYL_COA(PolyketideMonomerStructures._2_METHYLBUTERYL_COA, "2-Methylbuteryl-CoA", "MeBu"),
	BENZOYL_COA(PolyketideMonomerStructures.BENZOYL_COA, "Benzoyl-CoA", "Bz"),
	ETHYLMALONYL_COA(PolyketideMonomerStructures.ETHYLMALONYL_COA, "Ethylmalonyl-CoA", "EtM"),
	ISOBUTERYL_COA(PolyketideMonomerStructures.ISOBUTERYL_COA, "Isobuteryl-CoA", "iBu"),
	MALONYL_COA(PolyketideMonomerStructures.MALONYL_COA, "Malonyl-CoA", "Mal"),
	METHYLMALONYL_COA(PolyketideMonomerStructures.METHYLMALONYL_COA, "Methylmalonyl-CoA", "MeM"),
	METHOXYLMALONYL_COA(PolyketideMonomerStructures.METHOXYLMALONYL_COA, "Methoxymalonyl-CoA", "OMeMal"),
	PROPIONYL_COA(PolyketideMonomerStructures.PROPIONYL_COA, "Propionyl-CoA", "Pr"),
	;
	
	private final Structure structure;
	private final String name;
	private final String abbreviation;

	private PolyketideMonomers(final Structure structure, final String name,
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
