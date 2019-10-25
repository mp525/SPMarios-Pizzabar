
package mariospizzabar;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PizzaFile {
    public static void main(String[] args) {
        
    }
        static class StrinParserHelper{
            public static String getPizzaPrice(String pizza){
                String pizzaPrice;
                if(pizza.contains(".-")){
                    int idx = pizza.indexOf(".-");
                    
                }
        }
            
        }
    	static class FileExporter {
		public static void makeHTML(String line, String filename) throws IOException {
			// "Data/index.html"
			File fh = new File(filename);
			FileWriter fw = new FileWriter(fh,true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(line);
			bw.newLine();
			bw.close();
		} 

	}
    	static class FileImporter {
		public static void readCarsCSV(String filename) throws FileNotFoundException, IOException {
			// bruge scanner
			String line = "";
			String destFilename = "Data/index.html";
			File fh = new File(filename);
			Scanner myScanner = new Scanner(fh);
			while(myScanner.hasNextLine()) {
				line = myScanner.nextLine();    
				System.out.println(line);
				FileExporter.makeHTML(line, destFilename);
			}
		}
	}
}
