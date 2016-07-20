package ca.mcmaster.magarveylab.enums;

import ca.mcmaster.magarveylab.enums.substrates.ProteinogenicAminoAcids;

public enum Codons {
	
	UUU(ProteinogenicAminoAcids.PHENYLALANINE),
	UUC(ProteinogenicAminoAcids.PHENYLALANINE),
	UUA(ProteinogenicAminoAcids.LEUCINE),
	UUG(ProteinogenicAminoAcids.LEUCINE),
	UCU(ProteinogenicAminoAcids.SERINE),
	UCC(ProteinogenicAminoAcids.SERINE),
	UCA(ProteinogenicAminoAcids.SERINE),
	UCG(ProteinogenicAminoAcids.SERINE),
	UAU(ProteinogenicAminoAcids.TYROSINE),
	UAC(ProteinogenicAminoAcids.TYROSINE),
	UGU(ProteinogenicAminoAcids.CYSTEINE),
	UGC(ProteinogenicAminoAcids.CYSTEINE),
	UGG(ProteinogenicAminoAcids.TRYPTOPHAN),
	CUU(ProteinogenicAminoAcids.LEUCINE),
	CUC(ProteinogenicAminoAcids.LEUCINE),
	CUA(ProteinogenicAminoAcids.LEUCINE),
	CUG(ProteinogenicAminoAcids.LEUCINE),
	CCU(ProteinogenicAminoAcids.PROLINE),
	CCC(ProteinogenicAminoAcids.PROLINE),
	CCA(ProteinogenicAminoAcids.PROLINE),
	CCG(ProteinogenicAminoAcids.PROLINE),
	CAU(ProteinogenicAminoAcids.HISTIDINE),
	CAC(ProteinogenicAminoAcids.HISTIDINE),
	CAA(ProteinogenicAminoAcids.GLUTAMINE),
	CAG(ProteinogenicAminoAcids.GLUTAMINE),
	CGU(ProteinogenicAminoAcids.ARGININE),
	CGC(ProteinogenicAminoAcids.ARGININE),
	CGA(ProteinogenicAminoAcids.ARGININE),
	CGG(ProteinogenicAminoAcids.ARGININE),
	AUU(ProteinogenicAminoAcids.ISOLEUCINE),
	AUC(ProteinogenicAminoAcids.ISOLEUCINE),
	AUA(ProteinogenicAminoAcids.ISOLEUCINE),
	AUG(ProteinogenicAminoAcids.METHIONINE),
	ACU(ProteinogenicAminoAcids.THREONINE),
	ACC(ProteinogenicAminoAcids.THREONINE),
	ACA(ProteinogenicAminoAcids.THREONINE),
	ACG(ProteinogenicAminoAcids.THREONINE),
	AAU(ProteinogenicAminoAcids.ASPARAGINE),
	AAC(ProteinogenicAminoAcids.ASPARAGINE),
	AAA(ProteinogenicAminoAcids.LYSINE),
	AAG(ProteinogenicAminoAcids.LYSINE),
	AGU(ProteinogenicAminoAcids.SERINE),
	AGC(ProteinogenicAminoAcids.SERINE),
	AGA(ProteinogenicAminoAcids.ARGININE),
	AGG(ProteinogenicAminoAcids.ARGININE),
	GUU(ProteinogenicAminoAcids.VALINE),
	GUC(ProteinogenicAminoAcids.VALINE),
	GUA(ProteinogenicAminoAcids.VALINE),
	GUG(ProteinogenicAminoAcids.VALINE),
	GCU(ProteinogenicAminoAcids.ALANINE),
	GCC(ProteinogenicAminoAcids.ALANINE),
	GCA(ProteinogenicAminoAcids.ALANINE),
	GCG(ProteinogenicAminoAcids.ALANINE),
	GAU(ProteinogenicAminoAcids.ASPARTATE),
	GAC(ProteinogenicAminoAcids.ASPARTATE),
	GAA(ProteinogenicAminoAcids.GLUTAMATE),
	GAG(ProteinogenicAminoAcids.GLUTAMATE),
	GGU(ProteinogenicAminoAcids.GLYCINE),
	GGC(ProteinogenicAminoAcids.GLYCINE),
	GGA(ProteinogenicAminoAcids.GLYCINE),
	GGG(ProteinogenicAminoAcids.GLYCINE),
	;
	
	private ProteinogenicAminoAcids aminoAcid;
	
	private Codons(ProteinogenicAminoAcids aminoAcid) {
		this.aminoAcid = aminoAcid;
	}
	
	public ProteinogenicAminoAcids getAminoAcid() {
		return aminoAcid;
	}
	
	// stop: UAA, UAG, UGA
	
}
