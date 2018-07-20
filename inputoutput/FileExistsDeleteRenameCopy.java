package assignments.inputoutput;

import java.io.*;

public class FileExistsDeleteRenameCopy {

    private static BufferedReader br = null;
	
	public static void main(String[] args) {
			
		String fileName;
			
		try {

			System.out.println("Please Enter a Filename: ");
			br = new BufferedReader(new InputStreamReader(System.in));
			fileName = br.readLine();

			File f = new File(fileName);
			if (f.exists()) {

				System.out.println("Please enter your choice: ");
				System.out.println("1 = delete file");
				System.out.println("2 = rename file");
				System.out.println("3 = copy file");
				String option = br.readLine();

				if (option.charAt(0) == '1') {
					if (confirmDelete(fileName)) {
						f.delete();
						System.out.println("file deleted!");
					}
				} 
				
				else if (option.charAt(0) == '2') {
					System.out.println("Please enter new filename: ");
					String renameFilename = option = br.readLine();
					f.renameTo(new File(renameFilename));
					System.out.println("file renamed!");
				}
				
				else if (option.charAt(0) == '3') {
					System.out.println("Please enter copy filename: ");
					String copyFilename = option = br.readLine();
					copyFile(fileName, copyFilename);
					System.out.println("file copied!");
				}

				else {
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
    
    private static void copyFile(String inputFileName, String outputFileName) throws IOException {
                
            int aChar;
            
            FileReader fr = new FileReader(inputFileName);
            FileWriter fw = new FileWriter(outputFileName);

            while((aChar =  fr.read()) != -1) {
                fw.write(aChar);
            } 

            fr.close();
            fw.close();
        }    
}
