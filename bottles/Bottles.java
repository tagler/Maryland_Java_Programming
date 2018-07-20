//------------------------------------------------------------------------------
// Java Programming Assessment #1 
// class that prints out the verses to the song "99 Bottles"
// - supports command-line parameter (positive integer) to change number
// -----------------------------------------------------------------------------
// system error code 1 = invalid number of command-line parameters
// system error code 2 = command-line parameter is not a positive integer
// system error code 3 = command-line parameter is not a positive integer (zero)
//------------------------------------------------------------------------------

package assignments.bottles;

public class Bottles {
	
	public static void main(String args[]) {
		
		// default value
		int numberBottles = 99;
		
		// calls method to process command-line parameter (optional)
		if (args.length != 0) {
			numberBottles = inputCommandLine(args);
		}
		
		// calls method to print song text 
		printSongText(numberBottles);	
	}
	
	// -------------------------------------------------------------------------
	// method that processes optional command-line parameter(s)
	// -------------------------------------------------------------------------
	public static int inputCommandLine(String args[]) {
		
		// error text
		String textError = "\nError: Invalid command-line parameter ";
		
		// checks for 1 command-line parameter only
		if (args.length != 1) {
			// if invalid, system error
			System.out.println(textError + "(too many parameters)\n");
			System.exit(1);
			}
		
		// validates integers only
		for (int i = 0 ; i < args[0].length() ; i++) {
				if (!Character.isDigit(args[0].charAt(i))) {
					// if invalid, system error
					System.out.println(textError + "(not positive integer)\n");
					System.exit(2);
				}
			}
		
		// parse command-line input and convert to integer data type
		int validatedUserInput = Integer.parseInt(args[0]);
		
		// input of 0 special case
		if (validatedUserInput == 0) {
			System.out.println(textError + "(zero is not a valid input)\n");
			System.exit(3);
		}

		// return validated command-line parameter  
		return validatedUserInput;
		
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
