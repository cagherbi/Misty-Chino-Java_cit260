/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesCarribean.view;

/**
 *
 * @author Misty
 */
public class GameMenuView {
    
    public void doAction(char selection) {
        
        switch (selection) {
            case 'V': // Travel to new location
                this.displayMap();
                break;
            case 'I': // View list of items in inventory
                this.viewInventory();
                 break;
            case 'A': // View list of actors
                this.viewActors();
                break;
            case 'S': // View ship's status
                this.viewShipStatus();
                break;
        }
    }

    public void displayMap() {
        System.out.println("*** displayMap stub function called ***");
    }

    private void viewInventory() {
        System.out.println("*** viewInventory stub function called ***");
    }

    private void viewActors() {
        System.out.println("*** viewActors stub function called ***");
    }

    private void viewShipStatus() {
        System.out.println("*** viewShipStatus stub function called ***");
    }

    void displayMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}