package assignments.collections; 

import java.util.*;

public class CommandLineArgs {

	public static void main(String[] args) {
		
		ArrayList<String> argsArray = new ArrayList<String>();
		for (String each : args) {
			argsArray.add(each);
		}

		// for loop version
		int sum = 0;
		System.out.println("For Loop Version");
		for (int i = 0 ; i < argsArray.size() ; i++) {
			System.out.println( argsArray.get(i) );
			sum += Integer.parseInt( argsArray.get(i) );
		}
		System.out.println("Sum: " + sum);
		
		// iterator version
		sum = 0;
		String temp;
		System.out.println("\nIterator Version");
		Iterator<String> iter = argsArray.iterator();
		while (iter.hasNext()) {
			temp = iter.next();
			System.out.println( temp );
			sum += Integer.parseInt( temp );
		}
		System.out.println("Sum: " + sum + "\n");
		
	}

}
