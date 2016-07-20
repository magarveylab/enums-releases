package ca.mcmaster.magarveylab.enums.interfaces;

/**
 * A chemical structure.
 * 
 * @author skinnider
 *
 */
public interface Structure {

	/**
	 * A textual representation of this chemical structure in SMILES format.<br>
	 * <br>
	 * Note that the SMILES may be tagged with unusual atoms, primarily fluorine
	 * and iodine, for use in scaffold construction. In general, iodine
	 * indicates the point at which a monomer is extended (e.g. a carboxylic
	 * acid) while fluorine indicates the point at which a monomer extends a
	 * previous monomer (e.g. an alpha carbon).
	 * 
	 * @return the SMILES for this structure
	 */
	public String smiles();

}
