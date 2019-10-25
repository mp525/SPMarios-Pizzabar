package mariospizzabar;

import java.util.Scanner;


public class MariosPizzaBar {
    private static int count = 0;

    public static void main(String[] args) {
        start();
        
        //Vi laver alle 14 pizzaobjekter.
        Pizza pizza1 = new Pizza(1, "Vesuvio", "tomatsauce, ost, skinke, oregano", 57.0);
        Pizza pizza2 = new Pizza(2, "Amerikaner", "tomatsauce, ost, oksefars, oregano", 53.0);
        Pizza pizza3 = new Pizza(3, "Cacciatore", "tomatsauce, ost, pepperoni, oregano", 57.0);
        Pizza pizza4 = new Pizza(4, "Carbona", "tomatsauce, ost, kødsauce, spaghetti, cocktailpølser, oregano", 63.0);
        Pizza pizza5 = new Pizza(5, "Dennis", "tomatsauce, ost, skinke, pepperoni, cocktailpølser, oregano", 65.0);
        Pizza pizza6 = new Pizza(6, "Bertil", "tomatsauce, ost, bacon, oregano", 57.0);
        Pizza pizza7 = new Pizza(7, "Silvia", "tomatsauce, ost, pepperoni, rød peber, løg, oliven, oregano", 61.0);
        Pizza pizza8 = new Pizza(8, "Victoria", "tomatsauce, ost, skinke, ananas, champignon, løg, oregano", 61.0);
        Pizza pizza9 = new Pizza(9, "Toronfo", "tomatsauce, ost, skinke, bacon, kebab, chili, oregano", 61.0);
        Pizza pizza10 = new Pizza(10, "Capricciosa", "tomatsauce, ost, skinke, champignon, oregano", 61.0);
        Pizza pizza11 = new Pizza(11, "Hawai", "tomatsauce, ost, skinke, ananas, oregano", 61.0);
        Pizza pizza12 = new Pizza(12, "Le Blissola", "tomatsauce, ost, skinke, rejer, oregano", 61.0);
        Pizza pizza13 = new Pizza(13, "Venezia", "tomatsauce, ost, skinke, bacon, oregano", 61.0);
        Pizza pizza14 = new Pizza(14, "Mafia", "tomatsauce, ost, pepperoni, bacon, løg, oregano", 61.0);
        
        MenuKort menukort = new MenuKort(); //Alle pizzaer bliver sat på menukortet.
        menukort.tilføjPizza(pizza1);
        menukort.tilføjPizza(pizza2);
        menukort.tilføjPizza(pizza3);
        menukort.tilføjPizza(pizza4);
        menukort.tilføjPizza(pizza5);
        menukort.tilføjPizza(pizza6);
        menukort.tilføjPizza(pizza7);
        menukort.tilføjPizza(pizza8);
        menukort.tilføjPizza(pizza9);
        menukort.tilføjPizza(pizza10);
        menukort.tilføjPizza(pizza11);
        menukort.tilføjPizza(pizza12);
        menukort.tilføjPizza(pizza13);
        menukort.tilføjPizza(pizza14);
        System.out.println(menukort.toString());
        
        Bestillingsliste bestillinger = new Bestillingsliste();
        bestillinger.tilføjBestilling(new Bestilling("en nr 1 vesuvio til Aase kl 17:30", ++count)); //Skal indeholde en ArrayList med de pizzaer der skal med
        bestillinger.tilføjBestilling(new Bestilling("to nr 7 og en nr 4 navn kurt 17:40", ++count)); //Alfonso skal kun skrive pizzaerne, kundenavn og tidspunkt
        System.out.println(bestillinger.toString());
        
        //Når bestilling fjernes gemmes ordren så man kan lave statestik 
        
        
    }
    public static void start(){
        Scanner myScan = new Scanner(System.in);
        System.out.println("Velkommen.\nFor ny bestilling tast 1\n");
        
        intCheck(myScan.nextInt());
        
        
    }
    public static void intCheck(int userInt){
        if (userInt == 1){
            
        }
    }

}
