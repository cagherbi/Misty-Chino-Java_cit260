/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.byui.cit260.piratesCarribean.view;

import byui.cit260.piratesCaribbean.model.Player;
import byui.cit260.piratesCarribean.control.GameControl;

/**
 *
 * @author Misty
 */
public class MainMenuView extends View {
public MainMenuView(){ 
      super("\n"
                + "\n-----------------------------------------------"
                + "\n| Main Menu                                   |"
                + "\n-----------------------------------------------"
                + "\nN - Start New Game"
                + "\nG - Get and Start Saved Game"
                + "\nH - Get Help and How to Play the Game"
                + "\nS - Save Game"
                + "\nQ - Quit"
                + "\n-----------------------------------------------");
}
    public boolean doAction(String value) {

        value = value.toUpperCase();

        switch (value) {
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

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

    private void displayHelpMenu() {
        System.out.println("*** displayHelpMenu function called ***");
    }

    private void displayNextView(Player player) {
        System.out.println("\n================================="
                + "\n Welcome to the game " + player.getName()
                + "\n We hope you have a lot of fun!"
                + "\n================================"
        );

        MainMenuView mainMenuView = new MainMenuView();

        mainMenuView.display();

    }

    private void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
