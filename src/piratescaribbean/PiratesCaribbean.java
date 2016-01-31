/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piratescaribbean;

import byui.cit260.piratesCaribbean.model.Location;
import byui.cit260.piratesCaribbean.model.OnTheSeaLevel;
import byui.cit260.piratesCaribbean.model.Player;
import byui.cit260.piratesCaribbean.model.Ship;
import byui.cit260.piratesCaribbean.model.TreasureIslandLevel;
import byui.cit260.piratesCaribbean.model.Weapons;

/**
 *
 * @author Misty Darrington & Chino Agherbi 
 */
public class PiratesCaribbean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
            playerOne.setName("Johnny Depp");
            playerOne.setBestTime();
        
                String playerInfo = playerOne.toString();
                System.out.println(playerInfo);
    
        Location locationOne = new Location();
        Location locationTwo = new Location();
        Location locationThree = new Location();
        
            locationOne.setName("Treasure Island");
            locationTwo.setName("Port Royal");
            locationThree.setName("Shipboard");
                    
                String locationInfo = locationOne.toString();
                System.out.println("");
                
        OnTheSeaLevel onTheSeaLevel = new OnTheSeaLevel();
                
            onTheSeaLevel.description("");
            onTheSeaLevel.travelTime("");
            
                String descriptionSea = description.toString();
                System.out.println();
                
        Ship blackPearl = new Ship();
        
            blackPearl.totalTime("");
            blackPearl.levelCompleted("");
            
                String totalTime = ("");
                System.out.println("");
        
                String levelCompleted = ("");
                System.out.println("");
                
        TreasureIslandLevel treasureIslandLevel = new TreasureIslandLevel();
        
            treasureIslandLevel.description("");
            treasureIslandLevel.travelTime("");
            treasureIslandLevel.noOfItems("");
            
                String descriptionIsland = description.toString();
                System.out.println();
                
                String time = travelTime("");
                System.out.println();
                
                String collectedItems = noOfItems("");
                System.out.println();
                
        Weapons weapons = new Weapons();
        
            weapons.weaponType("");
            weapons.weaponDescription("");
            
                String weaponType = weaponType("");
                System.out.println();
                
                String weaponDescription = weaponDescription ("");
                System.out.println();
            
                
            
        
                    
        
    }

    private static void levelCompleted(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static String travelTime(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static String noOfItems(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static String weaponDescription(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static String weaponType(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
