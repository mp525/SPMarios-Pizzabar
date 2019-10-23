package mariospizzabar;

import java.util.ArrayList;


public class Bestilling {
    private int count;
    private String inhold;
    private ArrayList<Pizza> pizzaer;

    public Bestilling(ArrayList<Pizza> pizzaer, String inhold, int count) {
        this.inhold = inhold;
        this.count = count;
        this.pizzaer = pizzaer;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return inhold + " " + count;
    }
    
    
    

}
