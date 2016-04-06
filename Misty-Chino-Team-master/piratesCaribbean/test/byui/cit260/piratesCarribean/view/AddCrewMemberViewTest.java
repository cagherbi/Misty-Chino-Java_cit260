/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesCarribean.view;

import java.io.IOException;


/**
 *
 * @author Misty
 */
public class AddCrewMemberViewTest {
    
    public AddCrewMemberViewTest() {
    }

    /**
     * Test of chooseCrew method, of class AddCrewMemberView.
     */
    
    public void testChooseCrew() throws IOException {
        System.out.println("chooseCrew");
        String[] args = null;
        AddCrewMemberView instance = new AddCrewMemberView();
        instance.chooseCrew(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doAction method, of class AddCrewMemberView.
     */
    
    public void testDoAction() {
        System.out.println("doAction");
        char choice = ' ';
        AddCrewMemberView instance = new AddCrewMemberView();
        instance.doAction(choice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    private void fail(String the_test_case_is_a_prototype) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
