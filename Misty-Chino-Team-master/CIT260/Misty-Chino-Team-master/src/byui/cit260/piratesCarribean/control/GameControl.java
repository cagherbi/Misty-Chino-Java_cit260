/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesCarribean.control;

import byui.cit260.piratesCaribbean.model.Player;
import piratescaribbean.PiratesCaribbean;

/**
 *
 * @ chino 
 */
public class GameControl {

    public static void createNewGame(Player player) {
          System.out.println("\n*** createNewGame stub function called ***");
    }
    
         
    private double calcBestTime;
    
     public double calcBestTime (double levelCompleted, double totalTime){
     
     if (levelCompleted > 2){
        return 1;
     }              
     if (levelCompleted < 0 && totalTime > 1){
         return 1; 
     }
     double bestTime = levelCompleted / totalTime;
        return calcBestTime;
     }
     
     
}
