package assignments.methods;

public class GenerateRandomNumbers {
	
	public static void main(String[] args) {
		
		long t1 = System.currentTimeMillis();
		
		double x;
		int loops = 10000;
		int greaterCount = 0;
		int lessthanCount = 0;
		for (int i = 0 ; i < loops ; i++) {
			x = Math.random();
			if (x > 0.5) {
				greaterCount++;
			}
			else {
				lessthanCount++;
			}
		}

		System.out.println("Number of Random Numbers: " + loops);
		System.out.println( "Greater Than Count: " + greaterCount);
		System.out.println( "Less Than or Equal Count: " + lessthanCount + "\n");

		int maxLoops = 1000000;
		for (int i = loops+1; i <= maxLoops; i++ ) {
			x = Math.random();
			if (x > 0.5) {
				greaterCount++;
			}
			else {
				lessthanCount++;
			}
			if (greaterCount == lessthanCount) {
				long t2 = System.currentTimeMillis();
				System.out.println("Counts are equal after " + i + " total loops!");
				System.out.println("Runtime: " + (t2-t1) + "ms");
				System.exit(1);
			}
		}
		
		long t2 = System.currentTimeMillis();
		System.out.println("" + maxLoops + " random numbers were generated without equal counts");
		System.out.println( "Greater Than Count: " + greaterCount);
		System.out.println( "Less Than or Equal Count: " + lessthanCount + "\n");
		System.out.println("Runtime: " + (t2-t1) + "ms"); 
		System.exit(2);

	}

}
