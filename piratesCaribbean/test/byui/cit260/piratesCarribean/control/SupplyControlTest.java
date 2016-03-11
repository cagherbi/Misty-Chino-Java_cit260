/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesCarribean.control;


/**
 *
 * @author Misty chino
 */
public class SupplyControlTest {
    
    public SupplyControlTest() {
    }

    /**
     * Test of calcSupplies method, of class SupplyControl.
     */
    
    public void testCalcSupplies() {
        System.out.println("calcSupplies");
        /****************************
         *  Test case #1
         ***************************/
         System.out.println("\tTest case #1");
         
         // input values for test case 1
        double supplyKit = 15.0;
        double crewBoarded = 5.0;
        double timeTraveled = 3.0;
        
        double expResult = 15.0; // expected ouput return value
        
         // create instance of SupplyControl  class
        SupplyControl instance = new SupplyControl();
     
          // call function to run test
          
        double result = instance.calcSupplies(supplyKit, crewBoarded, timeTraveled);
        
         // campare excpected return value with actual value returned
        assertEquals(expResult, result, 15.0);
        
        
        
        /****************************
         *  Test case #2
         ***************************/
         System.out.println("\tTest case #2");
         
         // input values for test case 2
        double supplyKit1 = 3.0;
        double crewBoarded1 = 3.0;
        double timeTraveled1 = 13.0;
        
        double expResult1 = 1.0; // expected ouput return value
        
         // create instance of SupplyControl  class
        SupplyControl instance1 = new SupplyControl();
     
          // call function to run test
          
        double result1 = instance.calcSupplies(supplyKit1, crewBoarded1, timeTraveled1);
        
         // campare excpected return value with actual value returned
        assertEquals(expResult1, result, 1.0);
        
        
        /****************************
         *  Test case #3
         ***************************/
         System.out.println("\tTest case #3");
         
         // input values for test case 3
        double supplyKit2 = 7.0;
        double crewBoarded2 = 4.0;
        double timeTraveled2 = 10.0;
        
        double expResult2 = 1.0; // expected ouput return value
        
         // create instance of SupplyControl  class
        SupplyControl instance2 = new SupplyControl();
     
          // call function to run test
          
        double result2 = instance.calcSupplies(supplyKit2, crewBoarded2, timeTraveled2);
        
         // campare excpected return value with actual value returned
        assertEquals(expResult2, result, 1.0);
        
        /****************************
         *  Test case #2
         ***************************/
         System.out.println("\tTest case #4");
         
         // input values for test case 4
        double supplyKit3 = 5.0;
        double crewBoarded3 = 4.0;
        double timeTraveled3 = 9.0;
        
        double expResult3 = 1.0; // expected ouput return value
        
         // create instance of SupplyControl  class
        SupplyControl instance3 = new SupplyControl();
     
          // call function to run test
          
        double result3 = instance.calcSupplies(supplyKit3, crewBoarded3, timeTraveled3);
        
         // campare excpected return value with actual value returned
        assertEquals(expResult3, result, 1.0);
        
        /****************************
         *  Test case #5 Boundaries
         ***************************/
         System.out.println("\tTest case #5");
         
         // input values for test case 5
        double supplyKit4 = 12.0;
        double crewBoarded4 = 4.0;
        double timeTraveled4 = 3.0;
        
        double expResult4 = 16.0; // expected ouput return value
        
         // create instance of SupplyControl  class
        SupplyControl instance4 = new SupplyControl();
     
          // call function to run test
          
        double result4 = instance.calcSupplies(supplyKit4, crewBoarded4, timeTraveled4);
        
         // campare excpected return value with actual value returned
        assertEquals(expResult4, result, 16.0);
        
    }

    private void assertEquals(double expResult4, double result, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
