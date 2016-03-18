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
 * @ chino and Misty
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
                
    }

    private static SupplyItem[] createSupplyItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Player createPlayer(String playersName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void showGameInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

