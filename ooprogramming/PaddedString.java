package assignments.ooprogramming;

public class PaddedString {
	
	// data
	StringBuffer data;
	
	// construct
	public PaddedString(String input) {
		this.data = new StringBuffer(input);
	}
	public PaddedString(double input) {
		this.data = new StringBuffer("" + input);
	}
	public PaddedString(int input) {
		this.data = new StringBuffer("" + input);
	}
	
	// methods
	public void padLeft(int fieldWidth) {
		while (fieldWidth > data.length()) {
			data.insert(0, ' ');
		}
	}
	public void padRight(int fieldWidth) {
		while (fieldWidth > data.length()) {
			data.append(' ');
		}
	}
	 public void trimBlanks() {
		 //trailing white space
		 int rightWhite = 0;
		 for (int i = data.length() ; i > 0; i--) {
			 if (data.charAt(i-1) == ' ') {
				 continue;
			 }
			 else {
				 rightWhite = i-1;
				 break;
			 }
		 }		 
		 data.delete(rightWhite+1, data.length());
		 // leading white space
		 int leftWhite = 0;
		 for (int i = 0 ; i < data.length(); i++) {
			 if (data.charAt(i) == ' ') {
				 continue;
			 }
			 else {
				 leftWhite = i;
				 break;
			 }
		 }
		 data.delete(0, leftWhite);
	 }
	public void replace(String input) {
        this.data.replace(0, data.length(), input);
    }
	public void replace(double input) {
        this.data.replace(0, data.length(), "" + input);
	}
	public void replace(int input) {
        this.data.replace(0, data.length(), "" + input);
	}
	public int length() {
		return data.length();
	}
	public String toString() {
		return data.toString(); 
	}
	
}