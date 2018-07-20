package assignments.arrays;

public class TemperatureConverter {
	
	public static void main(String[] args) {
		
		if (args.length != 3) {
			System.out.println("no inputs, please try again");
		}
		else {
			int startTemp = Integer.parseInt( args[0] );
			int endTemp = Integer.parseInt( args[1] );
			int incrementValue =  Integer.parseInt( args[2] );
			double tempArray[] = new double[ ( (endTemp - startTemp) / incrementValue ) + 1 ];
			tempArray[0] = startTemp;
			for (int i = 1 ; i < tempArray.length ; i++) {
				tempArray[i] = tempArray[i-1] + incrementValue;
			}
			System.out.println("CELSIUS\tFAHRENHEIT");
			for (double eachTemp : tempArray) {
				System.out.println("" + eachTemp + "\t" + ((eachTemp*9/5)+32));
			}
		}
		
	}

}
