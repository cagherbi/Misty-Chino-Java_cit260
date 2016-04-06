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
        @Override
        public boolean doAction(String value) {
            
            value = value.toUpperCase();
            char choice = value.charAt(0);
            
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
                case 'Q':
                    return true;
                default:
                    ErrorView.display("MainMenuView", "***Invalid selection *** Try again");
                    break;
            } return false;
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
        
        this.console.println("\nEnter the file path for file where the game " + "is to be saved.");
        String filePath = this.getInput();
        
        try {
            GameControl.saveGame(PiratesCaribbean.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
  
}   
