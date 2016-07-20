package ca.mcmaster.magarveylab.enums.interfaces;

/**
 * A substrate activated by a biosynthetic domain.
 * 
 * @author skinnider
 *
 */
public interface SubstrateType extends Structure {

	/**
	 * The HTML-friendly full name of the this substrate.
	 * 
	 * @return the name of this substrate
	 */
	public String fullName();

	/**
	 * An HTML-friendly abbreviated form of this substrate's name
	 * 
	 * @return the abbreviated name of the substrate
	 */
	public String abbreviation();

}
