package ca.mcmaster.magarveylab.enums.clusters;

/**
 * Enum for all ribosomal cluster subtypes.
 * 
 * @author skinnider
 */
public enum RibosomalClusterTypes implements ClusterType {
	
	AUTO_INDUCING_PEPTIDE("autoinducing peptide"),
	BACTERIAL_HEAD_TO_TAIL_CYCLIZED("bacterial head-to-tail cyclized peptide"),
	BOTTROMYCIN("bottromycin"),
	LANTIPEPTIDE("lantipeptide"), // just used to associate leader predictors w/ motifs 
	CLASS_I_LANTIPEPTIDE("class I lantipeptide"),
	CLASS_II_LANTIPEPTIDE("class II lantipeptide"),
	CLASS_III_IV_LANTIPEPTIDE("class III/IV lantipeptide"),
	COMX("ComX"),
	CYANOBACTIN("cyanobactin"),
	GLYCOCIN("glycocin"),
	LASSO_PEPTIDE("lasso peptide"),
	LINARIDIN("linaridin"),
	LINEAR_AZOLE_CONTAINING_PEPTIDE("linear azol(in)e-containing peptide"),
	MICROVIRIDIN("microviridin"),
	PROCHLOROSIN("prochlorosin"),
	PROTEUSIN("proteusin"),
	SACTIPEPTIDE("sactipeptide"),
	STREPTIDE("streptide"),
	THIOPEPTIDE("thiopeptide"),
	TRIFOLITOXIN("trifolitoxin-family peptide"),
	THIOVIRIDAMIDE("thioviridamide-family peptide"),
	YM216391("YM-216391-family peptide"),
	;
	
	private final String name;
	
	private RibosomalClusterTypes(final String name) {
		this.name = name;
	}
	
	public String fullName() {
		return name;
	}
	
}