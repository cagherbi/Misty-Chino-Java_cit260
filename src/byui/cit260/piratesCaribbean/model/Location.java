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
    private String levelName;

    public Location() {
    }

       
    public double getVisited() {
        return visited;
    }

    public void setVisited(double visited) {
        this.visited = visited;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.visited) ^ (Double.doubleToLongBits(this.visited) >>> 32));
        hash = 97 * hash + Objects.hashCode(this.levelName);
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
        if (!Objects.equals(this.levelName, other.levelName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "visited=" + visited + ", levelName=" + levelName + '}';
    }

    void setName(String treasure_Island) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
