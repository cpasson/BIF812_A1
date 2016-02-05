
public class UseMiniGenBankSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiniGenBankSeq uninitialized = new MiniGenBankSeq();
		System.out.println("Output for uninitialized constructor: ");
		System.out.println(uninitialized.toString());
		uninitialized.setLocus("CFTR");
		System.out.println("Output of uninitialized constructor after calling setter method.");
		System.out.println(uninitialized.toString());
		System.out.println("  ");
		
		MiniGenBankSeq partialInitialization = new MiniGenBankSeq("NC_002549", "NC_002549");
		System.out.println("Output for partially initialized constructor: ");
		System.out.println(partialInitialization.toString());
		System.out.println("  ");
		
		MiniGenBankSeq initialization = new MiniGenBankSeq("NC_004763", "NC_004763", "African green monkey polyomavirus, complete genome.", "African green monkey polyomavirus");
		System.out.println("Output for initialized constructor: ");
		System.out.println(initialization.toString());
		System.out.println("  ");
	}
		
}

