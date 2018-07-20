package assignments.inputoutput;

import java.io.*;

public class CountLines {

	public static void main(String[] args) {
		
		String theLine;
			
		FileReader fr = null;
		BufferedReader br = null;
			
		try {
			
			br = new BufferedReader( new FileReader( args[0] ) );
			
			int lineCount = 0;
			String lineWords [];
			int wordCount = 0;
			int charCount = 0;
			
			while ( (theLine = br.readLine()) != null ) {
				
				lineCount++;
				lineWords = theLine.split(" ");
				wordCount += lineWords.length;
				charCount += theLine.length();
				
			}
			
			System.out.println("--------------------------------------");
			System.out.println("Filename: " + args[0]);
			System.out.println("--------------------------------------");
			System.out.println("Number of lines: " + lineCount);
			System.out.println("Number of Words: " + wordCount);
			System.out.println("Number of Characters: " + charCount);
			System.out.println("--------------------------------------");
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("command-line parameter required!");
		}
		catch (FileNotFoundException e) {
			System.out.println("file not found!");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (br != null) {
					br.close();
				}
			}
			catch (IOException e) {
			}
		}
		
	}

}
