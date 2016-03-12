/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesCaribbean.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Misty
 */
public class Location implements Serializable {
    
    
    private double visited;
    private String levelNameOne;
    private String levelNameTwo;
    private String levelNameThree;
    private Scene scene;
    private ArrayList<Actor> actors;
  

    public Location() {
    }

       
    public double getVisited() {
        return visited;
    }

    public void setVisited(double visited) {
        this.visited = visited;
    }

    public String getLevelNameOne() {
        return levelNameOne;
    }

    public void setLevelNameOne(String levelName) {
        this.levelNameOne = levelName;
    }

    public String getLevelNameTwo() {
        return levelNameTwo;
    }

    public void setLevelNameTwo(String levelName) {
        this.levelNameTwo = levelName;
    }
    
    public String getLevelNameThree() {
        return levelNameThree;
    }

    public void setLevelNameThree(String levelName) {
        this.levelNameThree = levelName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.visited) ^ (Double.doubleToLongBits(this.visited) >>> 32));
        hash = 71 * hash + Objects.hashCode(this.levelNameOne);
        hash = 71 * hash + Objects.hashCode(this.levelNameTwo);
        hash = 71 * hash + Objects.hashCode(this.levelNameThree);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (Double.doubleToLongBits(this.visited) != Double.doubleToLongBits(other.visited)) {
            return false;
        }
        if (!Objects.equals(this.levelNameOne, other.levelNameOne)) {
            return false;
        }
        if (!Objects.equals(this.levelNameTwo, other.levelNameTwo)) {
            return false;
        }
        return Objects.equals(this.levelNameThree, other.levelNameThree);
    }

    
}

