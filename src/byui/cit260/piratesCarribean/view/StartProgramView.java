/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesCarribean.view;

import byui.cit260.piratesCaribbean.model.Player;
import byui.cit260.piratesCarribean.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author Misty and Chino
 */
public final class StartProgramView {
    
    private final String promptMessage;
    private Object mainMenuView;
        // promptMessage = "Please enter your name"
    public StartProgramView() {
        
        this.promptMessage = "\nPlease enter your name: ";
        // display the banner when the view is created
       this.displayBanner();
    }

   
    public void displayBanner() {
        
        System.out.println(
                "\n*****************************************************"
              + "\n*                                                   *"
              + "\n* Welcome Mateys! Yer adventure on the high seas    *"
              + "\n* begins here. You will sail throughout the         *"
              + "\n* Caribbean from island to island to retrieve the   *"
              + "\n* Black Pearl ship and find the buried treasure.    *"
              + "\n* You will choose yer crew and supplies and will    *"
              + "\n* navigate to a destination. During yer travels you *"
              + "\n* can choose where you want to sail with the help   *"
              + "\n* of a map to guide you. You will need to keep your *"
              + "\n* wits about you as you sail the high seas and make *"
              + "\n* decisions about where to go. When you and yer     *"
              + "\n* crew find the buried treasure you win the game.   *"
              + "\n*                                                   *"
              + "\n*****************************************************"
            ); 
            
               
    }

    public void displayStartProgramView() {
        
        boolean done = false; // set flag to not done
        do {
            // prompt for and get the players name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) // user wants to quit
                return ; //exit the game
            
            // do the requested action and display the next view
            done = this.doAction(playersName);
            
        } while (!done);
       
       System.out.println("\n*** displayStartProgram() function called ***");
    }

    public void startProgram() {
        
    }

    private String getPlayersName() {
        Scanner keyboard = new Scanner(System.in);
        String value = ""; 
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) {
                System.out.println("\nInvalid value; value can not be blank");
                continue;
            }
            
            break;
        }
        
        return value;
    }

    private boolean doAction(String playersName) {
        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
            + "The name must be greater than one character in length");
            return false;
        }
        
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) {
            System.out.println("\nError creating the player.");
            return false;
           
        }
     return true;
    }
}


    
    
