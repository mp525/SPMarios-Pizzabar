package mariospizzabar;

import java.util.ArrayList;


public class Bestilling {
    private int nummer;
    private String indhold;
    private ArrayList<Pizza> pizzaer;

    public Bestilling(ArrayList<Pizza> pizzaer, String inhold, int nummer) {
        this.indhold = inhold;
        this.nummer = nummer;
        this.pizzaer = pizzaer;
        
    }

    public int getNummer() {
        return nummer;
    }
    public void nummerMinus(){
        this.nummer = nummer--;
    }

    public String getPizzaer() {
        String result = "";
        for (Pizza pizza : pizzaer) {
            result += pizza.toString();
        }
        return result;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public String getIndhold() {
        return indhold;
    }

    public void setIndhold(String indhold) {
        this.indhold = indhold;
    }
    
    

    @Override
    public String toString() {
        String result;
        result = getPizzaer() + " Til " + indhold;
        return result;
    }
    
    
    

}
