

public class UseMiniGenBankSeq {
	
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

	public static void main(String[] args) {
		
		MiniGenBankSeq uninitialized = new MiniGenBankSeq();
		
		System.out.println("OUTPUT FOR UNITIALIZED CONSTRUCTOR: ");
		System.out.println(" ");
		
		System.out.println(uninitialized.toString());
		System.out.println(" ");
		//
		uninitialized.setLocus("NC_004763");
		uninitialized.setAccession("NC_004763");
		uninitialized.setDefinition("African green monkey polyomavirus, complete genome.");
		uninitialized.setSource("African green monkey polyomavirus");
		
		System.out.println("OUTPUT FOR UNINITIALIZED CONSTRUCTOR AFTER CALLING SETTER METHODS:");
		System.out.println(" ");
		System.out.println(uninitialized.toString());
		System.out.println(" ");
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		MiniGenBankSeq partialInitialization = new MiniGenBankSeq("NC_002549", "NC_002549");
		
		System.out.println("OUTPUT FOR PARTIALLY INITIALIZED CONSTRUCTOR: ");
		System.out.println(" ");
		System.out.println(partialInitialization.toString());
		System.out.println(" ");
		
		System.out.println("OUTPUT FOR PARTIALLY INITIALIZED CONSTRUCTOR AFTER CALLING SETTER METHODS: ");
		System.out.println(" ");
		partialInitialization.setDefinition("African green monkey polyomavirus, complete genome.");
		partialInitialization.setSource("African green monkey polyomavirus");
		
		
		System.out.println(partialInitialization.toString());
		System.out.println(" ");
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		
		MiniGenBankSeq initialization = new MiniGenBankSeq("NC_004763", "NC_004763", "African green monkey polyomavirus, complete genome.", "African green monkey polyomavirus");
		
		System.out.println("OUTPUT FOR COMPLETELY INITIALIZED CONSTRUCTOR: ");
		System.out.println(" ");
		System.out.println(initialization.toString());
		System.out.println(" ");
		
	}
		
}


