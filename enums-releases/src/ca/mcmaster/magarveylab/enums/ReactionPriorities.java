package ca.mcmaster.magarveylab.enums;

import ca.mcmaster.magarveylab.enums.domains.BetaLactamDomains;
import ca.mcmaster.magarveylab.enums.domains.DomainType;
import ca.mcmaster.magarveylab.enums.domains.TailoringDomains;
import ca.mcmaster.magarveylab.enums.domains.ThiotemplatedDomains;
import ca.mcmaster.magarveylab.enums.domains.TypeIIPolyketideDomains;
import ca.mcmaster.magarveylab.enums.domains.RibosomalDomains;

/**
 * Enunmerates the priorities in which reactions should be executed. 
 * @author skinnider
 *
 */
public enum ReactionPriorities {
	
	// type II pre-scaffold generation
	CARBOXY_O_METHYLTRANSFERASE(TypeIIPolyketideDomains.CARBOXY_OMT, 100),
	
	// polyketide cyclases
	FAVORSKIIASE(TypeIIPolyketideDomains.FAVORSKIIASE, 200),
	FIRST_RING_CYCLASE_2a(TypeIIPolyketideDomains.CYCLASE_CLADE_8a, 200),
	FIRST_RING_CYCLASE_1(TypeIIPolyketideDomains.CYCLASE_CLADE_7, 201),
	FIRST_RING_CYCLASE_2(TypeIIPolyketideDomains.CYCLASE_CLADE_8_9, 201),
	FIRST_RING_CYCLASE_3(TypeIIPolyketideDomains.CYCLASE_CLADE_10, 205),
	THIRD_RING_CYCLASE_1(TypeIIPolyketideDomains.CYCLASE_CLADE_3, 210),
	THIRD_RING_CYCLASE_2(TypeIIPolyketideDomains.CYCLASE_CLADE_1, 220),
	THIRD_RING_CYCLASE_3(TypeIIPolyketideDomains.CYCLASE_CLADE_2, 220),
	FOURTH_RING_CYCLASE_1(TypeIIPolyketideDomains.CYCLASE_CLADE_5b, 230),
	FOURTH_RING_CYCLASE_2(TypeIIPolyketideDomains.CYCLASE_CLADE_6a, 230),
	FOURTH_RING_CYCLASE_3(TypeIIPolyketideDomains.CYCLASE_CLADE_6b_SUBTYPE_1, 230),
	FOURTH_RING_CYCLASE_4(TypeIIPolyketideDomains.CYCLASE_CLADE_6b_SUBTYPE_2, 230),
	ANGULAR_CYCLASE_1(TypeIIPolyketideDomains.CYCLASE_CLADE_4, 250),
	ANGULAR_CYCLASE_2(TypeIIPolyketideDomains.CYCLASE_CLADE_5a, 250),
	
	// beta lactam domains
	IPNS(BetaLactamDomains.IPNS, 300),
	DOACS(BetaLactamDomains.DOACS, 310),
	IAT(BetaLactamDomains.IAT, 350),
	
	// other multimodular tailoring domains
	P450A(TailoringDomains.P450A, 400),
	P450B(TailoringDomains.P450B, 400),
	P450C(TailoringDomains.P450C, 400),
	P450D(TailoringDomains.P450D, 400),
	BVMO(TypeIIPolyketideDomains.BVMO, 400),
	ABM(TypeIIPolyketideDomains.ABM, 400),
	C6_OXYGENASE(TypeIIPolyketideDomains.C6OX, 400),
	
	// oxazole/thiazole formation 
	HETEROCYCLIZATION(ThiotemplatedDomains.CONDENSATION, 500),
	NITROREDUCTASE(ThiotemplatedDomains.NITROREDUCTASE, 510),
	
	// oxidoreductases
	PROLINE_DEHYDROGENASE(TailoringDomains.PROLINE_DEHYDROGENASE, 600),
	TRYPTOPHAN_DIOXYGENASE(TailoringDomains.TRYPTOPHAN_DIOXYGENASE, 600),
	KETOREDUCTASE(ThiotemplatedDomains.KETOREDUCTASE, 600),
	DEHYDRATASE(ThiotemplatedDomains.DEHYDRATASE, 610),
	ENOLREDUCTASE(ThiotemplatedDomains.ENOYLREDUCTASE, 620),
	C9_KETOREDUCTASE(TypeIIPolyketideDomains.C9KR, 100),
	C11_KETOREDUCTASE(TypeIIPolyketideDomains.C11KR, 600),
	C15_KETOREDUCTASE(TypeIIPolyketideDomains.C15KR, 600),
	C17_KETOREDUCTASE(TypeIIPolyketideDomains.C17KR, 600),
	C19_KETOREDUCTASE(TypeIIPolyketideDomains.C19KR, 600),
	
	// modular tailoring reactions
	OMT(ThiotemplatedDomains.O_METHYLTRANSFERASE, 700),
	NMT(ThiotemplatedDomains.N_METHYLTRANSFERASE, 700),
	CMT(ThiotemplatedDomains.C_METHYLTRANSFERASE, 700),
	
	// simple addition reactions
	CARBAMOYLTRANSFERASE(TailoringDomains.CARBAMOYLTRANSFERASE, 800),
	PHOSPHOTRANSFERASE_1(TailoringDomains.PHOSPHOTRANSFERASE_1, 800),
	PHOSPHOTRANSFERASE_2(TailoringDomains.PHOSPHOTRANSFERASE_2, 800),
	FORMYLTRANSFERASE(TailoringDomains.FORMYLTRANSFERASE, 800),
	SULFOTRANSFERASE(TailoringDomains.SULFOTRANSFERASE, 800),
	CHLORINATION(TailoringDomains.CHLORINATION, 800),
	C_GLYCOSYLTRANSFERASE(TailoringDomains.C_GLYCOSYLTRANSFERASE, 800),
	GLYCOSYLTRANSFERASE(TailoringDomains.GLYCOSYLTRANSFERASE, 810),
	ACYL_ADENYLATE_LIGASE(ThiotemplatedDomains.ACYL_ADENYLATING, 800),
	C2_AMINOTRANSFERASE(TypeIIPolyketideDomains.C2AMT, 800),
	C2_METHYLTRANSFERASE(TypeIIPolyketideDomains.C2MT, 810),
	C11_O_METHYLTRANSFERASE_1(TypeIIPolyketideDomains.C11OMT_1, 800),
	C11_O_METHYLTRANSFERASE_2(TypeIIPolyketideDomains.C11OMT_2, 800),
	C6_C_METHYLTRANSFERASE(TypeIIPolyketideDomains.C6CMT, 800),
	C8_C_METHYLTRANSFERASE(TypeIIPolyketideDomains.C8CMT, 800),
	C10_C_METHYLTRANSFERASE_1(TypeIIPolyketideDomains.C10CMT, 800),
	
	// pre-cyclization
	REDUCTASE(ThiotemplatedDomains.REDUCTASE, 900),
	
	
	/* ---- RIBOSOMAL ---- */
	// lantipeptides
	N_terminal_acetylation(RibosomalDomains.PaeN, 7_000),
	Lantipeptide_dehydratase(RibosomalDomains.LanB, 7_010),
	Lantipeptide_kinase_cyclase__LanKC_or_LanL(RibosomalDomains.LanKC, 7_010),
	Lantipeptide_fused_dehydratase_cyclase(RibosomalDomains.LanM, 7_010),
	Prochlorosin(RibosomalDomains.ProcA, 7_010),
	Lantipeptide_cyclase(RibosomalDomains.LanC, 7_011),
	alpha_ketoglutarateiron_II_dependent_aspartate_beta_hydroxylase(RibosomalDomains.CinX, 7_020),
	Cinorf7_like_lysinoalanine_biosynthesis_protein(RibosomalDomains.Cinorf7, 7_020),
	Short_chain_dehydrogenase(RibosomalDomains.ElxO, 7_020),
	Lantithione_S_oxidase(RibosomalDomains.GarO, 7_020),
	Lantipeptide_D_Ala_biosynthesis_protein(RibosomalDomains.LanJ, 7_020),
	Tryptophan__5_halogenase(RibosomalDomains.MibH, 7_020),
	Cytochrome_P450_proline_3_4_dihydroxylase(RibosomalDomains.MibO, 7_020),
	
	// bacterial head-to-tail cyclized peptides 
	DUF95_family_enzyme(RibosomalDomains.DUF95, 2_000),

	// bottromycins 
	Bottromycin_thiazole_forming_cyclodehydratase(RibosomalDomains.BotCD, 3_001),
	Bottromycin_macrocyclodehydratase(RibosomalDomains.BotC, 3_003),
	Bottromycin_carboxymethylesterase(RibosomalDomains.BotOMT, 3_004),
	Phenylalanine_beta_C_methyltransferase(RibosomalDomains.BotRMT1, 3_005),
	Valine_beta_C_methyltransferase(RibosomalDomains.BotRMT2, 3_006),
	Proline_beta_C_methyltransferase(RibosomalDomains.BotRMT3, 3_007),
	
	// cyanobactins
	Cyanobactin_leader_peptide_protease(RibosomalDomains.PatA, 5_000),
	Cyanobactin_dehydratase(RibosomalDomains.PatD, 5_001),
	Bifunctional_N_prenyltransferaseO_methyltransferase(RibosomalDomains.AgeF1, 5_002),
	Cyanobactin_protease_macrocyclase_with_oxidative_domain(RibosomalDomains.PatG_ox, 5_003),
	Cyanobactin_protease_macrocyclase_without_oxidative_domain(RibosomalDomains.PatG, 5_004),
	Cyanobactin_prenyltransferase(RibosomalDomains.PatF, 5_005),

	// glycocins
	Glyocin_disulfide(RibosomalDomains.SunA, 6_000),
	Glyocin_S_glycosyltransferase(RibosomalDomains.SunS, 6_001),
	
	// lasso peptides 
	Lasso_peptide_asparagine_synthase(RibosomalDomains.Asparagine_synthase, 8_000),
	Lasso_peptide_disulfide(RibosomalDomains.Lasso_precursors, 8_001),

	// linaridins
	Linardin_threonine_dehydratase(RibosomalDomains.CypH, 9_000),
	Linardin_threonine_dehydratase_2(RibosomalDomains.LegH, 9_000),
	Linardin_serine_dehydratase(RibosomalDomains.CypL, 9_000),
	Linardin_N_N_dimethyltransferase_CypM(RibosomalDomains.CypM, 9_000),
	Aminovinylcysteine_biosynthesis_flavoprotein(RibosomalDomains.LanD, 9_001),
	
	// linear azole-containing peptides
	N_terminal_acetyltransferase_GodH(RibosomalDomains.GodH, 10_000),
	Linear_azole_containing_peptide_cyclodehydratase_C(RibosomalDomains.McbC, 10_001),
	Linear_azole_containing_peptide_cyclodehydratase_D(RibosomalDomains.McbD, 10_001),
	Linear_azole_containing_peptide_dehydratase_McbB(RibosomalDomains.McbB, 10_002),
	Linear_azole_containing_peptide_N_N_dimethyltransferase(RibosomalDomains.PznL, 10_003),
	Goadsporin_azoline(RibosomalDomains.GodD, 10_010),
	Goadsporin_azole(RibosomalDomains.GodE, 10_011),
	Goadsporin_dehydratase(RibosomalDomains.GodF, 10_012),
	
	// microviridins 
	N_terminal_acetyltransferase(RibosomalDomains.MdnD, 11_000),
	Microviridin_ATP_grasp_enzyme_MdnB(RibosomalDomains.MdnB, 11_001),
	Microviridin_ATP_grasp_enzyme_MdnC(RibosomalDomains.MdnC, 11_001),
	
	// proteusins
	PoyF(RibosomalDomains.PoyF, 12_000),
	PoyBC(RibosomalDomains.PoyBC, 12_005),
	PoyE(RibosomalDomains.PoyE, 12_005),
	PoyI(RibosomalDomains.PoyI, 12_005),	

	// sactipeptides 
	Disulfide_bond_forming_thioredoxin(RibosomalDomains.SkfH, 13_000),
	Sbo_type_zinc_dependent_protease(RibosomalDomains.AlbE, 13_000),
	Skf_type_membrane_bound_protease(RibosomalDomains.SkfC, 13_000),
	Sactipeptide_Fe_S_protein(RibosomalDomains.AlbA, 13_001),
	
	// streptides
	StrB(RibosomalDomains.StrB, 22_000),
	
	// thiopeptides  
	Cytochrome_P450_hydroxymethylproline_biosynthesis(RibosomalDomains.GetJ, 23_000), // GE37468 hydroxymethylproline
	Cytochrome_P450(RibosomalDomains.TpdJ1, 23_000), // thiomuracin Phe beta-hydroxylation/Ile epoxidation 
	Cytochrome_P450_2(RibosomalDomains.TpdJ2, 23_000), // thiomuracin Phe beta-hydroxylation/Ile epoxidation
	NosA_C_terminal_dealkylation_amide_formation(RibosomalDomains.NosA, 23_000), // NosA C-terminal amidation/dealkylation 
	Threonine_O_methyltransferase(RibosomalDomains.TclO, 23_000), // thiocillin Thr O-methylation 
	TsrI__quinaldic_acid_esterification(RibosomalDomains.TsrI, 23_000), // thiostrepton quinaldic acid
	NosI__indole_esterification(RibosomalDomains.NosI, 23_000), // nocathiacin indole 
	Thiopeptide_dehydratase(RibosomalDomains.LazB, 23_010),
	Thiopeptide_cycloaddition_enzyme_tetrahydropyridine(RibosomalDomains.LazC_b, 23_011),
	Thiopeptide_cycloaddition_enzyme(RibosomalDomains.LazC, 23_012),
	Cytochrome_P450_pyridine_hydroxylase(RibosomalDomains.NosC, 23_015),
	Thiopeptide_cyclodehydratase(RibosomalDomains.LazE, 23_020),
	Thiopeptide_azole_forming_oxidase(RibosomalDomains.LazF, 23_021),
	Dehydroserine_O_methyltransferase(RibosomalDomains.NocQ, 23_080), // nocathiacin O-methoxylation 
	Tertiary_thioether_biosynthesis(RibosomalDomains.CltM, 23_080), // cyclothiazomycin tertiary thioether 
	Cytochrome_P450__phenylalanine_beta_hydroxylation(RibosomalDomains.TpdQ, 23_090),
	Isoleucine_epoxidase(RibosomalDomains.TsrR, 23_090),
	Asparagine_N_methyltransferase(RibosomalDomains.TpdT, 23_090),
	Thiazole_C_methyltransferase_I(RibosomalDomains.TpdI, 23_090),
	Thiazole_C_methyltransferase_L(RibosomalDomains.TpdL, 23_090),
	Hydroxymethylthiazole_O_methyltransferase(RibosomalDomains.TpdM, 23_091), // GE2270 methylthiazole methoxylation 
	Carboxylesterase(RibosomalDomains.TsrB, 23_090), // thiostrepton C-terminal amidation 
	Valine_beta_hydroxylase(RibosomalDomains.BerH, 23_090), // berninamycin valine beta-hydroxylation 
	Nonheme_iron_dependent_valine_beta_hydroxylase(RibosomalDomains.TclD, 23_090), // thiocillin valine beta-hydroxylation
	Cytochrome_P450_glutamate_gamma_hydroxylase(RibosomalDomains.NosB, 23_090), // nosiheptide glutamate hydroxylation 
	TsrC_type_C_terminal_amidotransferase(RibosomalDomains.TsrC, 23_091), // thiostrepton C-terminal amidation 	
	TpaJ(RibosomalDomains.TpaJ, 23_091), // TP-1161 amino acetone  	

	// thioviridamides 
	Thioviridamide_N_terminal_biosynthesis(RibosomalDomains.TvaD, 24_000),
	Thioviridamide_thioamide_biosynthesis_protein(RibosomalDomains.TvaH , 24_001),
	Thioviridamide_aminovinylcysteine_biosynthesis_flavoprotein(RibosomalDomains.TvaF , 24_002),
	Thioviridamide_histidine_beta_hydroxlase(RibosomalDomains.TvaJ , 24_003),
	Histidine_N1_N3_dimethyltransferase(RibosomalDomains.TvaG , 24_004),

	// trifolitoxins 
	Trifolitoxin_nitroreductase_B(RibosomalDomains.TfxB, 16_000),
	
	// YM family 
	Macrocyclase(RibosomalDomains.YmF, 25_001),
	Cyclodehydratase_oxidase_didomain_enzyme_N_terminal(RibosomalDomains.YmBC_a, 25_002),
	Cyclodehydratase_oxidase_didomain_enzyme_C_terminal(RibosomalDomains.YmBC_b, 25_003),
	Cytochrome_P450_phenylalanine_beta_hydroxylase(RibosomalDomains.YmE, 25_004),
	Phenyloxazoline_forming_cyclodehydratase(RibosomalDomains.YmB1, 25_005),
	Phenyloxazole_forming_oxidase(RibosomalDomains.YmC1, 25_006),
	
	// small quorum-sensing peptides (AgrD, Comx)
	Auto_inducing_peptide_endopeptidase(RibosomalDomains.AgrB, 26_000),
	ComX_isoprenyltransferase(RibosomalDomains.ComQ, 26_000),
	
	// ribosomal - end reactions
	Bottromycin_leucyl_aminopeptidase(RibosomalDomains.BotP, 99_999 /* must be the last reaction executed! */),
	;
	
	private DomainType domain;
	private int priority;
	
	private ReactionPriorities(DomainType domain, int priority) {
		this.domain = domain;
		this.priority = priority;
	}

	public DomainType domain() {
		return domain;
	}
	
	public int priority() {
		return priority;
	}
	
}
