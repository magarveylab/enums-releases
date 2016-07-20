package ca.mcmaster.magarveylab.enums.domains;

import ca.mcmaster.magarveylab.enums.DomainFamilies;

/**
 * Enum for each HMM used to identify biosynthetic information within ribosomal
 * domains
 */
public enum RibosomalDomains implements DomainType {
	
	// precursors
	AgrD("AgrD.hmm", "A", "Auto-inducing peptide precursor", 35.0),
	BotA("BotA.hmm", "A", "Bottromycin precursor", 100.0),
	ComX("ComX.hmm", "ComX", "ComX precursor", 45.0),
	CypA("CypA.hmm", "A", "Linardin precursor", 39.0),
	Head_to_tail_precursor("HTT_precursor.hmm", "A", "Head-to-tail cyclized peptide precursor", 23.0),
	LAP_1("LAP_1.hmm", "A", "Putative linear azol(in)e-containing peptide precursor", 30.0),  
	LAP_2("LAP_2.hmm", "A", "Linear azol(in)e-containing peptide precursor, goadsporin-type", 30.0),
	LAP_3("LAP_3.hmm", "A", "Linear azol(in)e-containing peptide precursor, microcin B17-type", 30.0),
	LAP_4("LAP_4.hmm", "A", "Linear azol(in)e-containing peptide precursor, streptolysin-type", 30.0),
	LAP_5("LAP_5.hmm", "A", "Linear azol(in)e-containing peptide precursor, plantazolicin-type", 30.0),
	LanA_1("LanA_1.hmm", "A", "Lantipeptide precursor (clade A)", 19.0),
	LanA_2("LanA_2.hmm", "A", "Lantipeptide precursor (clade B)", 16.0),
	LanA_3("LanA_3.hmm", "A", "Lantipeptide precursor (clade C)", 15.0),
	LanA_4A("LanA_4a.hmm", "A", "Lantipeptide precursor (clade D1)", 17.0),
	LanA_4B("LanA_4b.hmm", "A", "Lantipeptide precursor (clade D2)", 16.5),
	LanA_5("LanA_5.hmm", "A", "Lantipeptide precursor (clade E)", 17.0),
	LanA_6("LanA_6.hmm", "A", "Lantipeptide precursor (clade F)", 40.0),
	LanA_7A("LanA_7a.hmm", "A", "Lantipeptide precursor (clade G1)", 17.0),
	LanA_7B("LanA_7b.hmm", "A", "Lantipeptide precursor (clade G2)", 21.0),
	LanA_8A("LanA_8a.hmm", "A", "Lantipeptide precursor (clade H1)", 17.0),
	LanA_8B("LanA_8b.hmm", "A", "Lantipeptide precursor (clade H2)", 28.0),
	LanA_9A("LanA_9a.hmm", "A", "Lantipeptide precursor (clade I1)", 18.0),
	LanA_9B("LanA_9b.hmm", "A", "Lantipeptide precursor (clade I2)", 30.0),
	ProcA("ProcA.hmm", "A", "Prochlorosin precursor", 40.0),  
	LazA("tpdA_a.hmm", "A", "Thiopeptide precursor", 10.0),
	Lasso_precursors("Lasso_precursor.hmm", "A", "Lasso peptide precursor", 10.0),
	LegA("LegA.hmm", "A", "Linaridin precursor (legonaridin-type)", 25.0), 
	MdnA("MdnA.hmm", "A", "Microviridin precursor", 25.0),
	PatE("patE.hmm", "A", "Cyanobactin precursor", 17.0),
	PoyA("poyA.hmm", "A", "Proteusin precursor", 80.0),
	SboA("sactipeptides_precursor.hmm", "A", "Sactipeptide precursor", 20.0),
	StrA("StrA.hmm", "A", "Streptide precursor", 30.0),
	SunA("SunA.hmm", "A", "Glycocin precursor", 45.0),
	TfxA("TfxA.hmm", "A", "Trifolitoxin precursor", 40.0),
	TvaA("TvaA.hmm", "A", "Thioviridamide precursor", /*100.0*/ 0),
	YmA("YmA.hmm", "A", "YM-216391 precursor", 70.0),
	
	// putative precursors
	Putative_lasso_peptide("", "A", "Putative lasso peptide precursor", 0.0),
	Putative_LAP("", "A", "Putative linear azol(in)e-containing peptide precursor", 0.0),
	Putative_lantipeptide("", "A", "Putative lantipeptide precursor", 0.0),
	Putative_thiopeptide("", "A", "Putative thiopeptide precursor", 0.0),
	
	// TIGRFAMs
	NHLP("TIGR03793.hmm", "NHLP", "Nitrile hydratase-related leader peptide (TIGR03793)", 99.6927),
	NHLP_Burk("TIGR03795.hmm", "NHLP", "Nitrile hydratase-related leader peptide, Burkholderia-specific (TIGR03795)", 126.443),
	Nif11("TIGR03798.hmm", "N11P", "Nif11-like leader peptide (TIGR03798)", 56.9701),
	
	// bacteriocin PFAMs
	Bacteriocin_II("Bacteriocin_II.hmm", "A", "Class II bacteriocin (PF01721)", 45.6),
	Bacteriocin_IIc("Bacteriocin_IIc.hmm", "A", "Bacteriocin class II with double-glycine leader peptide (PF10439)", 27.2),
	Bacteriocin_IIi("Bacteriocin_IIi.hmm", "A", "Aureocin-like type II bacteriocin (PF11758)", 50.3),
	
	// tailoring
	AgeF1("AgeF1.hmm", "AgeF1", "Bifunctional N-prenyltransferase/O-methyltransferase", 150.0),
	AgrB("AgrB.hmm", "AgrB", "Auto-inducing peptide endopeptidase", 70.0),
	AlbA("AlbA.hmm", "AlbA", "Sactipeptide Fe-S protein", 180.0),
	AlbE("AlbE.hmm", "AlbE", "Putative zinc-dependent protease (1)", 300.0),  
	AlbF("AlbF.hmm", "AlbF", "Putative zinc-dependent protease (2)", 300.0),
	Asparagine_synthase("asparagine_synthases.hmm", "CapC", "Lasso peptide asparagine synthase homolog", 140.0),
	BdbB("BdbB.hmm", "BdbB", "Disulfide bond-forming oxidoreductase", 100.0),
	BerH("BerH.hmm", "P450", "Valine &beta;-hydroxylase", 500.0),
	BotC("BotC.hmm", "BotC", "Bottromycin macrocyclodehydratase", 500.0),
	BotCD("BotCD.hmm", "BotCD", "Bottromycin thiazole-forming cyclodehydratase", 500.0),
	BotOMT("BotOMT.hmm", "BotOMT", "Bottromycin carboxymethylesterase", 400.0),
	BotP("BotP.hmm", "BotP", "Bottromycin leucyl-aminopeptidase", 500.0),
	BotRMT1("BotRMT1.hmm", "CMT", "Phenylalanine &beta;-C-methyltransferase", 400.0),
	BotRMT2("BotRMT2.hmm", "CMT", "Valine &beta;-C-methyltransferase", 400.0),
	BotRMT3("BotRMT3.hmm", "CMT", "Proline &beta;-C-methyltransferase", 400.0),
	CinX("CinX.hmm", "Ox", "&alpha;-ketoglutarate/iron(II)-dependent aspartate &beta;-hydroxylase", 100.0),
	Cinorf7("cinorf7.hmm", "Cin7", "Cinorf7-like lysinoalanine biosynthesis protein", 100.0),
	CltM("CltM.hmm", "CltM", "Tertiary thioether biosynthesis protein", 200.0),
	ComQ("ComQ.hmm", "ComQ", "ComX isoprenyltransferase", 100.0),
	McbB("dehydrogenase_B.hmm", "McbB", "Linear azole-containing peptide dehydratase", 100.0),
	McbC("cyclodehydratase_C.hmm", "McbC", "Linear azole-containing peptide cyclodehydratase C", 200.0),
	McbD("cyclodehydratase_D.hmm", "McbD", "Linear azole-containing peptide cyclodehydratase D", 200.0),
	CypH("CypH.hmm", "CypH", "Linardin dehydratase", 160.0),
	CypL("CypL.hmm", "CypL", "Linardin dehydratase", 150.0),
	CypM("CypM.hmm", "N,N-MT", "Linardin N,N-dimethyltransferase", 250.0),
	DUF95("DUF95.hmm", "DUF95", "DUF95-family enzyme", 20.0),
	ElxO("ElxO.hmm", "LanO", "Short chain dehydrogenase", 400.0),
	GarO("GarO.hmm", "LanO", "Lantithione S-oxidase", 500.0),
	GetJ("GetJ.hmm", "P450", "Cytochrome P450 (hydroxymethylproline biosynthesis)", 600.0),
	GodD("GodD.hmm", "GodD", "Putative azole-forming protein", 870.0),
	GodE("GodE.hmm", "GodE", "Putative azole-forming protein", 500.0),
	GodF("GodF.hmm", "GodF", "Goadsporin dehydroalanine-forming protein GodF", 500.0),
	GodG("GodG.hmm", "GodG", "Goadsporin dehydroalanine-forming protein GodG", 150.0),
	GodH("GodH.hmm", "AcT", "N-terminal acetyltransferase", 400.0),
	LanB("LanB.hmm", "LanB", "Lantipeptide dehydratase", 80.0),
	LanC("LanC.hmm", "LanC", "Lantipeptide cyclase", 80.0),
	LanKC("LanKC.hmm", "LanKC", "Lantipeptide kinase/cyclase (LanKC or LanL)", 320.0),
	LanM("LanM.hmm", "LanM", "Lantipeptide fused dehydratase/cyclase", 120.0),
	LanD("LanD.hmm", "LanD", "Aminovinylcysteine biosynthesis flavoprotein", 150.0),
	LanJ("LanJ.hmm", "LanJ", "Lantipeptide D-Ala biosynthesis protein", 400.0),
	LazB("LazB.hmm", "LazB", "Thiopeptide dehydratase", 280.0),
	LazC("LazC.hmm", "LazC", "Thiopeptide cycloaddition enzyme", 70.0),
	LazC_b("LazC_b.hmm", "LazC", "Thiopeptide cycloaddition enzyme (tetrahydropyridine-forming)", 200.0),
	LazE("LazE.hmm", "LazE", "Thiopeptide cyclodehydratase", 200.0),
	LazF("LazF.hmm", "LazF", "Thiopeptide azole-forming oxidase", 200.0),
	LegH("LegH.hmm", "LegH", "Linaridin dehydratase (legonaridin-type)", 900.0),
	MibH("MibH.hmm", "LanH", "Tryptophan (5) halogenase", 700.0),
	MibO("MibO.hmm", "P450", "Cytochrome P450 proline 3,4-dihydroxylase", 500.0),
	MdnB("MdnB.hmm", "MdnB", "Microviridin ATP-grasp enzyme", 280.0),
	MdnC("MdnC.hmm", "MdnC", "Microviridin ATP-grasp enzyme", 200.0),
	MdnD("MdnD.hmm", "AcT", "N-terminal acetyltransferase", 250.0),
	NocQ("NocQ.hmm", "OMT", "Dehydrothreonine O-methyltransferase", 200.0),
	NosA("NosA.hmm", "NosA", "NosA-type protein (C-terminal dealkylation/amide formation", 180.0),
	NosB("NosB.hmm", "P450", "Cytochrome P450 glutamate &gamma;-hydroxylase", 650.0),
	NosC("NosC.hmm", "P450", "Cytochrome P450 pyridine hydroxylase", 700.0),
	NosI("NosI.hmm", "NosI", "NosI-type protein (indole esterification)", 700.0),
	NosK("NosK.hmm", "NosK", "NosK-type protein (3,4-dimethylindolyl acyltransferase)", 300.0),
	NosL("NosL.hmm", "NosL", "NosL-type protein (indolic acid biosynthesis)", 700.0),
	NosN("NosN.hmm", "NosN", "NosN-type protein (3-methylindolic acid C4 methylation)", 700.0),
	PaeN("PaeN.hmm", "AcT", "N-terminal acetyltransferase", 200.0),  
	PatA("patA.hmm", "PatA", "Cyanobactin leader peptide protease", 550.0),
	PatD("PatD.hmm", "PatD", "Cyanobactin cyclodehydratase", 800.0),
	PatF("PatF.hmm", "PatF", "Cyanobactin prenyltransferase", 200.0),
	PatF_inactive("PatF_decoy.hmm", "PatF", "Inactive cyanobactin prenyltransferase", 250.0),
	PatG("PatG.hmm", "PatG", "Cyanobactin protease/macrocyclase without oxidative domain", 700.0),
	PatG_ox("PatG_ox.hmm", "PatG", "Cyanobactin protease/macrocyclase with oxidative domain", 1000.0),
	PoyBC("PoyBC.hmm", "PoyBC", "Proteusin poyB/poyC-type radical SAM C-methyltransferase", 700.0),
	PoyD("poyD.hmm", "PoyD", "Proteusin epimerase", 300.0),
	PoyE("PoyE.hmm", "PoyE", "Proteusin asparagine N-methyltransferase", 400.0),
	PoyF("PoyF.hmm", "PoyF", "Proteusin dehydratase", 380.0),
	PoyI("PoyI.hmm", "Ox", "Proteusin &beta;-hydroxylase", 300.0),
	PznL("PznL.hmm", "N,N-MT", "Linear azole-containing peptide N,N-dimethyltransferase", 250.0),
	SkfC("SkfC.hmm", "SkfC", "Putative membrane-bound protease", 400.0),
	SkfH("SkfH.hmm", "SkfH", "Disulfide bond-forming thioredoxin", 150.0),
	StrB("StrB.hmm", "StrB", "SPASM-domain-containing radical SAM enzyme", 77.0),
	StrC("StrC.hmm", "StrC", "Streptide transporter", 200.0),
	SunS("SunS.hmm", "SunS", "Glycocin S-glycosyltransferase", 180.0),
	TclD("TclD.hmm", "Ox", "Nonheme iron-dependent valine &beta;-hydroxylase", 500.0),
	TclO("TclO.hmm", "OMT", "Threonine O-methyltransferase", 500.0),
	TfxB("tfxB.hmm", "TfxB", "Trifolitoxin nitroreductase", 200.0),
	TfxC("tfxC.hmm", "TfxC",  "Trifolitoxin nitroreductase", 400.0),
	TpaJ("TpaJ.hmm", "TpaJ", "4-hydroxybutyrate dehydrogenase", 200.0),
	TpdI("TpdI_thiomuracin.hmm", "CMT", "Thiazole C-methyltransferase", 800.0),
	TpdJ1("TpdJ1.hmm", "P450", "Cytochrome P450 (phenylalanine &beta;-hydroxylation "
			+ "or isoleucine epoxidation) 1", 500.0),
	TpdJ2("TpdJ2.hmm", "P450", "Cytochrome P450 (phenylalanine &beta;-hydroxylation "
			+ "or isoleucine epoxidation) 2", 500.0),
	TpdL("TpdL.hmm", "CMT", "Thiazole C-methyltransferase", 600.0),
	TpdM("TpdM.hmm", "OMT", "5-hydroxymethylthiazole O-methyltransferase", 500.0),
	TpdT("TpdT.hmm", "NMT", "Asparagine N-methyltransferase", 500.0),
	TpdQ("TpdQ.hmm", "P450", "Cytochrome P450 (phenylalanine &beta;-hydroxylation)", 500.0),
	Transglutaminase("transglutaminases.hmm", "CapB", "Lasso peptide transglutaminase homolog", 50.0),
	TsrA("TsrA.hmm", "TsrA", "TsrA-type protein (2-methyltryptophan deaminase)", 500.0),
	TsrB("TsrB.hmm", "OMT", "Carboxylesterase", 500.0),
	TsrC("TsrC.hmm", "GATase", "TsrC-type C-terminal amidotransferase", 1000.0),
	TsrD("TsrD.hmm", "TsrD", "TsrD-type protein (quinaldic acid biosynthesis)", 200.0),
	TsrE("TsrE.hmm", "TsrE", "TsrE-type protein (methylindole-3-pyruvic acid dehydrogenase)", 500.0),
	TsrI("TsrI.hmm", "TsrI", "TsrI-type protein (quinaldic acid esterification)", 200.0),
	TsrR("TsrR.hmm", "P450", "Isoleucine epoxidase", 400.0),
	TsrT("TsrT.hmm", "TsrT", "TsrT-type protein (tryptophan 2-methyltransferase)", 600.0),
	TsrU("TsrU.hmm", "TsrU", "TsrU-type protein (stereospecific oxidoreductase)", 240.0),
	TvaC("TvaC.hmm", "TvaC", "Phosphotransferase family protein", 200.0d),
	TvaD("TvaD.hmm", "TvaD", "TvaD hypothetical protein (thioviridamide N-terminal serine biotransformation)", 200.0d),
	TvaE("TvaE.hmm", "TvaE", "Aminoglycoside phosphotransferase", 200.0d),
	TvaF("TvaF.hmm", "TvaF", "Thioviridamide aminovinylcysteine biosynthesis flavoprotein", 200.0),
	TvaG("TvaG.hmm", "N,N-MT", "Histidine N1,N3-dimethyltransferase", 400.0),
	TvaH("TvaH.hmm", "TvaH", "Thioviridamide thioamide biosynthesis protein", 500.0),
	TvaJ("TvaJ.hmm", "Ox", "Thioviridamide histidine &beta;-hydroxlase", 350.0),
	YmB1("YmB1.hmm", "B", "Phenyloxazoline-forming cyclodehydratase", 200.0),
	YmBC_a("YmBC_a.hmm", "B", "Cyclodehydratase-oxidase didomain enzyme, N-terminal subunit", 100.0),
	YmBC_b("YmBC_b.hmm", "C", "Cyclodehydratase-oxidase didomain enzyme, C-terminal subunit", 250.0),
	YmC1("YmC1.hmm", "C", "Phenyloxazole-forming oxidase", 100.0),
	YmE("YmE.hmm", "P450", "Cytochrome P450 phenylalanine &beta;-hydroxylase", 500.0),
	YmF("YmF.hmm", "YmF", "Macrocyclase", 100.0),
	
	// precursor recognition element
	//TODO: implementation for the HHpred paper predictions still needs to be added
	//this is a placeholder for future possible implementations
	//GenomeSearch also has some placeholder functionality for the future
	RRE("RRE.hmm", "RRE", "RiPP precursor peptide recognition element", 0.0),
	;
	
	private final String hmm;
	private final String abbreviation;
	private final String name;
	private final double cutoff;
	
	private RibosomalDomains(final String hmm, final String abbreviation, final String name, final double cutoff) {
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
		return DomainFamilies.RIBOSOMAL;
	}
	
	/**
	 * Determine whether this ribosomal domain is a lantipeptide precursor.
	 * 
	 * @return true if lantipeptide precursor
	 */
	public boolean isLantipeptidePrecursor() {
		return this == RibosomalDomains.LanA_1
				|| this == RibosomalDomains.LanA_2
				|| this == RibosomalDomains.LanA_3
				|| this == RibosomalDomains.LanA_4A
				|| this == RibosomalDomains.LanA_4B
				|| this == RibosomalDomains.LanA_5
				|| this == RibosomalDomains.LanA_6
				|| this == RibosomalDomains.LanA_7A
				|| this == RibosomalDomains.LanA_7B
				|| this == RibosomalDomains.LanA_8A
				|| this == RibosomalDomains.LanA_8B
				|| this == RibosomalDomains.LanA_9A
				|| this == RibosomalDomains.LanA_9B
				|| this == RibosomalDomains.ProcA 
				|| this == RibosomalDomains.Nif11;
	}
	
	/**
	 * Determine whether this ribosomal domain is a putative precursor peptide.
	 * 
	 * @return true if precursor peptide
	 */
	public boolean isPrecursor() {
		return isLantipeptidePrecursor()
				|| this == RibosomalDomains.AgrD
				|| this == RibosomalDomains.BotA
				|| this == RibosomalDomains.ComX
				|| this == RibosomalDomains.CypA
				|| this == RibosomalDomains.LegA
				|| this == RibosomalDomains.Head_to_tail_precursor
				|| this == RibosomalDomains.LAP_1
				|| this == RibosomalDomains.LAP_2
				|| this == RibosomalDomains.LAP_3
				|| this == RibosomalDomains.LAP_4
				|| this == RibosomalDomains.LAP_5
				|| this == RibosomalDomains.ProcA
				|| this == RibosomalDomains.LazA
				|| this == RibosomalDomains.Lasso_precursors
				|| this == RibosomalDomains.MdnA
				|| this == RibosomalDomains.PatE
				|| this == RibosomalDomains.PoyA
				|| this == RibosomalDomains.SboA
				|| this == RibosomalDomains.StrA
				|| this == RibosomalDomains.SunA
				|| this == RibosomalDomains.TfxA
				|| this == RibosomalDomains.TvaA
				|| this == RibosomalDomains.YmA
				
				// TIGRFAMs
				|| this == RibosomalDomains.NHLP
				|| this == RibosomalDomains.NHLP_Burk
				
				// putative
				|| this == RibosomalDomains.Putative_LAP
				|| this == RibosomalDomains.Putative_lasso_peptide
				|| this == RibosomalDomains.Putative_lantipeptide;
	}
	
}
