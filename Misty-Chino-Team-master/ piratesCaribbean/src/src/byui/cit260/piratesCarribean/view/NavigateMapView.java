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
public class NavigateMapView {
    
    private String promptMessage;
    
    public NavigateMapView() {
        
        this.promptMessage = "\nTime to set sail.";
        this.displayDirections();
        
    }

    public void displayDirections() {
        System.out.println(
                "\nUsing the arrow keys, you can go north, south, east and west.");
        
    }
    
    
}
