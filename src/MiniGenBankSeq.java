
public class MiniGenBankSeq {

	private String locus;
	private String accession;
	private String definition;
	private String source;
	
	public static void errorMessage(String entry) {
		System.out.println("Warning!! The GenBank entry " + entry + " has not been initialized.");
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
	
	MiniGenBankSeq() {
		
	}
	
	MiniGenBankSeq(String newLocus, String newAccession) {
		this.locus = newLocus;
		this.accession = newAccession;
	}
	
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
