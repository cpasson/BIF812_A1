
public class MiniGenBankSeq {

	private String locus;
	private String accession;
	private String definition;
	private String source;
	
	public String getLocus() {
		return locus;
	}
	
	public void setLocus(String newValue) {
		locus = newValue;
	}
	
	public String getAccession() {
		return accession;
	}
	
	public void setAccession(String newValue) {
		accession = newValue;
	}
	
	public String getDefinition() {
		return definition;
	}
	
	public void setDefinition(String newValue) {
		definition = newValue;
	}
	
	public String getSource() {
		return source;
	}
	
	public void setSource(String newValue) {
		source = newValue;
	}
	
	MiniGenBankSeq() {
		this("Locus not initialized.", "Locus not initialized.", "Locus not initialized.", "Locus not initialized.");
	}
	
	MiniGenBankSeq(String newLocus, String newAccession) {
		this(newLocus, newAccession, "Locus not initialized.", "Locus not initialized.");
	}
	
	MiniGenBankSeq(String newLocus, String newAccession, String newDefinition, String newSource) {
		this.locus = newLocus;
		this.accession = newAccession;
		this.definition = newDefinition;
		this.source = newSource;
	}
	
	@Override
	public String toString() {
		return "Contents: Locus: " + locus + " Accession: " + accession + " Definition: " + definition + " Source: " + source;
	}
	
}
