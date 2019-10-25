package mariospizzabar;

import java.util.ArrayList;


public class Bestillingsliste { //Her bliver bestillinger skrevet ind og håndteret af alfonso alt efter behov.
    //private Pizza bestilling;
    private ArrayList<Bestilling> bestillinger = new ArrayList(); //Bestillinger er en ArrayList med strings da en bestilling kan se ud på mange måder. fx "1 vesuvio og 1 carbona".

    public Bestillingsliste() {
        
    }
    
    public void tilføjBestilling(Bestilling bestilling){
        bestillinger.add(bestilling);
    }
    public void fjernBestilling(int nummer){
        for (Bestilling bestilling : bestillinger){
            if (bestilling.getCount() == nummer){
                bestillinger.remove(bestilling);
            }
        }
        //bestillinger.remove();
    }

    @Override
    public String toString() {
        int count = 1;
        String bestillinger = "Bestillinger: \n";
        for (Bestilling bestilling : this.bestillinger){
            bestillinger += bestilling.getCount() + ": " + bestilling.toString() + "\n";
            count++;
        }
        return bestillinger;
    }
    
    

}
