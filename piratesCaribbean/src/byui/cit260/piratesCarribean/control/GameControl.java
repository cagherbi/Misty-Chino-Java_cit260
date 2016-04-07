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
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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

    public static void saveGame(Game game, String filepath)
            throws GameControlException {
        try( FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game);
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }
    private static SupplyItem[] createSupplyItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Player createPlayer(String playersName) {
        Player player = new Player() ;
        player.setName( playersName ) ;
        return player ;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void showGameInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void getSavedGame(String filepath) throws Exception {
        Exception GameControlException = null;
        {
        Game game = null;
        
        try( FileInputStream fips = new FileInputStream(filepath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject();
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
        PiratesCaribbean.setCurrentGame(game);
    }
    }

    double calcBestTime(double levelCompleted, double totalTime) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class GameControlException extends Exception {

        public GameControlException() {
        }

        private GameControlException(String message) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

}
