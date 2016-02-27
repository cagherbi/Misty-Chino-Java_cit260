package byui.cit260.piratesCarribean.view;
import java.util.Scanner;
/**
 *
 * @author Misty
 */
class AddCrewMemberView {
    public void chooseCrew(String args[]) {
        System.out.println("Select your crew. You need a you plus 3 more in order to set sail.");
    }
        public void doAction (char choice){
     
            choice = Character.toUpperCase(choice);
            
            Scanner input= new Scanner(System.in);

                switch (choice) {
                    case 'J':
                        this.addJackSparrow();
                        break;
                    case 'H':
                        this.addHectorBarbossa();
                        break;
                    case 'D':
                        this.addDavyJones();
                        break;
                    case 'G':
                        this.addJoshuaGibbs();
                        break;
                    case 'W':
                        this.addWillTurner();
                        break;
                    case 'E':
                        this.addElizabethSwan();
                        break;
                    case 'T':
                        this.addTiaDalma();
                        break;
                    case 'B':
                        this.addBlackbead();
                        break;
                    case 'A':
                        this.addAngelica();
                        break;
                    default: 
                        System.out.println("\n*** Invalid Selection - Try Again ***");
                }
        }

        private void addJackSparrow() {
            System.out.println("Jack Sparrow added to crew");
        }

        private void addHectorBarbossa() {
            System.out.println("Hector Barbossa added to crew");
        }

        private void addDavyJones() {
            System.out.println("Davy Jones added to crew");
        }

        private void addJoshuaGibbs() {
            System.out.println("Joshua Gibbs added to crew");
        }

        private void addWillTurner() {
            System.out.println("Will Turner added to crew");
        }

        private void addElizabethSwan() {
            System.out.println("Elizabeth Swan added to crew");
        }

        private void addTiaDalma() {
            System.out.println("Tia Dalma added to crew");
        }

        private void addBlackbead() {
            System.out.println("Blackbeard added to crew");
        }

        private void addAngelica() {
            System.out.println("Angelica added to crew");
        }
             
    }