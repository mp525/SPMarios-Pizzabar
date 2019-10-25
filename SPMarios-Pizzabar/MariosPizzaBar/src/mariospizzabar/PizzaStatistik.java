
package mariospizzabar;

public class PizzaStatistik{


    
  public static void main(String[] args) {
//        
    
    int[] array = {1,2,3,4,5,6,6,8,8,8,8,8,2,2,2,2,2,2,2,2,2};
   System.out.println("Den totale omsætning: " + omsætning(array)+ "kr");
  System.out.println("Den mest pupolære pizza er: " + populær(array));
  }

  public static int omsætning(int[] array){
      int samletOmsætning = 0;
      for(int i = 0; i < array.length; i++){
          samletOmsætning += array[i];
      }
        
      return samletOmsætning;
  }
  public static int populær(int[] array){
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
      return element;
  } 
//    @Override
//  public String toString(){
//      return "Den mest pupolære pizza er: " + populær(array);
  }
 
}