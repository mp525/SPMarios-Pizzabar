package mariospizzabar;

import java.util.ArrayList;


public class MenuKort { //Menukortet kunne bare være fyldt med vores pizzaer.
    private ArrayList<Pizza> menukort = new ArrayList();

    public MenuKort() {
        
    }
    
    public void tilføjPizza(Pizza pizza){
        menukort.add(pizza);
    }
    public void fjernPizza(Pizza pizza){
        menukort.remove(pizza);
    }
    public Pizza tjekPizza(int nummer){
        for (Pizza pizza : menukort) {
            if (pizza.getNummer() == nummer){
                return pizza;
            } 
        }
        return null;
    }
    

    @Override
    public String toString() {
        String result = "Menukort: \n";
        for (Pizza pizza : this.menukort){
            result += pizza.toString();
        }
        return result;
        
    }
    
    

}
