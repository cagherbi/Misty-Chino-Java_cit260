/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesCarribean.control;

import byui.cit260.piratesCaribbean.model.Game;
import byui.cit260.piratesCaribbean.model.Player;
import byui.cit260.piratesCaribbean.model.Ship;
import byui.cit260.piratesCaribbean.model.Supply;
import java.util.Map;
import piratescaribbean.PiratesCaribbean;

/**
 *
 * @ chino 
 */
public class GameControl {

    public static void createNewGame(Player player) {
        
        Game game = new Game();
        PiratesCaribbean.setCurrentGame(game);
        
        game.setPlayer(player);
        
        SupplyItem[] supplyItem = GameControl.createSupplyItem();
        game.setSupply();
        
        Ship ship = new Ship();
        game.setShip(ship);
        
        Map map = Map.createMap();
        game.setMap(map);
        
    }

    public static void createNewGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void showGameInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static SupplyItem[] createSupplyList() {
        
        SupplyItem[] supply = 
                new SupplyItem[3];
        
        SupplyItem food = new SupplyItem();
        food.setDescription("Food");
        food.setQuantityInStock(0);
        food.setRequiredAmount(0);
        supply[Supply.food.ordinal()] = food;
        
        SupplyItem water = new SupplyItem();
        water.setDescription("Water");
        water.setQuantityInStock(0);
        water.setRequiredAmount(0);
        supply[Supply.water.ordinal()] = water;
        
        SupplyItem tools = new SupplyItem();
        tools.setDescription("Tools");
        tools.setQuantityInStock(0);
        tools.setRequiredAmount(0);
        supply[Supply.tools.ordinal()] = tools;
        
        return supply;
    }

    private static SupplyItem[] createSupplyItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private double calcBestTime;
    private double getPlayer;

    @Override
    public String toString() {
        return "GameControl{" + "calcBestTime=" + calcBestTime + ", getPlayer=" + getPlayer + '}';
    }
    
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
