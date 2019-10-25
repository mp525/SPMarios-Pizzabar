package mariospizzabar;

import java.util.ArrayList;
import java.util.Arrays;


public class Pizza {
    private String navn;
    private int nummer;
    private String toppings;
    private double pris;

    public Pizza(int nummer, String navn, String toppings, double pris) {
        this.navn = navn;
        this.nummer = nummer;
        this.toppings = toppings;
        this.pris = pris;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }
    
    
    public String toString(){
        String result = "";
        result = "Nr. " + getNummer() + ", " + getNavn() + ": " + getToppings() + ". " + getPris() + ",-\n";
        return result;
    }

    
}
