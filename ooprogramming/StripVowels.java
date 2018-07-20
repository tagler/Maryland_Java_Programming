package assignments.ooprogramming;

public class StripVowels {
	
	public static void main(String[] args) {
		
		String input = new String("Now is the time");
		StringBuffer output = new StringBuffer();
		
		char eachChar; 
		
		// loop through each character of string 
		for (int i=0 ; i < input.length() ; i++ ) {
			eachChar = input.charAt(i);
			// vowels
			if (eachChar == 'a' || eachChar == 'e' || eachChar == 'i' || eachChar == 'o' || eachChar == 'u') {
				continue;
			// non-vowels
			}
			else {
				output.append(eachChar);
			}
		}
		
		// print results 
		System.out.println(output);
					
	}
	
}