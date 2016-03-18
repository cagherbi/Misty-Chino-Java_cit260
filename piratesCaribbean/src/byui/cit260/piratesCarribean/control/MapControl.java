/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesCarribean.control;

import byui.cit260.piratesCaribbean.model.Game;
import byui.cit260.piratesCaribbean.model.Location;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javafx.scene.Scene;
import piratescaribbean.PiratesCaribbean;

/**
 *
 * @author Misty and Chino
 */
public class MapControl {

    private static Scene[] map;

    public static enum SceneType {
        start,
        portRoyal,
        treasureIsland,
        tortuga,
        cave,
        beach,
        pub,
        sea,
        shipboard,
        rowBoat,
        finish, 
        North,
        East,
        South,
        West;
        
    }
    
}
