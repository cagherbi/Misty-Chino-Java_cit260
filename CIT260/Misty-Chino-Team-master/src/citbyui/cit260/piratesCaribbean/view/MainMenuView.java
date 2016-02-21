/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesCaribbean.view;

import byui.cit260.piratesCaribbean.model.Player;
import byui.cit260.piratesCarribean.control.GameControl;
import piratescaribbean.PiratesCaribbean;

/**
 *
 * @author Misty
 */
public class MainMenuView {
    
    private String menu;
    Object mainMenuView;
    
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
                this.startNewGame();
                break;
            case "H":
                this.startNewGame();
                break;
            case "S":
                this.startNewGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
    
    private void startNewGame() {
        GameControl.createNewGame(PiratesCaribbean.getPlayer());
    }
    
    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }
    
    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }
    
    private void displayHelpMenu() {
        System.out.println("*** displayHelpMenu function called ***");
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
}