package byui.cit260.piratesCarribean.view;

import byui.cit260.piratesCaribbean.model.Game;
import javafx.scene.Parent;
import javafx.scene.Scene;
import piratescaribbean.PiratesCaribbean;
/**
 *
 * @author Misty and Chino
 */
public class SceneView {

    public static Scene createScenes() {
        Game game = PiratesCaribbean.getCurrentGame();
        
        Scene[] scenes = new Scene[SceneOne.values().length];
            
        SceneOne startingScene = new SceneOne();
        startingScene.setDescription(
                "\nWanting to be a pirate, eh? You'll see it's not all fun "
                + "and games. There's work to be done. Start with loadin' "
                + "the ship with supplies and crew. You can sail a ship by "
                + "yerself and there isn't a pub at sea to cook yer supper.");
        startingSceneOne.setMapSymbol(" ST ");
        startingSceneOne.setBlocked(false);
        startingSceneOne.setTravelTime();
        scenes[SceneOne.start.ordinal()] = startingScene;
        
        Scene finishScene = new SceneTwo();
        finishScene.setDescription(
                    "\nCongratulations me hardy! Ye made it back in one piece. "
                    + "Ye even found yerself some treasure. I'd like to relieve "
                    + "of the burden of that fine treasure, but a pirate lives by "
                    + "a code. Consider yerself fortunate indeed.");
        finishSceneTwo.setMapSymbol(" FN ");
        finishSceneTwo.setBlocked(false);
        finishSceneTwo.setTravelTime(Double.POSITIVE_INFINITY);
        scenes[SceneTwo.finish.ordinal()] = finishScene;
        
        
        return finishScene;
    }

     private static class SceneOne {

        private static Object values() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public SceneOne() {
        }

        private void setDescription(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static class start {

            private static int ordinal() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            public start() {
            }
        }
    }

    private static class startingSceneOne {

        private static void setMapSymbol(String _st_) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static void setBlocked(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static void setTravelTime() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public startingSceneOne() {
        }
    }

    private static class SceneTwo extends Scene {

        public SceneTwo(Parent root) {
            super(root);
        }

        private SceneTwo() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

            private static class finish {

            public finish() {
            }
        }
    }

    private static class finishSceneTwo {

        private static void setMapSymbol(String _fn_) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static void setBlocked(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static void setTravelTime(double POSITIVE_INFINITY) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public finishSceneTwo() {
        }
    }
        
    
}

