package ca.mcmaster.magarveylab.enums;

import java.awt.Color;
import java.io.Serializable;

/**
 * Families of biosynthetic gene clusters.
 * 
 * @author skinnider
 *
 */
public enum ClusterFamilies implements Serializable {

	NONRIBOSOMAL_PEPTIDE(Colors.RED),
	TYPE_I_POLYKETIDE(Colors.BLUE),
	TYPE_II_POLYKETIDE(Colors.YELLOW),
	BETA_LACTAM(Colors.PINK),
	RIBOSOMAL(Colors.ORANGE),
	NULL(Colors.DARK_GREY),
	;

	private Colors color;
	
	private ClusterFamilies(Colors color) {
		this.color = color;
	}
	
	/**
	 * Get the color with which to graph this color on a circular genome graph.
	 * 
	 * @return the family color
	 */
	public Color color() {
		return Color.decode(color.hex());
	}
	
}
