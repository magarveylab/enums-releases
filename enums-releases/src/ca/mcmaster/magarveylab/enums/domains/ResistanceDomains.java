package ca.mcmaster.magarveylab.enums.domains;

import ca.mcmaster.magarveylab.enums.DomainFamilies;

public enum ResistanceDomains implements DomainType {

	// phil
	AMR_26(	"outfile66.hmm", "Beta_Lactam1", "Clinical-beta lactamase II", "Beta Lactam", 240),
	AMR_27(	"outfile07.hmm", "Beta_Lactam2", "Clinical-beta lactamase", "Beta Lactam", 430),
	AMR_28(	"outfile03.hmm", "Beta_Lactam3", "Clinical-beta lactamase II ", "Beta Lactam", 200),
	AMR_29(	"outfile67.hmm", "BJP", "Clinical-beta lactamase subclass B3 (metallo-beta lactamase)", "Beta Lactam", 179),
	AMR_30(	"outfile68.hmm", "BlaB", "Clinical-beta lactamase subclass B", "Beta Lactam", 231),
	AMR_31(	"outfile69.hmm", "blaI", "Clincal gene modulating beta lactam resistance", "Beta Lactam", 270),
	AMR_32(	"outfile70.hmm", "blaR1", "Clinical-gene modulating beta lactam resistance", "Beta Lactam", 1300),
	AMR_33(	"outfile71.hmm", "CARB-PSE", "Clinical-beta lactamase class A", "Beta Lactam", 320),
	AMR_34(	"outfile72.hmm", "cblA", "Clinical-cephalosporin beta lactamase", "Cephalosporin", 280),
	AMR_35(	"outfile73.hmm", "CepA", "Cephalosporin beta lactamase", "Cephalosporin", 290),
	AMR_36(	"outfile75.hmm", "cfxA", "Cephalosporin beta lactamase", "Cephalosporin", 216),
	AMR_37(	"outfile79.hmm", "ClassA", "Beta lactamase class A", "Beta Lactam", 420),
	AMR_38(	"outfile80.hmm", "ClassB", "Beta lactamase class B", "Beta Lactam", 720),
	AMR_39(	"outfile81.hmm", "AmpC", "Beta lactamase class C", "Beta Lactam", 430),
	AMR_40(	"outfile82.hmm", "Class D", "Beta lactamase class D", "Beta Lactam", 220),
	AMR_41(	"outfile83.hmm", "CMY_LAT_MOX_ACT_MIR_FOX", "Beta lactamase class C", "Beta Lactam", 535),
	AMR_42(	"outfile84.hmm", "ctxM", "Beta lactamase class A", "Beta Lactam", 550),
	AMR_43(	"outfile85.hmm", "DHA", "Beta Lactamase class C", "Beta Lactam", 485),
	AMR_44(	"outfile86.hmm", "DIM_GIM_SIM", "Class B1 metallo-beta-lactamase", "Beta Lactam", 300),
	AMR_45(	"outfile94.hmm", "Exo", "Beta lactamase class A", "Beta Lactam", 240),
	AMR_46(	"outfile96.hmm", "GES", "Beta lactamase class A", "Beta Lactam", 250),
	AMR_47(	"outfile97.hmm", "GOB", "Metallo-beta lactamases subclass B3", "Beta Lactam", 288),
	AMR_48(	"outfile98.hmm", "IMP", "Plasmid mediated IMP-type carbapenemase (metallo-beta-lactamase subclass B1)", 
			"Beta Lactam", 343),
	AMR_49(	"outfile99.hmm", "IND", "IND beta lactamases (metallo-beta-lactamase subclass B1)", "Beta Lactam", 242),
	AMR_50(	"outfile100.hmm", "KHM", "KHM beta-lactamases (metallo-beta-lactamase subclass B1)", "Beta Lactam", 340),
	AMR_51(	"outfile101.hmm", "KPC", "Klebsiella pneumoniae carbapenem resistant (KPC) beta-lactamases class A", "Beta Lactam", 371),
	AMR_52(	"outfile102.hmm", "L1", "L1 beta lactamase (metallo-beta-lactamase class B3)", "Beta Lactam", 585),
	AMR_53(	"outfile43.hmm", "Lactamase B", "Beta lactamase superfamily domain", "Beta Lactam", 240),
	AMR_54(	"outfile103.hmm", "LRA", "Metallo-beta-lactamase class B3", "Beta Lactam", 270),
	AMR_55(	"outfile108.hmm", "mecR1", "Gene modulating beta lactam resistance", "Beta Lactam", 600),
	AMR_56(	"outfile116.hmm", "moxA", "Beta lactamase class A", "Beta Lactam", 220),
	AMR_57(	"outfile121.hmm", "PC1", "Beta lactamase class A", "Beta Lactam", 250),
	AMR_58(	"outfile119.hmm", "NDM_ccrA", "NDM/CCRA family beta lactamase class B", "Beta Lactam", 256),
	AMR_59(	"outfile128.hmm", "sfh", "SFH Type beta lactamases (metallo-beta-lactamase subclass B2)", "Beta Lactam", 520),
	AMR_60(	"outfile129.hmm", "SHV_LEN", "Related SHV and LEN beta-lactamases (class A)", "Beta Lactam", 435),
	AMR_61(	"outfile130.hmm", "SME", "SME type beta-lactamase (class A)", "Beta Lactam", 490),
	AMR_62(	"outfile131.hmm", "SPM", "Sao Paulo metallo-beta-lactamase (metallo-beta lactamase subclass B1)", 
			"Beta Lactam", 120),
	AMR_63(	"outfile133.hmm", "SubclassB1", "Metallo-beta lactamase subclass B1", "Beta Lactam", 215),
	AMR_64(	"outfile134.hmm", "SubclassB2", "Metallo-beta lactamase subclass B2", "Beta Lactam", 440),
	AMR_65(	"outfile135.hmm", "Subclass B3", "Metallo-beta lactamases subclass B3", "Beta Lactam", 315),
	AMR_66(	"outfile136.hmm", "TEM", "TEM type beta lactamase class A", "Beta Lactam", 437),
	AMR_67(	"outfile05.hmm", "Transpeptidase", "Penicillin binding protein transpeptidase domain", "Beta Lactam", 390),
	AMR_68(	"outfile161.hmm", "VEB_PER", "VEB/PER type beta lactamases Class A", "Beta Lactam", 290),
	AMR_69(	"outfile162.hmm", "VIM", "Verone integron-encoded (VIM) metallo-beta-lactamase (metallo-beta lactamase subclass B1)", 
			"Beta Lactam", 183),
	AMR_75(	"outfile22.hmm", "Ligase_1", "D-Ala-D-Ala-ligase C", "Vancomycin", 100),
	AMR_76(	"outfile23.hmm", "Ligase_2", "D-Ala-D-Ala-ligase N", "Vancomycin", 100),
	AMR_77(	"outfile21.hmm", "DalaDala", "D-alanine--D-alanine ligase", "Vancomycin", 245.65),
	AMR_78(	"outfile149.hmm", "VanA", "VanA: D-Ala-D-Ala ligase that can synthesize D-Ala-D-Lac", "Vancomycin", 800),
	AMR_79(	"outfile150.hmm", "VanB", "VanB: D-Ala-D-Ala ligase that can synthesize D-Ala-D-Lac", "Vancomycin", 800),
	AMR_80(	"outfile151.hmm", "VanC", "VanC: D-Ala-D-Ala ligase that can synthesize D-Ala-D-Ser", "Vancomycin", 700),
	AMR_81(	"outfile152.hmm", "VanD", "VanD: D-Ala-D-Ala ligase that can synthesize D-Ala-D-Lac", "Vancomycin", 680),
	AMR_82(	"outfile153.hmm", "VanH", "VanH: D-specific alpha-ketoacid dehydrogenase that synthesizes D-lactate", "Vancomycin", 575),
	AMR_83(	"outfile154.hmm", "vanR", "VanR: transcriptional activator regulating VanA", "Vancomycin", 271),
	AMR_84(	"outfile155.hmm", "vanS", "VanS: transcriptional regulator of glycopeptide resistance genes", "Vancomycin", 230),
	AMR_85(	"outfile156.hmm", "vanT", "VanT: membrane bound serine racemase", "Vancomycin", 650),
	AMR_86(	"outfile157.hmm", "vanW", "VanW: glycopeptide resistance", "Vancomycin", 460),
	AMR_87(	"outfile158.hmm", "vanX", "VanX: glycopeptide resistance", "Vancomycin", 270),
	AMR_88(	"outfile159.hmm", "VanY", "VanY: glycopeptide resistance", "Vancomycin", 130),
	AMR_89(	"outfile160.hmm", "vanZ", "VanZ: glycopeptide resistance", "Vancomycin", 330),
	AMR_105(	"outfile18.hmm", "dhfr_1", "Trimethoprim target isoform: Dihydrofolate Reductase Isoform", "Trimethoprim", 220),
	AMR_107(	"outfile164.hmm", "Dihydropteroate", "Dantas-Sulfonamide target isoform: dihydropteroate synthase", "Sulfonamide", 560),
	AMR_120(	"outfile16.hmm", "CAT", "Chloramphenicol acetyltransferase", "Chloramphenicol", 80),
	AMR_121(	"outfile75.hmm", "CAT", "Chloramphenicol acetyltransferase", "Chloramphenicol", 216),
	AMR_122(	"outfile76.hmm", "CAT", "Chloramphenicol acetyltransferase", "Chloramphenicol", 75),
	AMR_123(	"outfile77.hmm", "C_MSF", "Chloramphenicol efflux pump", "Chloramphenicol", 250),
	AMR_124(	"outfile78.hmm", "CPT", "Chloramphenicol phosphotransferase", "Chloramphenicol", 250),
	AMR_125(	"outfile14.hmm", "CPT", "Chloramphenicol phosphotransferase", "Chloramphenicol", 70),
	AMR_151(	"outfile139.hmm", "TetA", "TetA tetracycline resistance MFS efflux pump", "Tetracycline", 447),
	AMR_152(	"outfile137.hmm", "TetA_B", "TetA/B tetracycline resistance MFS efflux pump", "Tetracycline", 520),
	AMR_153(	"outfile138.hmm", "TetA_G", "TetA/G tetracycline resistance MFS efflux pump", "Tetracycline", 550),
	AMR_154(	"outfile140.hmm", "TetD", "TetD tetracycline resistance MFS efflux pump", "Tetracycline", 550),
	AMR_155(	"outfile142.hmm", "TetH_TetJ", "TetH/TetJ family tetracycline resistance MFS efflux pumps", "Tetracycline", 490),
	AMR_156(	"outfile143.hmm", "TetM_TetW_TetO_TetS", "tetM/tetW/tetO/tetS tetracycline resistance ribosomal "
			+ "protection protein", "Tetracycline", 700),
	AMR_157(	"outfile144.hmm", "MFS_Tet", "Tetracycline resistance MFS efflux pump", "Tetracycline", 186),
	AMR_158(	"outfile145.hmm", "Tet_Resistance1", "Tetracycline resistance ribosomal protection protein", "Tetracycline", 940),
	AMR_159(	"outfile146.hmm", "TetX", "tetX: Tetracycline inactivation enzyme", "Tetracycline", 750),
	AMR_160(	"outfile147.hmm", "TetY", "tetY: Tetracycline resistance MFS efflux pump", "Tetracycline", 542),
	AMR_161(	"outfile32.hmm", "Tex_N", "Tex-like protein N-terminal domain", "Tetracycline", 157),
	AMR_162(	"outfile141.hmm", "TetE", "tetE: Tetracycline resistance MFS efflux pump", "Tetracycline", 480),
	AMR_165(	"outfile106.hmm", "Macro_glycosyl", "Macrolide glycosyltransferase: Inactivation enzyme", "Macrolides", 685),
	AMR_166(	"outfile46.hmm", "ACC3", "Aminoglycoside acetyltransferase", "Aminoglycosides", 350),
	AMR_167(	"outfile47.hmm", "ACC3-I", "Aminoglycoside acetyltransferase (AAC3-I)", "Aminoglycosides", 150),
	AMR_168(	"outfile49.hmm", "ACC6-I", "Aminoglycoside acetyltransferase (AAC6-I)", "Aminoglycosides", 350),
	AMR_169(	"outfile48.hmm", "ACC6-Ib", "Aminoglycoside acetyltransferase (AAC6-Ib)", "Aminoglycosides", 400),
	AMR_170(	"outfile50.hmm", "ACC6-II", "Aminoglycoside acetyltransferase (AAC6-II)", "Aminoglycosides", 350),
	AMR_171(	"outfile57.hmm", "ANT2", "Aminoglycoside nucleotidyltransferase 2", "Aminoglycosides", 480),
	AMR_172(	"outfile58.hmm", "ANT3", "Aminoglycoside nucleotidyltransferase 3", "Aminoglycosides", 450),
	AMR_173(	"outfile59.hmm", "ANT4", "Aminoglycoside nucleotidyltransferase 4", "Aminoglycosides", 490),
	AMR_174(	"outfile60.hmm", "ANT6", "Aminoglycoside nucleotidyltransferase 6", "Aminoglycosides", 530),
	AMR_175(	"outfile61.hmm", "ANT9", "Aminoglycoside nucleotidyltransferase 9", "Aminoglycosides", 202),
	AMR_176(	"outfile15.hmm", "Antibiotic_NAT", "Aminoglycoside 3-N-acetyltransferase", "Aminoglycosides", 100),
	AMR_177(	"outfile62.hmm", "APH3", "Aminoglycoside phosphotransferase 3", "Aminoglycosides", 70),
	AMR_178(	"outfile63.hmm", "APH6", "Aminoglycoside phosphotransferase 6", "Aminoglycosides", 370),
	AMR_179(	"outfile165.hmm", "ANT", "Aminoglycoside nucleotidyltransferase", "Aminoglycosides", 200),
	AMR_188(	"outfile95.hmm", "FRT", "Fluoroquinolone resistant DNA topoisomerase", "Fluoroquinolones", 1370),
	AMR_189(	"outfile123.hmm", "Quin", "Quninolone resistance protein (Qnr): antibiotic target protection protein", "Quinolones", 330),
	AMR_193(	"outfile36.hmm", "Blm", "Lyoxalase/bleomycin resistance protein/dioxygenase superfamily", "Bleomycin", 149.8),
	AMR_200(	"outfile45.hmm", "16s rRNA1", "16S ribosomal RNA methyltransferase", "MultiDrug", 370),
	AMR_201(	"outfile51.hmm", "ABC Trans1", "Multidrug ABC antibiotic efflux pump", "MultiDrug", 245),
	AMR_202(	"outfile06.hmm", "ABC Trans2", "Multidrug ABC transporters", "MultiDrug", 285),
	AMR_203(	"outfile17.hmm", "ABC Trans3", "Multidrug ABC transporters", "MultiDrug", 240),
	AMR_204(	"outfile08.hmm", "ABC Trans4", "ABC 2 type transporter", "MultiDrug", 650),
	AMR_205(	"outfile09.hmm", "Acetyl_Trans1", "Multidrug acetyltransferase 1", "MultiDrug", 130),
	AMR_206(	"outfile41.hmm", "Acetyl_Trans2", "Multidrug acetyltransferase 3", "MultiDrug", 180),
	AMR_207(	"outfile00.hmm", "Acetyl_Trans3", "Multidrug acetyltransferase 4", "MultiDrug", 150),
	AMR_208(	"outfile39.hmm", "Acetyl_Trans4", "Multidrug acetyltransferase 7", "MultiDrug", 180),
	AMR_209(	"outfile40.hmm", "Acetyl_Trans5", "Multidrug acetyltransferase 8", "MultiDrug", 190),
	AMR_210(	"outfile42.hmm", "Acetyl_Trans6", "Multidrug acetyltransferase 9", "MultiDrug", 130),
	AMR_211(	"outfile34.hmm", "Acr", "AcrB/AcrD/AcrF family", "MultiDrug", 200),
	AMR_212(	"outfile33.hmm", "Acetyl_Trans7", "Multidrug acetyltransferase", "MultiDrug", 125),
	AMR_213(	"outfile52.hmm", "adeI", "Membrane fusion protein of multi drug efflux complex", "Multidrug", 650),
	AMR_214(	"outfile53.hmm", "adeB", "Membrane fusion protein of multi drug efflux complex", "Multidrug", 1900),
	AMR_215(	"outfile54.hmm", "adeC-adeK-oprM", "Outer membrane factor the multidrug efflux complex", "Multidrug", 580),
	AMR_216(	"outfile55.hmm", "adeR", "Regulator of AdeABC efflux system", "Multidrug", 500),
	AMR_217(	"outfile56.hmm", "adeS", "Regulator of AdeABC efflux system", "Multidrug", 600),
	AMR_218(	"outfile30.hmm", "AminotransI_II", "Aminotransferase class I and II", "Multidrug", 372),
	AMR_219(	"outfile35.hmm", "AminotransIV", "Aminotransferase  class IV", "Multidrug", 100),
	AMR_220(	"outfile25.hmm", "APH", "Multidrug phosphotransferase family", "Multidrug", 172),
	AMR_221(	"outfile64.hmm", "baeR", "Multidrug resistance: subunit of gene modulating antibiotic efflux", "Multidrug", 420),
	AMR_222(	"outfile65.hmm", "baeS", "Subunit of gene modulating antibiotic efflux", "Multidrug", 1200),
	AMR_223(	"outfile74.hmm", "cfr", "Multidrug 23s rRNA methyltransferase", "Multidrug", 490),
	AMR_224(	"outfile87.hmm", "ermB", "Multidrug: subunit of efflux pump conferring antibiotic resistance", "Multidrug", 205),
	AMR_225(	"outfile88.hmm", "ermE", "Small multidrug resistance antibiotic efflux pump", "Multidrug", 150),
	AMR_226(	"outfile89.hmm", "Erm", "Erm family: 23s rRNA methyltransferase", "Multidrug", 250),
	AMR_227(	"outfile90.hmm", "Erm38", "Erm family: 23s rRNA methyltransferase", "Multidrug", 320),
	AMR_228(	"outfile91.hmm", "ErmA", "Erm family 23s rRNA methyltransferase", "Multidrug", 350),
	AMR_229(	"outfile92.hmm", "ErmB", "Erm family 23s rRNA methyltransferase", "Multidrug", 370),
	AMR_230(	"outfile93.hmm", "ErmC", "Erm family 23s rRNA methyltransferase", "Multidrug", 450),
//	AMR_231(	"outfile38.hmm", "Fad_Binding_2", "Multidrug Resistance: FAD Binding Domain", "Multidrug", 500),
	AMR_232(	"outfile11.hmm", "FmrO", "Multidrug rRNA methyltransferase", "Multidrug", 215),
	AMR_233(	"outfile31.hmm", "HTH_AraC", "AraC type resistance regulatory protein", "Multidrug", 100),
	AMR_234(	"outfile104.hmm", "macA", "macA: subunit of efflux pump conferring antibiotic resistance", "Multidrug", 550),
	AMR_235(	"outfile105.hmm", "macB", "macB: subunit of efflux pump conferring antibiotic resistance", "Multidrug", 450),
	AMR_236(	"outfile107.hmm", "marA", "marA: transcription factor induces MDR efflux pump AcrAB", "Multidrug", 300),
	AMR_237(	"outfile26.hmm", "marR", "marR: gene modulating possible resistance genes", "Multidrug", 100),
	AMR_238(	"outfile27.hmm", "marR_2", "MarR2: gene modulating resistance genes", "Multidrug", 100),
//	AMR_239(	"outfile37.hmm", "methyltrans 18", "Multidrug antibiotic Methyltransferase", "Multidrug", 120),
	AMR_240(	"outfile109.hmm", "mexA", "Multidrug mexA: membrane fusion protein of the MexAB-OprM multidrug efflux complex", "Multidrug", 580),
	AMR_241(	"outfile110.hmm", "mexC", "Multidrug mexC: membrane fusion protein of the MexCD-OprJ multidrug efflux complex", "Multidrug", 350),
	AMR_242(	"outfile111.hmm", "mexE", "Multidrug mexE: membrane fusion protein of the MexEF-OprN multidrug efflux complex", "Multidrug", 170),
	AMR_243(	"outfile112.hmm", "mexH", "Multidrug mexH: membrane fusion protein of the efflux complex MexGHI-OpmD", "Multidrug", 100),
	AMR_244(	"outfile113.hmm", "mexW-mexI", 
			"A grouping of related mexW and mexI subunits of efflux pumps conferring antibiotic resistance", "Multidrug", 700),
	AMR_245(	"outfile114.hmm", "mexX", "Multidrug mexX:  subunit of efflux pump conferring antibiotic resistance", "Multidrug", 271),
	AMR_246(	"outfile01.hmm", "MFS1", "Multidrug MFS transporter", "Multidrug", 175),
	AMR_248(	"outfile115.hmm", "MFS", "Multidrug MFS antibiotic efflux pump", "Multidrug", 245),
	AMR_249(	"outfile117.hmm", "mprF", "Multidrug mprF: peptide antibiotic resistance gene", "Multidrug", 1400),
	AMR_250(	"outfile118.hmm", "msbA", "Multidrug msbA: ATP-binding cassette (ABC) antibiotic efflux pump", "Multidrug", 500),
	AMR_251(	"outfile120.hmm", "norA", "Multidrug Major facilitator superfamily (MFS) antibiotic efflux pump", "Multidrug", 370),
	AMR_252(	"outfile44.hmm", "Nuc_H_Symport", "Multidrug Nucleoside H+ symporter", "Multidrug", 250),
	AMR_253(	"outfile122.hmm", "phoQ", "phoQ: subunit of gene modulating multi antibiotic efflux", "Multidrug", 750),
	AMR_254(	"outfile124.hmm", "ramA", "ramA: gene modulating multi antibiotic efflux", "Multidrug", 260),
	AMR_255(	"outfile125.hmm", "RND1", "resistance-nodulation-cell division (RND) antibiotic efflux pump", "Multidrug", 940),
	AMR_256(	"outfile126.hmm", "robA", "obA: transcriptional activator of AcrAB antibiotic efflux pump", "Multidrug", 620),
	AMR_258(	"outfile131.hmm", "soxR", "soxR: mutant efflux regulatory protein conferring antibiotic resistance", "Multidrug", 190),
	AMR_259(	"outfile19.hmm", "Thymidylat_synt", "Thymidylate synthase: target redundancy/overexpression", "Multidrug", 108.35),
	AMR_260(	"outfile04.hmm", "Bcr_cfla", "Efflux Bcr CflA: drug resistance transporter", "Multidrug", 200.9),
	AMR_261(	"outfile10.hmm", "ermB", "EmrB: drug resistance MFS transporter", "Multidrug", 230.2),
	AMR_262(	"outfile13.hmm", "MATE_efflux", "matE: MATE efflux family protein", "Multidrug", 147.4),
	AMR_263(	"outfile12.hmm", "drrA", "Daunorubicin resistance ABC transporter", "Multidrug", 400),
	AMR_264(	"outfile29.hmm", "soxR", "Redox-sensitive transcriptional activator SoxR", "Multidrug", 116.9),
	AMR_265(	"outfile20.hmm", "ThySym", "Thymidylate synthase: target redundancy/overexpression", "Multidrug", 108.35),
	AMR_266(	"outfile148.hmm", "tolC", "tolC: subunit of efflux pump conferring antibiotic resistance", "Multidrug", 570),
	AMR_267(	"outfile28.hmm", "Whib", "Multidrug transcription factor WhiB", "Multidrug", 100),
	AMR_268(	"outfile163.hmm", "RND_MFP", "Multidrug efflux transporter", "Multidrug", 250),

	//XXX chad 
	AMR_9(		"A500359_phosphotransferase.hmm", "orf21", "A500359 phosphotransferase", "A500359", 300.0),
	AMR_12(		"A54145_ABC_transporter.hmm", "IptM/IptN", "A54145 ABC transporter", "A54145", 300.0),
	AMR_186(	"albicidin_ABC_transporters.hmm", "albF", "Albicidin ABC transporter", "Albicidin", 600.0),
	AMR_185(	"albicidin_pentapeptide_repeats.hmm", "albG", "Albicidin pentapeptide repeats", "Albicidin", 350.0),
	AMR_101(	"albomycin_seryltRNAsynthetase.hmm", "ambK", "Albomycin target isoform: seryl-tRNA synthetase", "", 700.0),
	AMR_194(	"AllRND_transporters.hmm", "RND Type Antibiotic transporters", "RND transporter", "Multidrug", 320.0),
	AMR_113(	"althiomycin-MFS_transporter.hmm", "almE", "Althiomycin MFS transporter", "Althiomycin", 300.0),
	AMR_138(	"availamycin-ABCtransporter.hmm", "Avilamycin ABC transporter", "Avilamycin ABC transporter", "Avilamycin", 500.0),
	AMR_192(	"bleomycin-glyoxylases.hmm", "BlmA", "Bleomycin glyoxylase resistance protein", "Bleomycin", 147.0),
	AMR_10(		"caprazamycin-acetyl_transferase.hmm", "cpz12/cpz27", "Caprazamycin acetyltransferase", "Caprazamycin", 720.0),
	AMR_70(		"carboxypeptidases.hmm", "VanY/VanyB, ", "D-Ala-D-Ala carboxypeptidase", "A40926, balhimycin", 100.0),
	AMR_199(	"cationic_multidrug_transporters.hmm", "QacF/emrE", "Cationic multidrug transporter", "Multidrug", 135.0),
	AMR_15(		"CDA_phosphotransferase.hmm", "hasP", "Calcium-dependent antibiotic phosphotransferase", 
			"Calcium-dependent antibiotic", 600.0),
	AMR_25(		"cephamycin-PBP.hmm", "pbp1a", "Cephamycin penicillin-binding protein", "Cephamycin", 770.0),
	AMR_119(	"chloramphenicol_acetyltransferases.hmm", "Cata10/cata12/cata2", "Chloramphenicol acetyltransferase", 
			"Chloramphenicol", 180.0),
	AMR_118(	"chloramphenicol_MFS_transporters.hmm", "mdtL.cml-e#", "Chloramphenicol MFS transporter", "Chloramphenicol", 440.0),
	AMR_103(	"chlorothricin-MFS.hmm", "chlG", "Chlorothricin MFS transporter", "Chlorothricin", 500.0),
	AMR_8(		"cinnamycin-ABC_transporters.hmm", "cinT/cinH", "Cinnamycin ABC transporters", "Cinnamycin", 350.0),
	AMR_23(		"Class_B_metallo_betalactamases.hmm", "BCII", "Metallo beta lactamase Class B", "Beta-lactams", 115.0),
	AMR_112(	"clindamycin-ABC_transporters.hmm", "LmrA/LmrC", "Clindamycin ABC transporter", "Clindamycin", 810.0),
	AMR_16(		"cytolysin-immunityprotein.hmm", "cylI", "Cytolysin Immunity Protein", "Cytolysin", 300.0),
	AMR_73(		"d-lactate_dehydrogenases.hmm", "VanH", "Glycopeptide Resistance: D-lactate dehydrogenase", "Teicoplanin, Vancomycin", 400.0),
	AMR_92(		"dapdiamides-transmembrane_protein.hmm", "DdaI", "Dapdiamides transmembrane pump", "Dapdiamides", 500.0),
	AMR_13(		"daptomycin-ABC_transporter.hmm", "DptM/DptN/DptP", "Daptomycin ABC transporter", "Daptomycin", 270.0),
	AMR_72(		"dipeptidases.hmm", "VanA/VanXST/VanX", "Glycopeptide resistance: D-Ala-D-Ala dipeptidases", "Balhimycin, A47934, vancomycin", 200.0),
	AMR_17(		"epidermin_ABC_transporters.hmm", "epiG, epiG", "Epidermin ABC transporter", "Epidermin", 255.0),
	AMR_18(		"epidermin_membrane_protein.hmm", "epiH", "Epidermin membrane protein", "Epidermin", 300.0),
	AMR_137(	"esterases.hmm", "ereA/ereB/depI", "Erythromycin esterase", "Erythromycin", 200.0),
	AMR_109(	"factumycin-ABC_transporter.hmm", "FacT", "Factumycin ABC transporter", "Factumycin", 900.0),
	AMR_130(	"florfenicol-MFS.hmm", "florR", "Florfenicol MFS transporter", "Florfenicol", 775.0),
	AMR_114(	"fortimycin-phosphotransferase.hmm", "ForP", "Fortimycin phosphotransferase", "", 400.0),
	AMR_90(		"fosfomycin-fomA-Phosphotransferase.hmm", "FomA", "Fosfomycin phosphotransferase", "Fosfomycin", 200.0),
	AMR_91(		"fosfomycin-fomB-phosphotransferase.hmm", "FomB", "Fosfomycin phosphotransferase", "Fosfomycin", 350.0),
	AMR_93(		"Fosmidomycin-MFS.hmm", "fsr", "Fosmidomycin MFS transporter", "Fosmidomycin", 556.0),
	AMR_7(		"fruilimycin-ABC_transporter.hmm", "expA", "Friulimycin ABC transporter", "Friulimycin", 400.0),
	AMR_117(	"fusB_fusardic_acid_resistance.hmm", "fusB", "Fusidic acid detoxification protein", "Fusidic acid", 400.0),
	AMR_126(	"gentamicin-phosphotransferase.hmm", "gtmJ", "Gentamicin phosphotransferase", "Gentamicin", 275.0),
	AMR_74(		"glycopeptides-D-ala-D-ala_Ligases.hmm", "VanA", "Glycopeptide: D-ala-D-lactate ligase", "Teicoplanin, Vancomycin", 550.0),
	AMR_127(	"hygromycin-ABC_transporter.hmm", "hyg28", "Hygromycin ABC transporter", "Hygromycin", 1000.0),
	AMR_128(	"hygromycin-MFS.hmm", "hyg19", "Hygromycin MFS transporter", "Hygromycin", 300.0),
	AMR_131(	"istamycin-phosphotransferase.hmm", "istP", "Istamycin phosphotransferase", "Istamycin", 200.0),
	AMR_132(	"kanamycin-acetyltransferas.hmm", "KanM", "Kanamycin acetyltransferase", "Kanamycin", 225.0),
	
	//XXX chelsea  
	AMR_3(		"mersacidin-ABC_transporter.hmm", "mrsG", "Mersacidin ABC transporter", "Mersacidin", 310),
	AMR_4(		"nukacinISK-1-ABC_Transporter.hmm", "NukE", "NukacinISK-1 ABC transporter", "nukacinISK-1", 360),
	AMR_6(		"SubtilinABCTransporters.hmm", "spaE", "Subtillin ABC transporter", "Subtillin", 170),
	AMR_19(		"nisin-ABC_transporters.hmm", "NisE", "Nisin ABC transporter 1", "Nisin", 260),
	AMR_21(		"pep5-immunity_protein.hmm", "pepI", "Pep5 immunity protein", "Pep5", 145),
	AMR_22(		"polymyxin-ABC_transporters.hmm", "pmxD", "Polymyxin ABC transporters", "Polymyxin", 815),
	AMR_24(		"penicillian_binding_protein-isoform.hmm", "pbp1", "Penicillin binding protein isoform", "Cephamycin", 410),
	AMR_71(		"vancomycin-d-ala-d-serine_ligases.hmm", "VanE", "Glycopeptide resistance: D-Ala-D-Ser ligase", "Vancomycin", 405),
	AMR_97(		"pantocinA-Transmembrane_transporter.hmm", "paaC", "Pantocin A transmembrane transporter", "Pantocin A", 335),
	AMR_98(		"mupirocin-isoleucyl-tRNA_synthetase_isoform.hmm", "mupA", "Mupirocin target isoform: Isoleucyl-tRNA synthetase isoform", "Mupirocin", 625),
	AMR_99(		"tryptophanyl_tRNA_synthtase_isoforms.hmm", "TrpRS1", "Chuangxmycin target isoform: Tryptophan-tRNA synthetase isoform", 
			"Chuangxmycin, Indolmycin", 750),
	AMR_102(	"phosphothricin-acetyltransferase.hmm", "rimL", "Phosphothricin N-acetyltransferase", "Phosphothricin", 310),
	AMR_106(	"microcin_C7-Acyl_transferase.hmm", "mccE", "Microcin C7 immunity protein", "Microcin C7", 1000),
	AMR_110(	"Kirromycin-Isoforms-Updated.hmm", "tuf", "Kirromycin target isoform: Ef-Tu Isoform", "GE2270A, kirromycin", 840),
	AMR_111(	"rRNA_methyltransferases.hmm", "PikR1", "Aminoglycoside/macrolide rRNA methyltransferase", "Pikromycin, Thiostrepton, Clindamycin, erythryomycin "
			+ ", Gentamicin, hygromycin, kanamycin", 210),
	AMR_115(	"puromycin-acetyltransferase.hmm", "pac", "Puromycin acetyltransferase", "puromycin", 220),
	AMR_116(	"puromycin-MFS.hmm", "pur8", "Puromycin MFS transporter", "puromycin", 196),
	AMR_133(	"neomycin-acetyltransferase.hmm", "AAC8", "Neomycin acetyltransferase", "Neomycin", 480),
	AMR_134(	"neomycin-phosphotransferase.hmm", "Neo", "Neomycin phosphotransferase", "Neomycin", 230),
	AMR_135(	"paromycin-phosphotransferase.hmm", "PPH", "Paromomycin phosphotransferase", "Paromycin", 220),
	AMR_136(	"paromycin-acetyltrasnferase.hmm", "AAC7", "Paromomycin acetyltransferase", "Paromycin", 400),
	AMR_139(	"TylosinABCTransporters.hmm", "tlrC", "Tylosin ABC transporters", "Tylosin", 470),
	AMR_140(	"streptomycin-acetyltransferase.hmm", "str", "Streptomycin acetyltransferase", "Streptomycin", 400),
	AMR_141(	"StreptomycinPhosphotransferases.hmm", "strA", "Streptomycin phosphotransferase", "streptomycn", 300),
	AMR_142(	"streptogramin0ABC_transporter.hmm", "vgaA", "Streptogramin ABC transporters", "Streptogramin", 760),
	AMR_143(	"spiramycin-ABC_transporter.hmm", "smrB", "Spiramycin ABC transporters", "Spiramycin", 650),
	AMR_144(	"spectinomycin-phosphotransferase.hmm", "spcN", "Phosphotransferase", "Spectinomycin", 400),
	AMR_145(	"lincoasmide-nucelotidyltransferases.hmm", "lnuA", "Lincomycin nucleotidyltransferase", "Lincomycin ", 100),
	AMR_146(	"macrolide-phosphotransferases.hmm", "mphA", "Macrolide phosphotransferase", "Macrolides", 285),
	AMR_147(	"tetracycline-resistance_protein.hmm", "Tet37", "Tetracycline resistance protein ", "tetracycline", 700),
	AMR_148(	"tetracycline-resistance_protein.hmm", "TetO", "Tetracycline ribosomal protection protein", "Tetracyclines", 790),
	AMR_149(	"tetracycline-oxidoreductase.hmm", "TetX", "Tetracycline oxidoreductase", "Tetracycline", 400),
	AMR_150(	"tetracycline-MFS.hmm", "TetH", "Tetracycline MFS", "Tetracycline", 429),
	AMR_163(	"macrolides-rRNA_adenine_dimethylases.hmm", "ermD", "Macrolide rRNA adenine N6-methyltransferase", "Macrolides", 275),
	AMR_164(	"pristamycin-MFS.hmm", "ptr", "Pristamycin MFS", "Pristamycin", 740),
	AMR_180(	"sorangicin-glycosyltransferase.hmm", "sorF", "Sorangicin glycosyltransferase", "Sorangicin", 640),
	AMR_181(	"rifamycin-MFS.hmm", "rifP", "Rifamycin MFS Transporter", "Rifamycin", 830),
	AMR_182(	"microcinJ-ABC_transporter.hmm", "mcjD", "Microcin J ABC transporters", "Microcin J", 1025),
	AMR_183(	"microcinb17-ABC_transporter.hmm", "mcbE", "Microcin B17 ABC transporters", "Microcin B17", 115),
	AMR_184(	"novobiocidin-DNA_gyrase.hmm", "GyrB", "Novobiocidin target isoform: DNA gyrase B", "Novobiocidin", 1460),
	AMR_187(	"pentapeptiderepeats.hmm", "Qnr", "Quinolone resistance: pentapeptide repeats", "Quinolones", 223),
	AMR_190(	"tunicamycin-resistance_protein.hmm", "tmrB", "Tunicamycin resistance protein ", "Tunicamycin", 150),
	AMR_191(	"mithramycin-ABC_transporter.hmm", "mtrA", "Mithramycin ABC Transporters", "Mithramycin", 300),
	AMR_195(	"small_multidrug_resistant_protein.hmm", "ykkD", "Multidrug small multidrug resistant protein", "Multi Drug", 115),
	AMR_196(	"tetracenomycin_C-Efflux_protein.hmm", "tcmA", "Tetracenomycin MFS transporter", "tetracenomycin C", 333),
	AMR_197(	"TrifolitoxinResistance.hmm", "tfxE", "Trifolitoxin immunity protein", "Trifolitoxin", 300),
	AMR_198(	"ZwittermicinAcetyltransferase.hmm", "ZmaR", "Zwittermicin acetyltransferase", "Zwittermicin", 600),
	AMR_247(	"outfile24.hmm", "MFS3", "Multi-drug MFS transporter", "Multidrug", 700),
	AMR_257(	"outfile127.hmm", "romA", "romA: transcription factor mediating antibiotic resistance", "Multidrug", 850),
	
	AMR_5(		"subtillin-immunity_protein.hmm", "SpaI", "Subtilin immunity protein", "Subtilin", 250),
	AMR_20(		"nisin-Immunity_protein.hmm", "nisI", "Nisin immunity protein", "Nisin", 390),
	AMR_129(	"hygromycin-phosphotransferase.hmm", "hyg21", "Hygromycin phosphotransferase", "Hygromycin", 700),
	
	AMR_269(	"albD-detoxification-enzyme.hmm", "AlbD", "Albicidin esterase", "Albicidin", 130),
	AMR_270(	"IciA-Enterocin-A-immunity-protein.hmm", "IciA", "Enterocin A immunity protein", "Enterocin A", 110),
	AMR_271(	"qepA-MFS-transporter.hmm", "QepA", "Multidrug MFS transporter", "Multidrug", 270),
	AMR_272(	"TbIF-ligase.hmm", "TbIF", "Tabtoxin ligase", "Tabtoxin", 360),
	AMR_273(	"ttr-acetyltransferase.hmm", "Ttr", "Tabtoxin acetyltransferase", "Tabtoxin", 178),
	AMR_274(	"Ytkr2-DNA-alkylation.hmm", "Ytkr2", "Yatakemycin DNA alkylation", "Yatakemycin", 160),
	AMR_275(	"fosC-fosfomycin-phosphotransferase.hmm", "FosC", "Fosfomycin phosphotransferase", "Fosfomycin", 77),
	AMR_276(	"fosX-fosfomycin-epoxide-hydrolase.hmm", "FosX", "Fosfomycin epoxide hydrolase", "Fosfomycin", 100),
	
	//new hmms from Chelsea
	AMR_96("AdmT-acyl-coA-carboxylase-isoform.hmm" , "admT" , "Acyl-CoA carboxylase isoform" , "Andrimid" , 700),             
	AMR_279("Fec1-BetaLactamase.hmm" , "Fec1" , "Beta lactamase" , "Beta Lactams" , 540),                                                        
	AMR_280("nocD-acetyltransferase.hmm" , "NocD" , "Acetyltransferase" , "Nocardicin" , 316),                                               
	AMR_281("Oxy2_betalactamase.hmm" , "Oxy2" , "Beta lactamase" , "Monobactam" , 515),                                                    
	AMR_282("per2_betalactamase.hmm" , "per1" , "Beta lactamase" , "Monobactam" , 400),                                                   
	AMR_283("shv2_Beta_lactamase.hmm" , "shv2" , "Beta lactamase" , "Betalactam" , 600), 
	AMR_1( "bacitracin_ABC_transporters.hmm", "bcrb/bcrA", "Bacitracin ABC transporter", "Bacitracin", 150),
	AMR_2( "bacitracin-phosphatases.hmm","bacA/bcrC", "Bacitracin phosphatase", "Bacitracin", 230),
	AMR_14("daptomycin-phosphatidylglycerol_lysyltransferase.hmm", "mprF", "Daptomycin target modification: phosphatidylglycerol lysyltransferase", "Daptomycin", 630),
	AMR_11("caprazamycin-acetyl_transferase.hmm", "cpz12/cpz27", "Caprazamycin acetyltransferase", "Caprazamycin", 110),
	AMR_95( "beta-ketoacyl-acyl-carrier-protein_synthase_II_Isoforms.hmm", "ptmP3/ptnP3/FabF",  "Platencin target isoform: beta-ketoacyl carrier protein", "platencin/platensimycin", 800),
	AMR_100( "borreldin-threonyl_tRNA_synthetase.hmm", "BorS", "Borrelidin target isoform: threonyl-tRNA synthetase", "Borreldin", 750),
	AMR_104( "dihydrofolate_isoforms.hmm", "dfra10", "Trimethoprim target isoform: dihydrofolate reductase", "Trimethoprim", 210),
	AMR_108( "dihydropteroate_synthtase_isoforms.hmm", "sul1/sul2",	"Sulfonamide target isoform: dihydropteroate synthase", "Sulfonamide", 530),
	AMR_285( "kasugamycin-ABC_transporter.hmm", "KasKLM", "Kasuguamycin ABC transporter", "Kasuguamycin", 160),
	
	//new Chelsea 1/11/2015
	AMR_286( "optrA-oxanoloid-ABCTransporter.hmm", "optrA", "Oxazolidinone ABC transporter", "oxazolidinones and phenicols", 260),
	AMR_287( "czcA-copper_resistance_protein.hmm", "czcA", "Copper resistance protein", "copper", 709),
	AMR_288( "copA-copper_resistance_protein.hmm", "copA", "Copper resistance protein", "copper",300),
	AMR_289( "mcr1-collistin-phosphatidylethanolaminetransferase.hmm", "mcr-1", "Colistin phosphatidylethanolamine transferase", "Colistin", 1000),
	AMR_290( "nisin-nisG-ABCTransporter2.hmm", "nisG", "Nisin ABC transporter 2", "Nisin", 260),
	
	//new Chelsea 2/1/2016
	AMR_291( "chalcomycin-rRNAmethyltransferase.hmm", "chrB", "Chalcomycin rRNA methyltransferase", "Chalocomycin", 490),
	AMR_292( "Rifampin-Rifamyicn_Phosphotransferase.hmm", "rph", "Rifampin phosphotransferase",	"Rifampin",	1790),
	AMR_293( "AsukamycinMFSasuM1.hmm",	"asuM1", "Askumycin MFS", "Askumycin", 900),
	AMR_294( "carnocyclin-immunityprotein.hmm",	"ccII",	"Carnocyclin immunity protein",	"Carnocyclin",	500),
	AMR_295( "cereulide-ABCTransporter.hmm", "CesC", "Cereulide ABC transporter", "Cereulide", 400),
	AMR_296( "Ge81112-ABC_Transporter.hmm",	"getB",	"GE81112 ABC transporter", "GE81112", 800),
	AMR_297( "lukacidin-ABCTransporter.hmm", "LkcJ", "Lukacidin ABC transporter", "Lukacidin", 975),
	AMR_298( "Rifampin-Rifamycin_ADP_ribosyl_transferas.hmm", "arr", "Rifampin ADP ribosyl transferase", "Rifampin", 199.7),
	AMR_299( "Rifampin-Rifamycin-GlycosylTransferase.hmm", "yjiC", "Rifampin glycosyltransferase", "Rifampin",	775),
	AMR_300( "rubradirin-ABC_Transporter.hmm", "rubT1", "Rubradirin ABC transporter", "Rubradirin", 500),
	AMR_301( "Salinomycin-Resistance_Protein.hmm", "salH", "Salinomycin MFS transporter", "Salinomycin", 850),
	AMR_302( "Terreic_Acid-ABC_Transporter.hmm", "orf", "Terreic Acid ABC transporter", "Terreic Acid",	3350),
	AMR_303( "Tetarimycin-ABCTransporter.hmm", "tamA", "Tetarimycin ABC transporter", "Tetarimycin", 800),
	AMR_304( "Tiacumucin-ABC_Transporter.hmm", "tia3",	"Tiacumucin ABC transporter", "Tiacumucin", 780),
	AMR_305( "virginamycin-MFStransporter.hmm",	"varS",	"Virginamycin MFS transporter",	"Virginamycin",	570),
	AMR_306( "Zeamine-ABCTransporter.hmm", "zmn20",	"Zeamine ABC transporter",	"Zeamine", 600),
	AMR_307( "Tylosin-rRNAmethyltransferase.hmm", "tlrC", "Tylosin rRNA methyltransferase", "Tylosin", 400),

	// new from Chelsea, 26/03/2016
	AMR_308(	"capreomycin-cmnU-rRNAmethyltransferase.hmm", "cmnU", "Capreomycin rRNA methyltransferase", "Capreomycin", 150),
	AMR_309(	"tetronasin-tnrB-ABCTransporter.hmm", "tnrB", "Tetronasin ABC transporter", "Tetronasin", 430),
	AMR_310(	"Viomycin-vph-phosphotransferase.hmm", "vph", "Viomycin phosphotransferase", "Viomycin", 270),
	AMR_311(	"Calcimycin-calT-ABCTransporter.hmm", "calT", "Calcimycin ABC transporter", "Calcimycin", 1210),
	AMR_312(	"Mycinamycin-myrA-rRNAmethyltransferase.hmm", "myrA", "Mycinamycin rRNA methyltransferase A", "Mycinamycin", 350),
	AMR_313(	"Mycinamycin-myrB-rRNAmethyltransferase.hmm", "myrB", "Mycinamycin rRNA methyltransferase B", "Mycinamycin", 335),
	
	;

	private final String hmm;
	private final String gene;
	private final String drug;
	private final String description;
	private final double cutoff;
	private ResistanceDomains(final String hmm, final String gene, final String description, final String drug, final double cutoff) {
		this.hmm = hmm;
		this.gene = gene;
		this.description = description;
		this.cutoff = cutoff;
		this.drug = drug;
	}
	
	public String hmm() {
		return this.hmm;
	}
	
	public String gene() {
		return this.gene;
	}
	
	public String drug() {
		return this.drug;
	}
	
	public double cutoff() {
		return this.cutoff;
	}
	
	public String fullName() {
		return this.description;
	}
	
	public String abbreviation() {
		return this.toString().split("_")[0] + "<sub>" + this.toString().split("_")[1] + "</sub>";
	}
	
	public DomainFamilies family() {
		return DomainFamilies.RESISTANCE;
	}
	
	public static ResistanceDomains getResistanceDomainFromAbbreviation(String abv){
		for(ResistanceDomains currentEnum : ResistanceDomains.values()) {
			if(abv.equals(currentEnum.abbreviation())) {
				return currentEnum;
			}
		}
		System.err.println("Warning: regulator domain abbreviation " + abv + " does not exist!.");
		return null;
	}
}