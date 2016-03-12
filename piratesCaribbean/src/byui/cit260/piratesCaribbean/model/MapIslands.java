package byui.cit260.piratesCaribbean.model;


import java.io.Serializable;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chino
 */
public enum MapIslands implements Serializable {
    
    North,
    East,
    South,
    West;

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[SceneType.North.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.East.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.South.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.West.ordinal()]);
    }
}
    
    
    

