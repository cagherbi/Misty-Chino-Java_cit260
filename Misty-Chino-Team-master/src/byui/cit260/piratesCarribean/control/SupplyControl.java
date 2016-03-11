/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesCarribean.control;

/**
 *
 * @author Misty- Chino
 */
public class SupplyControl {

    private double calcSupplies;
   
    
    public double calcSupplies (double supplyKit, double crewBoarded, double timeTraveled){
        
        if (supplyKit > 9 || supplyKit <= 15){
        return 1;
         }
        
        if (crewBoarded < 4 || timeTraveled > 3){ 
        return 1;
         }       
        
        calcSupplies = (crewBoarded * supplyKit) / timeTraveled;
                return calcSupplies;
    }
    
}
