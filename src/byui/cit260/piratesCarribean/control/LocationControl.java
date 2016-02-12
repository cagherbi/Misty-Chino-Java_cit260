/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesCarribean.control;

/**
 *
 * @author admin
 */
public class LocationControl {
    
    public double calcDistance (double speedShip, double timeTraveled){
       
        if (speedShip > 10){
         return 1;
        }
    
        if (speedShip < 0 || timeTraveled < 1){
        return 1;
        }
       
        double distance = speedShip * timeTraveled;
        return distance;
    }
}
    