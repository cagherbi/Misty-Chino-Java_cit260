/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesCarribean.view;

import byui.cit260.piratesCaribbean.model.Game;
import byui.cit260.piratesCarribean.control.GameControl;
import java.io.InputStream;

/**
 *
 * @author chino 
 */
public class HelpMenuView {

    private String menu;
    Object HelpMenuView;
    private Scanner New;

    public HelpMenuView() {
        this.menu = "\n"
                + "\n-----------------------------------------------"
                + "\n| Help Menu                                   |"
                + "\n-----------------------------------------------"
                + "\nD - Show Game Description"
                + "\nA - Show Actor Description"
                + "\nN - How to use the Naviagation"
                + "\nL - Island Location"
                + "\nQ - Quit"
                + "\n-----------------------------------------------";
    }

    public void displayHelpMenuView() {

        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) {
                return;
            }
            done = this.doAction(menuOption);

        } while (!done);
    }
  public String getInput(){ 

    Scanner keyboard = New Scanner(System.in);
    boolean valid = false;
    String  value = null;

    while (!valid){
        System.out.println("\n"+ this.displayMessage);

        value = keyboard.nextLine();
        value = value.trim();
        
        if (value.lengh() < 1) {
             System.out.println("\n*** You must enter a value ***");
             continue;
        }
        break;
    }
    return value;
    }

    private String getMenuOption() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Scanner(InputStream in) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class Scanner {

        public Scanner() {
        }
    }
    }

    public boolean doAction(String value) {

        choice = choice.toUpperCase();

        switch (choice) {
            case "D":
                this.ShowGameDesciption();
                break;
            case "A":
                this.ShowActorDescription();
                break;
            case "N":
                this.ShowNaviagation();
                break;
            case "L":
                this.IslandLocation();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void ShowGameDescription() {
        GameControl.showGameInfo();
    }

    private void ShowActorDescription() {
        System.out.println("*** show actor desciption function called ***");
    }

    private void ShowNaviagation() {
        System.out.println("*** Show Naviagation called ***");
    }

    private void IslandLocation() {
        System.out.println("*** Islands Location function called ***");
    }

    private void displayHelpMenuView(Game game) {
        System.out.println("\n================================="
                + "\n Welcome to the  " + game.getName()
                + "\n We hope you have a lot of fun!"
                + "\n================================"
        );

        HelpMenuView helpMenuView = new HelpMenuView();

        helpMenuView.displayHelpMenuView();

    }

    private void ShowGameDesciption() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getMenuOption() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
