/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesCarribean.view;

import byui.cit260.piratesCaribbean.model.Player;
import byui.cit260.piratesCarribean.control.GameControl;
import byui.cit260.piratesCarribean.view.Interface.ViewInterface;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import piratescaribbean.PiratesCaribbean;

/**
 *
 * @author Misty and Chino
 */
public abstract class View implements ViewInterface {
    
    private void startSavedGame(){
        
        this.console.println("\n\nEnter the file pate for file where the game " + "is to be saved.");
        String filepath = this.getInput();
        
        try {
            GameControl.getSavedGame(filepath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
    
    protected String displayMessage;
    private String playersName;
    private final Player player;
    
    private String message;
    
    protected final BufferedReader keyboard = PiratesCaribbean.getInFile();
    protected final PrintWriter console = PiratesCaribbean.getOutFile();
    private Object e;
    
    public View(String message) {
        this.player = GameControl.createPlayer(playersName);
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        String value;
        boolean done = false;
        do {
            this.console.println(this.message);
            value = this.getInput();
            done = this.doAction(value);
        } while (!done);
    }
    
    @Override
    public String getInput() {
        
        boolean valid = false;
        String value = null;
        
        while (!valid) {
            
            System.out.println("\n" + this.displayMessage);
            
            try {
                value = keyboard.readLine();
            } catch (IOException ex) { 
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
            value = value.trim();
            try {
                
           
            if (value.length() < 1) {
                ErrorView.display(this.getClass().getName(),
                                  "You must enter a value: " + getMessage());
               return null;
            }
             }catch (Exception e) {
                     ErrorView.display(this.getClass().getName(),
                             "Error reading input: " + getMessage());
                            }
            break;
        }
        return value;
    }

    private String getMessage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
