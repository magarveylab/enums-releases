package ca.mcmaster.magarveylab.enums;

import ca.mcmaster.magarveylab.enums.clusters.RibosomalClusterTypes;

/**
 * Enum for the motifs generated in MEME for assistance in identifying the
 * leader peptide cleavage points.
 * 
 * @author prees, robynedgar, skinnider 
 *
 */
public enum RibosomalPrecursorMotifs {

	// fixed or vetted by MS
	AIP("AIP.txt", "Auto-inducing peptide motif", RibosomalClusterTypes.AUTO_INDUCING_PEPTIDE),
	Bacterial_HTT_A("HTT_A.txt", "Bacterial head-to-tail cyclized peptide motif A", RibosomalClusterTypes.BACTERIAL_HEAD_TO_TAIL_CYCLIZED),
	Bacterial_HTT_B("HTT_B.txt", "Bacterial head-to-tail cyclized peptide motif B", RibosomalClusterTypes.BACTERIAL_HEAD_TO_TAIL_CYCLIZED),
	Bacterial_HTT_C("HTT_C.txt", "Bacterial head-to-tail cyclized peptide motif C", RibosomalClusterTypes.BACTERIAL_HEAD_TO_TAIL_CYCLIZED),
	Bottromycin("Bottromycin.txt", "Bottromycin leader peptide motif", RibosomalClusterTypes.BOTTROMYCIN),
	ComX("ComX.txt", "ComX motif", RibosomalClusterTypes.COMX),
	Cyanobactin_clade_1_N1("PatE_clade1_N1.txt", "Cyanobactin (clade 1) N-terminal motif 1", RibosomalClusterTypes.CYANOBACTIN),
	Cyanobactin_clade_1_N2("PatE_clade1_N2.txt", "Cyanobactin (clade 1) N-terminal motif 2", RibosomalClusterTypes.CYANOBACTIN),
	Cyanobactin_clade_1_C("PatE_clade1_C.txt", "Cyanobactin (clade 1) C-terminal motif", RibosomalClusterTypes.CYANOBACTIN),	
	Cyanobactin_clade_2_N1("PatE_clade2_N1.txt", "Cyanobactin (clade 2) N-terminal motif 1", RibosomalClusterTypes.CYANOBACTIN),
	Cyanobactin_clade_2_N2("PatE_clade2_N2.txt", "Cyanobactin (clade 2) N-terminal motif 2", RibosomalClusterTypes.CYANOBACTIN),
	Cyanobactin_clade_2_R("PatE_clade2_repeating.txt", "Cyanobactin (clade 2) repeating motif 1", RibosomalClusterTypes.CYANOBACTIN),	
	Cyanobactin_clade_2_R2("PatE_clade2_repeating2.txt", "Cyanobactin (clade 2) repeating motif 2", RibosomalClusterTypes.CYANOBACTIN),	
	Glycocins_lead("Glycocins.txt", "Glycocin motif", RibosomalClusterTypes.GLYCOCIN),
	LAP_1("LAP_2.txt", "Linear azole-containing peptide motif 1", RibosomalClusterTypes.LINEAR_AZOLE_CONTAINING_PEPTIDE), // goadsporin-type
	LAP_2("LAP_3.txt", "Linear azole-containing peptide motif 2", RibosomalClusterTypes.LINEAR_AZOLE_CONTAINING_PEPTIDE), // microcin b17-type
	LAP_3("LAP_4.txt", "Linear azole-containing peptide motif 3", RibosomalClusterTypes.LINEAR_AZOLE_CONTAINING_PEPTIDE), // streptolysin-type
	LAP_4("LAP_5.txt", "Linear azole-containing peptide motif 4", RibosomalClusterTypes.LINEAR_AZOLE_CONTAINING_PEPTIDE), // plantazolicin-type
	LanA_A("LanA_A.txt", "Lantipeptide motif A", RibosomalClusterTypes.LANTIPEPTIDE), // SapB-AmfS family 
	LanA_B("LanA_B.txt", "Lantipeptide motif B", RibosomalClusterTypes.LANTIPEPTIDE), // clade 1
	LanA_C("LanA_C.txt", "Lantipeptide motif C", RibosomalClusterTypes.LANTIPEPTIDE), // clade 2
	LanA_D("LanA_D.txt", "Lantipeptide motif D", RibosomalClusterTypes.LANTIPEPTIDE), // pep5-epilancin family 
	LanA_E("LanA_E.txt", "Lantipeptide motif E", RibosomalClusterTypes.LANTIPEPTIDE), // actagardine family
	LanA_F("LanA_F.txt", "Lantipeptide motif F", RibosomalClusterTypes.LANTIPEPTIDE), // clade 3 
	LanA_G("LanA_G.txt", "Lantipeptide motif G", RibosomalClusterTypes.LANTIPEPTIDE), // labyrinthopeptin family
	LanA_H("LanA_H.txt", "Lantipeptide motif H", RibosomalClusterTypes.LANTIPEPTIDE), // pinensin family
	LanA_I("LanA_I.txt", "Lantipeptide motif I", RibosomalClusterTypes.LANTIPEPTIDE), // type IV lantipeptides
	LanA_J1("LanA_J1.txt", "Lantipeptide motif J1", RibosomalClusterTypes.LANTIPEPTIDE), // SmbA/BhtA2
	LanA_J2("LanA_J2.txt", "Lantipeptide motif J2", RibosomalClusterTypes.LANTIPEPTIDE), // SmbB/BhtA1
	LanA_K("LanA_K.txt", "Lantipeptide motif K", RibosomalClusterTypes.LANTIPEPTIDE), // TTPVC-motif type
	LanA_L("LanA_L.txt", "Lantipeptide motif L", RibosomalClusterTypes.LANTIPEPTIDE), // staphylococcin C55beta type
	Lasso_peptide("Lasso_peptides.txt", "Lasso peptide motif", RibosomalClusterTypes.LASSO_PEPTIDE),
	Linaridin("Linaridin.txt", "Linaridin motif", RibosomalClusterTypes.LINARIDIN),
	Linaridin_2("Linaridin_2.txt", "Linaridin motif (legonaridin type)", RibosomalClusterTypes.LINARIDIN),
	Microviridin("Microviridin_repeating.txt", "Microviridin repeating motif", RibosomalClusterTypes.MICROVIRIDIN),
	Prochlorosin("Prochlorosins.txt", "Prochlorosin motif", RibosomalClusterTypes.PROCHLOROSIN),
	Proteusin("Proteusins.txt", "Proteusin motif", RibosomalClusterTypes.PROTEUSIN),
	Streptide_N("streptide_N.txt", "Streptide motif (N-terminal)", RibosomalClusterTypes.STREPTIDE),
	Streptide_C("streptide_C.txt", "Streptide motif (C-terminal)", RibosomalClusterTypes.STREPTIDE),
	Thiopeptide_A("Thiopeptide_A.txt", "Thiopeptide motif A", RibosomalClusterTypes.THIOPEPTIDE), // thiostrepton-siomycin type
	Thiopeptide_B("Thiopeptide_B.txt", "Thiopeptide motif B", RibosomalClusterTypes.THIOPEPTIDE), // nosiheptide-nocathiacin type
	Thiopeptide_C("Thiopeptide_C.txt", "Thiopeptide motif C", RibosomalClusterTypes.THIOPEPTIDE), // large clade 1
	Thiopeptide_D("Thiopeptide_D.txt", "Thiopeptide motif D", RibosomalClusterTypes.THIOPEPTIDE), // C-terminal cleavage
	Thiopeptide_E("Thiopeptide_E.txt", "Thiopeptide motif E", RibosomalClusterTypes.THIOPEPTIDE), // large clade 2
	Thioviridamide("Thioviridamide.txt",  "Thioviridamide motif", RibosomalClusterTypes.THIOVIRIDAMIDE),
	Trifolitoxin("Trifolitoxin.txt", "Trifolitoxin motif", RibosomalClusterTypes.TRIFOLITOXIN),
	Sactipeptide_A("Sactipeptide_A.txt", "Sactipeptide motif A", RibosomalClusterTypes.SACTIPEPTIDE), // SkfA type
	Sactipeptide_B("Sactipeptide_B.txt", "Sactipeptide motif B", RibosomalClusterTypes.SACTIPEPTIDE), // SboA type 
	Sactipeptide_C("Sactipeptide_C.txt", "Sactipeptide motif C", RibosomalClusterTypes.SACTIPEPTIDE), // thuricin type 
	Sactipeptide_D("Sactipeptide_D.txt", "Sactipeptide motif D", RibosomalClusterTypes.SACTIPEPTIDE), // clade 4
	Sactipeptide_E("Sactipeptide_E.txt", "Sactipeptide motif E", RibosomalClusterTypes.SACTIPEPTIDE), // thurincin H type 
	YM216391_N("YM_N.txt", "YM216391-family motif (N-terminal)", RibosomalClusterTypes.YM216391),
	YM216391_C("YM_C.txt", "YM216391-family motif (C-terminal)", RibosomalClusterTypes.YM216391),
	;
	
	private final String filename;
	private final String name;
	private final RibosomalClusterTypes cluster;

	private RibosomalPrecursorMotifs(String filename, String name, RibosomalClusterTypes cluster) {
		this.filename = filename;
		this.name = name;
		this.cluster = cluster;
	}
	
	public String getFullName() {
		return name;
	}

	public String getFilename() {
		return filename;
	}

	public RibosomalClusterTypes getClusterType() {
		return cluster;
	}
	
}
