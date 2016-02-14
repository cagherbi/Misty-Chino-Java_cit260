/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesCarribean.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chino
 */
public class GameControlTest {
    
    public GameControlTest() {
    }

    /**
     * Test of calcBestTime method, of class GameControl.
     */
    @Test
    public void testCalcBestTime() {
        System.out.println("calcBestTime");
         /****************************
         *  Test case #1
         ***************************/
         System.out.println("\tTest case #1");
          // input values for test case 1
        double levelCompleted = 3.0;
        double totalTime = 2.0;
        
        double expResult = 1.5;// expected ouput return value
        
        // create instance of SupplyControl  class
        GameControl instance = new GameControl();
        
        // call function to run test
        double result = instance.calcBestTime(levelCompleted, totalTime);
        
         // campare excpected return value with actual value returned
        assertEquals(expResult, result, 1.5);
        
           /****************************
         *  Test case #2
         ***************************/
         System.out.println("\tTest case #2");
          // input values for test case 2
        double levelCompleted1 = 2.0;
        double totalTime1 = 3.0;
        
        double expResult1 = 1.0;// expected ouput return value
        
        // create instance of SupplyControl  class
        GameControl instance1 = new GameControl();
        
        // call function to run test
        double result1 = instance.calcBestTime(levelCompleted, totalTime);
        
         // campare excpected return value with actual value returned
        assertEquals(expResult1, result, 1.0);
        
            /****************************
         *  Test case #3
         ***************************/
         System.out.println("\tTest case #3");
          // input values for test case 3
        double levelCompleted2 = 1.0;
        double totalTime2 = 3.0;
        
        double expResult2 = 0.334;// expected ouput return value
        
        // create instance of SupplyControl  class
        GameControl instance2 = new GameControl();
        
        // call function to run test
        double result2 = instance.calcBestTime(levelCompleted, totalTime);
        
         // campare excpected return value with actual value returned
        assertEquals(expResult2, result, 1.0);
     
            /****************************
         *  Test case #4
         ***************************/
         System.out.println("\tTest case #4");
          // input values for test case 4
        double levelCompleted3 = 0.0;
        double totalTime3 = 2.0;
        
        double expResult3 = 0.0;// expected ouput return value
        
        // create instance of SupplyControl  class
        GameControl instance3 = new GameControl();
        
        // call function to run test
        double result3 = instance.calcBestTime(levelCompleted, totalTime);
        
         // campare excpected return value with actual value returned
        assertEquals(expResult3, result, 1.0);
        
            /****************************
         *  Test case #5
         ***************************/
         System.out.println("\tTest case #5");
          // input values for test case 5
        double levelCompleted4 = 3.0;
        double totalTime4 = 3.0;
        
        double expResult4 = 1.0;// expected ouput return value
        
        // create instance of SupplyControl  class
        GameControl instance4 = new GameControl();
        
        // call function to run test
        double result4 = instance.calcBestTime(levelCompleted, totalTime);
        
         // campare excpected return value with actual value returned
        assertEquals(expResult4, result, 1.0);
    }
    
}
