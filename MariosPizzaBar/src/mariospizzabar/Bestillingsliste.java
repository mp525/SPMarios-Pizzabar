package mariospizzabar;

import java.util.ArrayList;


public class Bestillingsliste { //Her bliver bestillinger skrevet ind og håndteret af Alfonso alt efter behov.
    private ArrayList<Bestilling> bestillinger = new ArrayList(); //Bestillinger er en ArrayList med strings da en bestilling kan se ud på mange måder. fx "1 vesuvio og 1 carbona".

    public Bestillingsliste() {
        
    }
    
    public void tilføjBestilling(Bestilling bestilling){
        bestillinger.add(bestilling);
    }
    public void fjernBestilling(int nummer){
        Bestilling bestillingFjern = null;
        for (Bestilling bestilling : bestillinger){
            if (bestilling.getNummer() == nummer){
                bestillingFjern = bestilling;
            }
            //bestilling.getPizzaer(); add til fil gamleOrdrer
        }
        
        bestillinger.remove(bestillingFjern);
        
    }
    public String getBestilling(int nummer){
        String bestillingUd = "";
        //ArrayList<Pizza> bestilString = null;
        for (Bestilling bestilling : bestillinger) {
            if (bestilling.getNummer() == nummer){
                bestillingUd += bestilling.getPizzaer();
                //bestilling.getPizzaer().addAll(bestilString);
                
                
                /*for (Pizza pizza : bestilString) {
                bestillingUd = pizza.toString();
                }*/
            }
        }
        return bestillingUd;
    }

    @Override
    public String toString() {
        int count = 1;
        String bestillinger = "Bestillinger: \n";
        for (Bestilling bestilling : this.bestillinger){
            bestillinger += bestilling.getNummer() + ":" + bestilling.toString() + "\n";
            count++;
        }
        return bestillinger;
    }
    
    

}
