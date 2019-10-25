/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariospizzabar;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mathias
 */
public class BestillingslisteTest {
    
    public BestillingslisteTest() {
    }
    
    @Before
    public void setUp() {
        
    }

    /**
     * Test of tilføjBestilling method, of class Bestillingsliste.
     */
    @Test
    public void testTilføjBestilling() {
        System.out.println("tilf\u00f8jBestilling");
        Bestilling bestilling = null;
        Bestillingsliste instance = new Bestillingsliste();
        instance.tilføjBestilling(bestilling);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fjernBestilling method, of class Bestillingsliste.
     */
    @Test
    public void testFjernBestilling() {
        System.out.println("fjernBestilling");
        int nummer = 0;
        Bestillingsliste instance = new Bestillingsliste();
        instance.fjernBestilling(nummer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Bestillingsliste.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Bestillingsliste instance = new Bestillingsliste();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
