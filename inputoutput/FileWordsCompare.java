package assignments.inputoutput;

import java.io.*;
import java.util.Arrays;

public class FileWordsCompare {

	public static void main(String args[]) {
		
		String theLine1;
		String theLine2; 
		
		BufferedReader br1 = null;  
		BufferedReader br2 = null;
		
		System.out.println( System.getProperty("user.dir") );
		
		try {
			
			br1 = new BufferedReader( new FileReader( args[0] ));
			br2 = new BufferedReader( new FileReader( args[1] ));
			
			String text1 = "";
			String text2 = "";
			
			while ( (theLine1 = br1.readLine()) != null ) {
				text1 += theLine1;
			}
			while ( (theLine2 = br2.readLine()) != null ) {
				text2 += theLine2;
			}
			
			String text1Array[] = text1.split(" ");
			String text2Array[] = text2.split(" ");
			
			Arrays.sort(text1Array);
			Arrays.sort(text2Array); 
			
			String array1DeDupe [] = new String[text1Array.length];
			String array2DeDupe [] = new String[text2Array.length];
			array1DeDupe[0] = text1Array[0];
			array2DeDupe[0] = text2Array[0];
			
			int deDupeCount1 = 0;
			for ( int i = 0 ; i < text1Array.length ; i++ ) {
				 String word1 = text1Array[i];
				 if (!word1.equalsIgnoreCase(array1DeDupe[deDupeCount1])) {
					 deDupeCount1++;
					 array1DeDupe[deDupeCount1] = word1;
				 }
			}
			int deDupeCount2 = 0;
			for ( int i = 0 ; i < text2Array.length ; i++ ) {
				 String word2 = text2Array[i];
				 if (!word2.equalsIgnoreCase(array2DeDupe[deDupeCount2])) {
					 deDupeCount2++;
					 array2DeDupe[deDupeCount2] = word2;
				 }
			}
			for (String each1 : array1DeDupe) {
				for (String each2 : array2DeDupe) {
					if (each1 != null && each2 != null) {
						if (each1.equalsIgnoreCase(each2)) {
							System.out.print( each1 + " ");
						}
					}
				}
			}
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println( "command-line args invalid");
		}
		catch (FileNotFoundException e) {
			System.out.println( "file not found");
		}
		catch (IOException e) {
			System.out.println( "other IOException");
		}
		finally {
			try {
				if (br1 != null) {
					br1.close();
				}
				if (br2 != null) {
					br2.close();
				}
			}
			catch (IOException e) {
			}
		}
		
	}
	
}
