/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesCarribean.control;

import byui.cit260.piratesCaribbean.model.Game;
import byui.cit260.piratesCaribbean.model.Player;
import static java.time.Clock.system;
import static org.omg.IOP.ENCODING_CDR_ENCAPS.value;

/**
 *
 * @ chino 
 */
public class GameControl {

    public static Player createPlayer(String playersName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void createNewGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void showGameInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void saveGame(Game currentGame, String filePath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private double calcBestTime;
    private double getPlayer;
    public double number;

    @Override
    public String toString() {
        return "GameControl{" + "calcBestTime=" + calcBestTime + ", getPlayer=" + getPlayer + '}';
    }
    
     public double calcBestTime (double levelCompleted, double totalTime, double number){
     
     if (levelCompleted > 2){
        return -1;
     }              
     if (levelCompleted < 0 && totalTime > 1){
         return -1; 
         
     }
     double bestTime = levelCompleted / totalTime;
        return number;
     }

       
}
