package mariospizzabar;

import java.util.ArrayList;
import java.util.Scanner;

public class MariosPizzaBar {

    private static int count = 0;
    static Scanner myScan = new Scanner(System.in);
    static MenuKort menukort = new MenuKort();
    static Bestillingsliste bestillinger = new Bestillingsliste();

    public static void main(String[] args) {

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

        //Vi tilføjer alle pizzaer til menukortet.
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

        start();

        //Når bestilling fjernes gemmes ordren så man kan lave statestik 
        //ArrayList addAll metode til at komme pizzaer fra bestillinger ind i gamleOrdrer
    }

    public static void start() {
        System.out.println("Velkommen!\n");
        boolean isOn = true;
        while (isOn) {
            System.out.println(bestillinger.toString());
            System.out.println("Menu:\nFor ny bestilling tast 1\nFor at fjerne en bestilling tast 2\nFor at se menukortet tast 3\nFor at slukke tast 0");
            int userInt = myScan.nextInt();
            if (userInt == 1) {
                lavBestilling();
            } else if (userInt == 2) {
                fjernBestilling();
            } else if (userInt == 3) {
                System.out.println(menukort.toString());
            } else if (userInt == 0) {
                isOn = false;
            }
        }

    }

    public static void lavBestilling() {
        ArrayList<Pizza> pizzaList = new ArrayList();
        System.out.print("Hvor mange pizzaer?: ");
        int antalPizza = myScan.nextInt();
        myScan.nextLine();
        for (int i = 0; i < antalPizza; i++) {
            System.out.print("Skriv pizza nummer: ");
            int pizNr = myScan.nextInt();
            myScan.nextLine();
            Pizza pizza = menukort.tjekPizza(pizNr);

            if (pizza == null) {
                System.out.println("Pizza findes ikke!");
                i--;
            }
            pizzaList.add(pizza);
        }
        System.out.println("Skriv kundenavn og afhentningstidspunkt: ");
        String kundeOgTidspunkt = myScan.nextLine();
        Bestilling bestilling = new Bestilling(pizzaList, kundeOgTidspunkt, ++count);
        bestillinger.tilføjBestilling(bestilling);
        System.out.println(bestillinger.toString());
    }

    public static void fjernBestilling() {
        System.out.println("Hvilken bestilling skal fjernes?: ");
        int userNummer = myScan.nextInt();
        myScan.nextLine();
        bestillinger.fjernBestilling(userNummer);
        System.out.println("Bestilling " + userNummer + " er blevet fjernet.");

    }

    public static void lavStatestik() { //*placeholder for Daniel*

    }

}
