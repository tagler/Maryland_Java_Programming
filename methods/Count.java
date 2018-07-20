package assignments.methods;

public class Count {

	public static int digits(String text) {
		char c;
		int count = 0;
		for (int i = 0 ; i < text.length() ; i++) {
			c = text.charAt(i);
			if (Character.isDigit(c)) {
				count++;
			}
		}
		return count;
	}
	
	public static int whitesapce(String text) {
		char c;
		int count = 0;
		for (int i = 0 ; i < text.length() ; i++) {
			c = text.charAt(i);
			if (Character.isWhitespace(c)) {
				count++;
			}
		}
		return count;
	}
	
	public static int digits(StringBuffer text) {
		return digits(text.toString());
	}
	
	public static int whitespace(StringBuffer text) {
		return whitesapce(text.toString());
	}
	
}
