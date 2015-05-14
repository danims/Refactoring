package org.cuatrovientos.languagegreet;

/**
 * @author Daniel Martin
 * greetz in different languages
 */
public class languagegreet {

	/**
	 * Greets 
	 * @param languageNumber chosen language
	 * @param repeatCount how many times repeat greet
	 * @return a String with the greeting
	 */
	public String greet_method (int languageNumber, int repeatCount) {
		String allGreets = "";
		String greet = "";
		
		switch (languageNumber) {
			case 0 : greet = "hola";
					 break;
			case 1 : greet = "hello";
					 break;
			case 2 : greet = "kaixo";
			 		 break;
			 default:
				 	 break;	
		 }
		
		// Repeat greet rep times
		for (int i=0;i<repeatCount;i++) {
			allGreets += greet;
		}
		
		return allGreets;
	}
}
