/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesCarribean.exceptions;

/**
 *
 * @author Misty
 */
public class UnsupportedOperationException extends Exception {

    public UnsupportedOperationException() {
    }

    public UnsupportedOperationException(String string) {
        super(string);
    }

    public UnsupportedOperationException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public UnsupportedOperationException(Throwable thrwbl) {
        super(thrwbl);
    }

    public UnsupportedOperationException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
