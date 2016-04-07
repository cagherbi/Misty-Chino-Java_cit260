package byui.cit260.piratesCarribean.view;
import byui.cit260.piratesCarribean.control.GameControl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import piratescaribbean.PiratesCaribbean;
/**
 *
 * @author Misty and Chino
 */
class AddCrewMemberView {
    
    private String message;
    
    protected final BufferedReader keyboard = PiratesCaribbean.getInFile();
    protected final PrintWriter console = PiratesCaribbean.getOutFile();
    
    public AddCrewMemberView() {
        
    }
    
    public String chooseCrew(String args[]) throws IOException {
        boolean valid = false;
        String selection = null;
        
        while (!valid) {
            
            selection = this.keyboard.readLine();
            selection = selection.trim();
            
            if (selection.length() < 1) {
                System.out.println("\n*** Invalid Selection *** Try Again");
                continue;
            }
            break;
        }
        return selection;
    }
        
    
        public void doAction (char choice){
            choice = Character.toUpperCase(choice);
            this.console.println("Now, select your crew. You need 3, plus yourself, in order to set sail.");
            String filepate = this.getInput();
            
            try {
                String filepath = null;
                GameControl.saveGame(PiratesCaribbean.getCurrentGame(), filepath);
            } catch (Exception ex) {
                ErrorView.display("View", ex.getMessage());
            }
                switch (choice) {
                    case 'J':
                        this.addJackSparrow();
                        break;
                    case 'H':
                        this.addHectorBarbossa();
                        break;
                    case 'D':
                        this.addDavyJones();
                        break;
                    case 'G':
                        this.addJoshuaGibbs();
                        break;
                    case 'W':
                        this.addWillTurner();
                        break;
                    case 'E':
                        this.addElizabethSwan();
                        break;
                    case 'T':
                        this.addTiaDalma();
                        break;
                    case 'B':
                        this.addBlackbeard();
                        break;
                    case 'A':
                        this.addAngelica();
                        break;
                    default: 
                        System.out.println("\n*** Invalid Selection - Try Again ***");
                }
        }
        private void addJackSparrow() {
            System.out.println("Jack Sparrow is on board.");
        }

        private void addHectorBarbossa() {
            System.out.println("Hector Barbossa is on board.");
        }

        private void addDavyJones() {
            System.out.println("Davy Jones is on board.");
        }

        private void addJoshuaGibbs() {
            System.out.println("Joshua Gibbs is on board.");
        }

        private void addWillTurner() {
            System.out.println("Will Turner is on board.");
        }

        private void addElizabethSwan() {
            System.out.println("Elizabeth Swan is on board.");
        }

        private void addTiaDalma() {
            System.out.println("Tia Dalma is on board.");
        }

        private void addBlackbeard() {
            System.out.println("Blackbeard is on board.");
        }

        private void addAngelica() {
            System.out.println("Angelica is on board.");
        }

    private String getInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    
    
}