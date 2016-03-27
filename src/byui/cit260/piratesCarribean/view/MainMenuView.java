                                 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesCarribean.view;

import byui.cit260.piratesCaribbean.model.Game;
import byui.cit260.piratesCaribbean.model.Player;
import byui.cit260.piratesCarribean.control.GameControl;
import byui.cit260.piratesCarribean.exceptions.GameControlException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import static javax.management.Query.value;
import piratescaribbean.PiratesCaribbean;

/**
 *
 * @author Misty
 */
public class MainMenuView {
    
    private String menu;
    Object mainMenuView;
    private String value;
    private Object console;
    
    public MainMenuView() {
        this.menu = "\n"
                + "\n-----------------------------------------------"
                + "\n| Main Menu                                   |"
                + "\n-----------------------------------------------"
                + "\nN - Start New Game"
                + "\nG - Get and Start Saved Game"
                + "\nH - Get Help and How to Play the Game"
                + "\nS - Save Game"
                + "\nQ - Quit"
                + "\n-----------------------------------------------";
    }
    
    public void displayMainMenuView() {
        
        boolean done = false; 
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            done = this.doAction(menuOption);
            
        }while (!done);
    }
    
    private String getMenuOption() {
        System.out.println("\n*** getMenuOption() function called ***");
        return "N";
        
    }

 

    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "N":
                this.startNewGame();
                break;
            case "G":
                this.startExistingGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
                
                
        }
        return false;
    }
    
    private void startNewGame() {
        GameControl.createNewGame();
    }
    
    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }
    
                           
    
    
        
private void displayNextView(Player player){
        System.out.println("\n================================="
                          + "\n Welcome to the game " + player.getName()
                          + "\n We hope you have a lot of fun!"
                          + "\n================================"
                           );

        MainMenuView mainMenuView = new MainMenuView();
        
        mainMenuView.displayMainMenuView();

    }

    private String getInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void saveGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayHelpMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}