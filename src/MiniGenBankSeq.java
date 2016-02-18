

public class MiniGenBankSeq extends SequenceLoader{

	/* Author: Natasha Passon
	 * Student id: 034 645 150
	 * Course: BIF812
	 * Purpose: 
	 * 
	 * I declare that the attached assignment is my own work in accordance with Seneca Academic Policy. 
	 * No part of this assignment has been copied manually or electronically from any other source 
	 * (including websites) or distributed to other students.
	 * 
	 * Natasha Passon, 034 645 150
	 */
	
	private String locus;
	private String accession;
	private String definition;
	private String source;
	
	/** 
	 * Method that is called when a getter method returns null value of GenBank entry
	 * @param entry
	 */
	public static void errorMessage(String entry) {
		System.err.println("Warning!! The GenBank entry " + entry + " has not been initialized.");
	}
	
	public String getLocus() {
		if(locus == null) {
			errorMessage("locus");
		}
		return locus;
	}
	
	public void setLocus(String newValue) {
		locus = newValue;
	}
	
	public String getAccession() {
		if(accession == null) {
			errorMessage("accession");
		}
		return accession;
	}
	
	public void setAccession(String newValue) {
		accession = newValue;
	}
	
	public String getDefinition() {
		if(definition == null) {
			errorMessage("definition");
		}
		return definition;
	}
	
	public void setDefinition(String newValue) {
		definition = newValue;
	}
	
	public String getSource() {
		if(source == null) {
			errorMessage("source");
		}
		return source;
	}
	
	public void setSource(String newValue) {
		source = newValue;
	}
	
	// uninitialized constructor
	MiniGenBankSeq() {
		
	}
	
	// partially initialized constructor
	MiniGenBankSeq(String newLocus, String newAccession) {
		this.locus = newLocus;
		this.accession = newAccession;
	}
	
	// fully initialized constructor
	MiniGenBankSeq(String newLocus, String newAccession, String newDefinition, String newSource) {
		this.locus = newLocus;
		this.accession = newAccession;
		this.definition = newDefinition;
		this.source = newSource;
	}
	
	@Override
	public String toString() {
		return "Contents: Locus: " + getLocus() + " Accession: " + getAccession() + " Definition: " + getDefinition() + " Source: " + getSource();
	}
}
