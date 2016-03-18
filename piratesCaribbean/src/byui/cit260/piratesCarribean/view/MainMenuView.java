package byui.cit260.piratesCarribean.view;
import byui.cit260.piratesCaribbean.model.Player;
import byui.cit260.piratesCarribean.control.GameControl;
import java.util.Scanner;
import piratescaribbean.PiratesCaribbean;
/**
 *
 * @author Misty and Chino
 */
    public abstract class MainMenuView extends View {
        
        public MainMenuView() {
            super( "\n-----------------------------------------------"
                  + "\n| Main Menu                                   |"
                  + "\n-----------------------------------------------"
                  + "\nN - Start New Game"
                  + "\nG - Get and Start Saved Game"
                  + "\nH - Get Help and How to Play the Game"
                  + "\nS - Save Game"
                  + "\nQ - Quit"
                  + "\n-----------------------------------------------");
        }
        
    /**
     *
     * @param choice
     */
        public void doAction(char choice) {
         
            switch (choice) {
                case 'N':
                    this.startNewGame();
                    break;
                case 'G':
                    this.startExistingGame();
                    break;
                case 'H':
                    this.displayHelpMenu();
                    break;
                case 'S':
                    this.saveGame();
                    break;
                default:
                    System.out.println("\n*** Invalid selection *** Try again");
                    break;
            }
        }

    private void startNewGame() {
        
        GameControl.createNewGame(PiratesCaribbean.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayHelpMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void saveGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}   
