 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesCarribean.control;


/**
 *
 * @author Misty
 */
public class ShipControlTest {
    
    public ShipControlTest() {
    }

    /**
     * Test of calcVoyageKits method, of class ShipControl.
     */
    
    public void testCalcVoyageKits() {
        
        System.out.println("calcVoyageKits");
        
        /*****************
         * Test case #1
         ****************/
        System.out.println("tTest case #1");
        
        // input values for test case #1
        double supplyKits = 12.0;
        double crew = 4.0;
        
        double expResult = 48.0; // expected output returned value
        
        // create instance of SupplyControl class
        ShipControl instance = new ShipControl();
        
        // call function to run test
        double result = instance.calcVoyageKits(supplyKits, crew);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
        
         /*****************
         * Test case #2
         ****************/
        System.out.println("tTest case #2");
        
        // input values for test case #2
        double supplyKits2 = 10.0;
        double crew2 = 4.0;
        
        double expResult2 = 40.0; // expected output returned value
        
        // create instance of SupplyControl class
        ShipControl instance2 = new ShipControl();
        
        // call function to run test
        double result2 = instance2.calcVoyageKits(supplyKits, crew);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result2, 40.0);
        
        
        /*****************
         * Test case #3
         ****************/
        System.out.println("tTest case #3");
        
        // input values for test case #3
        double supplyKits3 = 9.0;
        double crew3 = 3.0;
        
        double expResult3 = 27.0; // expected output returned value
        
        // create instance of SupplyControl class
        ShipControl instance3 = new ShipControl();
        
        // call function to run test
        double result3 = instance3.calcVoyageKits(supplyKits, crew);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result3, 0.0);
        
        
        /*****************
         * Test case #4
         ****************/
        System.out.println("tTest case #4");
        
        // input values for test case #4
        double supplyKits4 = 7.0;
        double crew4 = 4.0;
        
        double expResult4 = 28.0; // expected output returned value
        
        // create instance of SupplyControl class
        ShipControl instance4 = new ShipControl();
        
        // call function to run test
        double result4 = instance4.calcVoyageKits(supplyKits, crew);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result4, 0.0);
    }

    private void assertEquals(double expResult, double result4, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
