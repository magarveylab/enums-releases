package ca.mcmaster.magarveylab.enums.domains;

import ca.mcmaster.magarveylab.enums.DomainFamilies;

public enum GenericDomains implements DomainType {

	AMINO_ACID("", "", "", 0.0d), // dummy amino acid domain
	;
	
	private final String hmm;
	private final String abbreviation;
	private final String name;
	private final double cutoff;

	private GenericDomains(final String hmm, final String abbreviation,
			final String name, final double cutoff) {
		this.hmm = hmm;
		this.abbreviation = abbreviation;
		this.name = name;
		this.cutoff = cutoff;
	}

	public String hmm() {
		return hmm;
	}
	
	public String abbreviation() {
		return abbreviation;
	}
	
	public String fullName() {
		return name;
	}
	
	public double cutoff() {
		return cutoff;
	}
	
	public DomainFamilies family() {
		return DomainFamilies.NULL;
	}
	
}
