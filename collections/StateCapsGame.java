package assignments.collections;

import java.util.*;
import java.io.*;

public class StateCapsGame { 

	public static void main(String[] args) {
		
		HashMap<String,String> stateCaps = createStateCapHashMap("statecaps.txt");
	
		Random rand = new Random();
		String randomStateCap[];
		String state, capital; 
		String guess = null;
		
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));
		
		int correct = 0;
		int total = 0;
		
		// game loop
		do { 
			
			// generates random state and capital for each round of game
			randomStateCap = generateRandomStateCap( stateCaps, rand.nextInt(stateCaps.size()) );
			state = randomStateCap[0];
			capital = randomStateCap[1];
			
			// user input
			System.out.print("What is the capital of " + state + " (q to quit)? ");
			try { 
				guess = br.readLine();
			}
			catch (IOException e){
				System.err.println("Input error");
			}
			
			// check if correct or incorrect 
			if (guess.equals(capital)) {
				System.out.println("Correct!\n");
				correct++;
			}
			else {
				System.out.println("Incorrect! It is " + capital + "\n");
			}
			total++;
		
		} while ( !guess.equals("q") );
		
		// print results
		System.out.println("-----------------------------------------------");
		System.out.println("Results: " + correct + " correct out of " + (total-1));
		System.out.println("-----------------------------------------------");	}
	
	// creates hashmap from state capitals filename 
	public static HashMap<String,String> createStateCapHashMap(String filename) {
		
		BufferedReader br = null;
		String aLine = null;
		String aLineArray[];
		HashMap <String,String> stateCaps = new HashMap<String,String>();
		
		try{
			br = new BufferedReader(new FileReader(filename));		
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
		
		return stateCaps;
	}
	
	// generates a random state and capital 
	public static String[] generateRandomStateCap(HashMap<String,String> stateCaps, int randomValue) {
		
		String results[] = new String[2];
		String key, value;
		int i = 0;
		
		Iterator <String> iter = stateCaps.keySet().iterator();
		while (iter.hasNext()) {
			key = iter.next();
			value =  stateCaps.get( key );
			if (i == randomValue) {
				results[0] = key;
				results[1] = value;
				break;
			}
			i++;
		}
		
		return results;
	}
	
}
