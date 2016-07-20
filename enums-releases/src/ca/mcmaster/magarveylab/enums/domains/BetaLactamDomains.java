package ca.mcmaster.magarveylab.enums.domains;

import ca.mcmaster.magarveylab.enums.DomainFamilies;

public enum BetaLactamDomains implements DomainType {
	
	// nonribosomal peptide beta-lactams 
	IAT("Isopenicillin N acyltransferase", "IAT.hmm", "IAT", 175.9d),
	IPNS("Isopenicillin N synthase", "IPNS.hmm", "IPNS", 250.0d),
	DOACS("Deacetoxycephalosporin C synthase", "DOACS.hmm", "DOACS", 158.5d), 

	// other beta lactam genes 
	CarA("Carbapenem CarA", "CarA.hmm", "CarA", 453.0d),
	PCAH("Clavam PCAH", "PCAH.hmm", "PCAH", 423.0d),
	TblS("Tabtoxin TblS", "TblS.hmm", "TblS", 850.0d),
	SulfCAS("Sulfazecin CAS", "SulfCAS.hmm", "SulfCAS", 416.0d),
	Sulfazecin_Thioesterase("Sulfazecin thioesterase", "Monobactam_thioesterase.hmm", "TE", 173.0d),
	SbnA("2,3-diaminopropanoic acid synthase A", "SbnA.hmm", "SbnA", 298.0d),
	APSK("APSK", "APSK.hmm", "APSK", 50.0d),
	SbnB("2,3-diaminopropionate synthase B", "SbnB.hmm", "SbnB", 305.0d),

	HAD_IIIC("Haloacid dehalogenase-like hydratase", "HAD_IIIC.hmm", "HAD<sub>IIIC</sub>", 35.0d),
	;
	
	private final String hmm;
	private final String abbreviation;
	private final String name;
	private final double cutoff;
	private BetaLactamDomains(final String name, final String hmm, final String abbreviation, final double cutoff) {
		this.name = name;
		this.hmm = hmm;
		this.abbreviation = abbreviation;
		this.cutoff = cutoff;
	}

	
	public String hmm() {
		return this.hmm; 
	}
	
	public String fullName() {
		return this.name;
	}
	
	public double cutoff() {
		return this.cutoff;
	}
	
	public String abbreviation() {
		return this.abbreviation;
	}
	
	public DomainFamilies family() {
		return DomainFamilies.BETA_LACTAM;
	}
	public static BetaLactamDomains getBetaLactamDomainsFromAbbreviation(String abv){
		for(BetaLactamDomains currentEnum : BetaLactamDomains.values()) {
			if(abv.equals(currentEnum.abbreviation())) {
				return(currentEnum);
			}
		}
		System.err.println("Warning: betaLactam domain abbreviation " + abv + " does not exist!.");
		return(null);
	}
	
	public static BetaLactamDomains getPossibleBetaLactamDomainsFromAbbreviation(String abv){
		for(BetaLactamDomains currentEnum : BetaLactamDomains.values()) {
			if(abv.equals(currentEnum.abbreviation())) {
				return(currentEnum);
			}
		}
		return(null);
	}
}
