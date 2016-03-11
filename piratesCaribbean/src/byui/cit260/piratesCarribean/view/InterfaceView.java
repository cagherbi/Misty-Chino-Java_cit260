/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesCarribean.view;

/**
 *
 * @author Misty - Chino
 */
public class InterfaceView {
    
    public interface ViewInterface
    {
        public void display();
        public String getInput();
        public boolean doAction(String value);
    }
    public abstract class View implements ViewInterface {
        protected String displayMessage;
        public View(){
            
        }
        public View(String message){
            this.displayMessage = message;
        }
        
               
        @Override
        public void display(){
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
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean doAction(String value) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    
    }
    
}
