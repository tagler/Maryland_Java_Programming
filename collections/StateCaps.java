package assignments.collections;

import java.util.*;
import java.io.*;

public class StateCaps {

	public static void main(String[] args) {
				
		BufferedReader br = null;
		String aLine = null;
		String aLineArray[];
		Map <String,String> stateCaps = new HashMap<String,String>();
		
		try{
			br = new BufferedReader(new FileReader("statecaps.txt"));		
			while((aLine = br.readLine()) != null){
				aLineArray = aLine.split(",");
				stateCaps.put(aLineArray[0], aLineArray[1]);
			}
		}
		catch (IOException ioe) {
			System.err.println("IO Exception:" + ioe.getMessage());
		}
		finally {
			try {
				if( br != null)
					br.close();
			}
			catch(IOException ioe) {
				System.err.println("Problem closing I/O");
			}
		}
		
	String key;
	Iterator <String> iter = stateCaps.keySet().iterator();
	while (iter.hasNext()) {
		key = iter.next();
		System.out.print("State: " + key);
		System.out.println(", Cap: " + stateCaps.get( key ) );
	}
	
	}
	
}
