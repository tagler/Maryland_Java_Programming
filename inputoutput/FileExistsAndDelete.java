package assignments.inputoutput;

import java.io.*;

public class FileExistsAndDelete {

    private static BufferedReader br = null;
	
	public static void main(String[] args) {
				
		String fileName;
		
		try {
			
			// filename 
			System.out.println("Please Enter a Filename: ");
			br = new BufferedReader( new InputStreamReader(System.in) );
			fileName = br.readLine();
			
			File f = new File(fileName);
	        if (f.exists()) {
	        	
	            if (confirmDelete(fileName)) {
	                f.delete();
	                System.out.println(fileName + " deleted");
	            } 
	        	
	        }
	        else {
	        	System.out.println("file does not exist");
	        }
			
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
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
	
    private static boolean confirmDelete(String name) throws IOException {
        
    	System.out.print("Do you want to delete " + name + "? (y/n) ");
        String answer = br.readLine();

        if (answer.startsWith("Y") || answer.startsWith("y")) {
            return true;
        } 
        else {
            return false;
        }
    }

}
