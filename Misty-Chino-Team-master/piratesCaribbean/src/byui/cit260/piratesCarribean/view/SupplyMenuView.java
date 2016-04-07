 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesCarribean.view;

/**
 *
 * @author Chino
 */
public class SupplyMenuView {

    public void supplyMenuview() {

        boolean done = false;
        do {
            // prompt to select the supply name
            String supplyOption = this.getSupplyOption();
            if (supplyOption.toUpperCase().equalsIgnoreCase(supplyOption))// user wants to quit
            //do the requsted action and display next option
            {
                done = this.doAction(supplyOption);
            }
        } while (!done);
    }

    private String getSupplyOption() {
        System.out.println("\n*** getSupplyOption() function called*** ");
        return "S";
    }

    private boolean doAction() {
        System.out.println("\n*** gdoAction() function called*** ");
        return true;

    }

    public boolean doAction(String supply) {
        String choice = supply.toUpperCase();
        switch (supply) {
            case "W":// seclect a weapon
                this.selectWapeon();
                break;
            case "F":// select food 
                this.selectFood();
                break;
            case "D"://select drinks
                this.selectDrinks();
                break;
            case "T": //select tools
                this.selectTools();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Tray again");
                break;
        }
        return true;
    }

    private void selectWapeon() {
        System.out.println("\n***  selectWapeon function *** ");
    }

    private void selectFood() {
        System.out.println("\n***  selectFood function *** ");
    }

    private void selectDrinks() {
        System.out.println("\n***  selectDrinks function *** ");
    }

    private void selectTools() {
        System.out.println("\n***  selectTools function *** ");
    }

    private static class boolen {

        public boolen() {
        }
    }

    private static class supplyOption {

        public supplyOption() {
        }
    }
}
