package assignments.exceptions;

public class CommandLine {

	public static void main(String args[]) {
		try {
			middleMethod(args);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
	
	public static void middleMethod(String args[]) {
		try {
			innermostMethod(args);
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
	
	public static void innermostMethod(String args[]) {
		try {
			int a = Integer.parseInt( args[0] );
			int b = Integer.parseInt( args[1] );
			int c = Integer.parseInt( args[2] );
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		catch (NumberFormatException e) {
			System.out.println(e);
		}
	}
	
}
