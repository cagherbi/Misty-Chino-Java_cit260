/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piratescaribbean;

import byui.cit260.piratesCaribbean.model.Actor;
import byui.cit260.piratesCaribbean.model.Map;
import byui.cit260.piratesCaribbean.model.Player;
import byui.cit260.piratesCaribbean.model.Supply;

/**
 *
 * @author Chino Agherbi 
 */
public class PiratesCaribbean {

    private static Object actor;
    private static Object map;
    private static Object navigation;
    private static Object portRoyal;
    private static Object supply;
    private static Object navigationType;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Johnny Depp");
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        Actor actorName = new Actor();
        
        actorName.setName("");
        
        String actorInfo = actorName.toString();
        System.out.println(actorInfo);
                
        Map direction = new Map();
      
       direction.setDirection("");
         
        String directioninfo = direction.toString();
         System.out.println();


        
        
   
         
         Supply supplyItem = new Supply();
         
         supplyItem.foodType("food");
      
        
         String foodType= supplyItem.toString();
         System.out.println(foodType);
          
        
    }
}
