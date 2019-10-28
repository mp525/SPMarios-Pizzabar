package mariospizzabar;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PizzaFile {

    static String filename = "gamleOrdrer.txt";

    public static void main(String[] args) throws IOException {
        FileImporter.readFile();
        //StringParserHelper.addPizzaNumber("Nr. 1, Vesuvio: tomatsauce, ost, skinke, oregano. 57.0,-");
        StringParserHelper.addPizzaNumber();
        
    }

    static class StringParserHelper {

        public static String getPizzaPrice(String pizza) {
            if (pizza.contains(".0")) {
                int idx = pizza.indexOf(".0");
                pizza = pizza.substring(idx - 2, idx);

            }
            return pizza;
        }

        public static ArrayList<Integer> addPizzaNumber() throws FileNotFoundException {
            String line = "";
            int tal;
            int i = 0;
            File filename = new File("gamleOrdrer.txt");
            Scanner fileScan2 = new Scanner(filename);
            
            //int[] arr = new int[1000];
            ArrayList<Integer> arr = new ArrayList();
            
            while (fileScan2.hasNextLine()){
            line = fileScan2.nextLine();
            String[] lineArr = line.split(",");
            String pizNr = lineArr[0];
            String[] fieldArr = pizNr.split(" ");
            tal = Integer.parseInt(fieldArr[fieldArr.length-1]);
            arr.add(tal);
            
            }
            
            
            return arr;
        }
            /*if (pizza.contains("Nr. ")) {
            int idx = pizza.indexOf("Nr. ");
            pizza = pizza.substring(idx+4, idx+5);
            pizza += pizza.substring(idx+5, idx+6);
            System.out.println(pizza);
            
            }*/
    }

        

    
    
//    	static class FileExporter {
//		public static void makeHTML(String line, String filename) throws IOException {
//			// "Data/index.html"
//			File fh = new File(filename);
//			FileWriter fw = new FileWriter(fh,true);
//			BufferedWriter bw = new BufferedWriter(fw);
//			bw.write(line);
//			bw.newLine();
//			bw.close();
//		} 
//
//	}
    static class FileImporter {

        public static void readFile() throws FileNotFoundException, IOException { //Finder sum/omsætning

            String line = "";
            int sum = 0;
            File filename = new File("gamleOrdrer.txt");
            Scanner fileScan = new Scanner(filename);
            while (fileScan.hasNextLine()) {
                line = fileScan.nextLine();
                String tal = StringParserHelper.getPizzaPrice(line);
                int i = Integer.parseInt(tal);
                sum = sum + i;

            }
            System.out.println("Samlet omsætning: " + sum + " kr");
        }
    }
}

