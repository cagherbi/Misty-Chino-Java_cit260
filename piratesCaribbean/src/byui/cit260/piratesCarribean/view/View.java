/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesCarribean.view;

import byui.cit260.piratesCaribbean.model.Player;
import byui.cit260.piratesCarribean.control.GameControl;
import byui.cit260.piratesCarribean.view.Interface.ViewInterface;
import java.util.Scanner;

/**
 *
 * @author Misty
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    private String playersName;
    private final Player player;
    
    public View(String message) {
        this.player = GameControl.createPlayer(playersName);
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        boolean done = false;
        do {
            String value = this.getInput();
            if (value.toUpperCase().equals("Q"))
                return;
            done = this.doAction(value);
        } while (!done);
    }
    
    @Override
    public String getInput() {
        
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String value = null;
        
        while (!valid) {
            
            System.out.println("\n" + this.displayMessage);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) {
                System.out.println("\n*** You Must Enter a Value ***");
                continue;
            }
            break;
        }
        return value;
    }
}
