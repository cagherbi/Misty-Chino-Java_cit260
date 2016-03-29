/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesCarribean.view;

import java.io.PrintWriter;
import piratescaribbean.PiratesCaribbean;

/**
 *
 * @author Misty
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = PiratesCaribbean.getOutFile();
    private static final PrintWriter logFile = PiratesCaribbean.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                    "--------------------------------------------"
                    +"\n- Error - " + errorMessage
                    +"\n-----------------------------------------");
        
        logFile.println(className = " - " + errorMessage);
    }
}
