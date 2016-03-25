
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
import java.io.PrintWriter;
import java.util.Scanner;
import piratescaribbean.PiratesCaribbean;

/**
*
* @author Misty and Chino
*/
public abstract class View implements ViewInterface {
   
   private String displayMessage;
   
   protected final BufferedReader keyboard = PiratesCaribbean.getInFile();
   protected final PrintWriter console = PiratesCaribbean.getOutFile();
   
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
           this.console.println( this.displayMessage);
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
           
           value = keyboard.readLine();
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
