/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piratescaribbean;

import byui.cit260.piratesCaribbean.model.Game;
import byui.cit260.piratesCaribbean.model.Location;
import byui.cit260.piratesCaribbean.model.OnTheSeaLevel;
import byui.cit260.piratesCaribbean.model.Player;
import byui.cit260.piratesCaribbean.model.PortRoyal;
import byui.cit260.piratesCaribbean.model.Ship;
import byui.cit260.piratesCaribbean.model.TreasureIslandLevel;
import byui.cit260.piratesCaribbean.model.Weapons;
import byui.cit260.piratesCarribean.view.StartProgramView ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Misty Darrington & Chino Agherbi
 */
public class PiratesCaribbean {

    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        PiratesCaribbean.logFile = logFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        PiratesCaribbean.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        PiratesCaribbean.inFile = inFile;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println( ".begin program" ) ;
        StartProgramView startProgramView = null ;
        try {

            PiratesCaribbean.inFile = new BufferedReader(new InputStreamReader(System.in));
            PiratesCaribbean.outFile = new PrintWriter(System.out, true);

            String filePath = "log.txt";
            PiratesCaribbean.logFile = new PrintWriter(filePath);

            startProgramView = new StartProgramView();
            //startProgramView.display();
            //return;

        } catch (Throwable e) {

            System.out.println("Exception: " + e.toString()
                    + "\nCause: " + e.getCause()
                    + "\nMessage: " + e.getMessage());

            e.printStackTrace();;
        } finally {
            try {
                if (PiratesCaribbean.inFile != null) {
                    PiratesCaribbean.inFile.close();
                }

                if (PiratesCaribbean.outFile != null) {
                    PiratesCaribbean.outFile.close();
                }

                if (PiratesCaribbean.logFile != null) {
                    PiratesCaribbean.logFile.close();
                }
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
            PiratesCaribbean.outFile.close();

        }
        Player playerOne = new Player();
        playerOne.setName("Johnny Depp");
        playerOne.setBestTime(7.00);

        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        Location treasureIsland = new Location();
        Location portRoyal = new Location();
        Location shipboard = new Location();

        treasureIsland.setLevelNameOne("Treasure Island");
        portRoyal.setLevelNameTwo("Port Royal");
        shipboard.setLevelNameThree("Shipboard");

        String setLevelNameOne = treasureIsland.toString();
        String setLevelNameTwo = portRoyal.toString();
        String setLevelNameThree = shipboard.toString();

        OnTheSeaLevel onTheSeaLevelInfo = new OnTheSeaLevel();

        onTheSeaLevelInfo.setDescription("");
        onTheSeaLevelInfo.setTravelTime(13);

        String setDescription = onTheSeaLevelInfo.toString();
        System.out.println(setDescription);

        Ship shipOne = new Ship( "Black Pearl" ) ;
 
        //shipOne.setShipName("Black Pearl");

        String shipName = shipOne.toString();
        System.out.println(shipName);

        TreasureIslandLevel tiDescription = new TreasureIslandLevel();
        TreasureIslandLevel tiTravelTime = new TreasureIslandLevel();
        TreasureIslandLevel tiNoOfItems = new TreasureIslandLevel();

        tiDescription.setIslandDescription("...");
        tiTravelTime.setTravelTime("...");
        tiNoOfItems.setNoOfItems(0);

        String setIslandDescription = tiDescription.toString();
        System.out.println();

        String setTravelTime = tiTravelTime.toString();
        System.out.println();

        String setNoOfItems = tiNoOfItems.toString();
        System.out.println();

        Weapons typeOne = new Weapons();

        typeOne.setWeaponType("Sword");

        String weaponTypeOne = typeOne.toString();
        System.out.println();

        PortRoyal onThePortRoyalLevelInfo = new PortRoyal();

        onThePortRoyalLevelInfo.setDescription("");
        onThePortRoyalLevelInfo.setTravelTime(1.2);

        String setdescription = onThePortRoyalLevelInfo.toString();
        System.out.println(setDescription);

        Game gameOne = new Game();

        gameOne.setName("...");
        gameOne.setBestTime(3.00);

        String gameInfo = gameOne.toString();
        System.out.println(playerInfo);

// Need game loop
        try {
            // create gameOne and start the program
            gameOne.display();
            startProgramView.displayStartProgramView() ;
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            gameOne.display();
        }
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

    private static String tiTravelTime(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void setCurrentGame(Game game) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Game getCurrentGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Player getPlayer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    public static BufferedReader getInFile() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
/*
private static class StartProgramView {

        public StartProgramView() {
        }

        private void display() {
            System.out.println("TODO: display game grid");
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

*/
} //-class PiratesCaribbean