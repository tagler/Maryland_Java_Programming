package assignments.exceptions;

//------------------------------------------------------------------------------
// class that prints out the verses to the song "99 Bottles"
// *supports command-line parameter (positive integer) to change number
// -----------------------------------------------------------------------------
public class Bottles {
	
	public static void main(String args[]) {
		
		// default value
		int numberBottles = 99;
		
		// process command-line parameter (optional) 
		if (args.length == 1) {
			try {
				numberBottles = Integer.parseInt(args[0]);
			}
			catch (NumberFormatException nfe) {
				System.out.println("\nInvalid command-line parameters, defaulting to 99\n");
			}
		}
		else {
			System.out.println("\nInvalid number of command-line parameters, defaulting to 99\n");
		}
		
		// calls method to print song text
		if (numberBottles > 0) {
			printSongText(numberBottles);
		}
		else {
			System.out.println("\nZero is not a valid input, please try again\n");
		}
	}
	
	// -------------------------------------------------------------------------
	// method that prints out the song text 
	// -------------------------------------------------------------------------
	public static void printSongText(int numberBottles) {
		
		// song text
		String textSong1 = " bottles of beer on the wall!";
		String textSong2 = " bottles of beer!";
		String textSong3 = "Take one down\nAnd pass it around";
		String textSong4 = " bottle of beer on the wall!";
		String textSong5 = " bottle of beer!";
		String textSong6 = "No more bottles of beer on the wall!\n";
		
		// print out song lyrics,  subtracts 1 bottle each time
		for (int i = numberBottles ; i > 0 ; i--) {
			
			// more than 2 bottles 
			if (i > 2) {
				System.out.println();
				System.out.print(i);
				System.out.println(textSong1);
				System.out.print(i);
				System.out.println(textSong2);
				System.out.println(textSong3);
				System.out.print(i-1);
				System.out.println(textSong1);
			} 
			
			// 2 bottles 
			else if (i == 2) {
				System.out.println();
				System.out.print(i);
				System.out.println(textSong1);
				System.out.print(i);
				System.out.println(textSong2);
				System.out.println(textSong3);
				System.out.print(i-1);
				System.out.println(textSong4);
			}
			
			// 1 bottle
			else if (i == 1) {
				System.out.println();
				System.out.print(i);
				System.out.println(textSong4);
				System.out.print(i);
				System.out.println(textSong5);
				System.out.println(textSong3);
				System.out.println(textSong6);
			}
		}
		
	}
	
}
