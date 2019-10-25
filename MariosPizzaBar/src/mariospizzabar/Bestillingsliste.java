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
        }
        bestillinger.remove(bestillingFjern);
        
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
