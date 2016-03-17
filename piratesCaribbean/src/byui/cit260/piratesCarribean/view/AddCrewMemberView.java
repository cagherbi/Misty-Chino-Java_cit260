package byui.cit260.piratesCarribean.view;
import java.util.Scanner;
/**
 *
 * @author Misty and Chino
 */
class AddCrewMemberView {
    public void chooseCrew(String args[]) {
        Scanner input= new Scanner(System.in);
        System.out.println("Now, select your crew. You need 3, plus yourself, in order to set sail.");
    }
        public void doAction (char choice){
            choice = Character.toUpperCase(choice);
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
                        this.addBlackbeard();
                        break;
                    case 'A':
                        this.addAngelica();
                        break;
                    default: 
                        System.out.println("\n*** Invalid Selection - Try Again ***");
                }
        }
        private void addJackSparrow() {
            System.out.println("Jack Sparrow is on board.");
        }

        private void addHectorBarbossa() {
            System.out.println("Hector Barbossa is on board.");
        }

        private void addDavyJones() {
            System.out.println("Davy Jones is on board.");
        }

        private void addJoshuaGibbs() {
            System.out.println("Joshua Gibbs is on board.");
        }

        private void addWillTurner() {
            System.out.println("Will Turner is on board.");
        }

        private void addElizabethSwan() {
            System.out.println("Elizabeth Swan is on board.");
        }

        private void addTiaDalma() {
            System.out.println("Tia Dalma is on board.");
        }

        private void addBlackbeard() {
            System.out.println("Blackbeard is on board.");
        }

        private void addAngelica() {
            System.out.println("Angelica is on board.");
        }
}