/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesCarribean.exceptions;

/**
 *
 * @author chino
 */
public class SupplyMenuException extends Exception  {

    public SupplyMenuException() {
    }

    public SupplyMenuException(String message) {
        super(message);
    }

    public SupplyMenuException(String message, Throwable cause) {
        super(message, cause);
    }

    public SupplyMenuException(Throwable cause) {
        super(cause);
    }

    public SupplyMenuException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
