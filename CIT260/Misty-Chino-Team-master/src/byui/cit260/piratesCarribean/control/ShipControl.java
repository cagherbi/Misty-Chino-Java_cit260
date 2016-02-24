/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesCarribean.control;

/**
 *
 * @author Misty - chino
 */
public class ShipControl {
    
    private double calcVoyageKits;
        
        public double calcVoyageKits (double supplyKits, double crew){
       
        if (crew < 4){
         return -1;
        }
    
        if (supplyKits < 12){
        return -1;
        }
       
        calcVoyageKits = supplyKits * crew;
        
        return calcVoyageKits;
    }
}
    
    

