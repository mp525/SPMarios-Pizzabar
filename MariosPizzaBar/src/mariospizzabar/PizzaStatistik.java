
package mariospizzabar;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import mariospizzabar.PizzaFile.StringParserHelper;

public class PizzaStatistik{


    
  public static void main(String[] args) throws FileNotFoundException {
      
      populær(StringParserHelper.addPizzaNumber());
    
    int[] array = {1,2,3,4,5,6,6,8,8,8,8,8,2,2,2,2,2,2,2,2,2};
    //System.out.println("Den totale omsætning: " + omsætning(array)+ "kr");
    //System.out.println("Den mest populære pizza er: " + populær(array));
  }

  public static int omsætning(int[] array){
      int samletOmsætning = 0;
      for(int i = 0; i < array.length; i++){
          samletOmsætning += array[i];
      }
        
      return samletOmsætning;
  }
  public static int populær(ArrayList<Integer> arr){
      int size = arr.size();
      int[] array = new int[size];
      for (int i = 0; i < size; i++) {
          array[i] = arr.get(i);
      }
      
      
      int element = 0;
      int count = 0;
      for(int i = 0; i < array.length; i++){
        int tempElement = array[i];
        int tempCount = 0;
        for(int j = 0; j < array.length; j++){
            if(array[j]==tempElement)
                tempCount++;
            if(tempCount > count){
                element = tempElement;
                count = tempCount;
            }
            
        }
          
      }
      System.out.println(element);
      return element;
  } 
//    @Override
//  public String toString(){
//      return "Den mest pupolære pizza er: " + populær(array);
  }
 
