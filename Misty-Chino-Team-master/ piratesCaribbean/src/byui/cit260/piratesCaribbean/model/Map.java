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
 * @author chino agherbi
 */
public class Map implements Serializable{
    
    // class instance variable
    private String startingPointe;
    private double direction;
    
    public Map() {
    }
    
    

    public String getStartingPoint() {
        return startingPointe;
    }

    public void setStartingPoint(String startingPoint) {
        this.startingPointe = startingPoint;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.startingPointe);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.direction) ^ (Double.doubleToLongBits(this.direction) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "startingPoint=" + startingPointe + ", direction=" + direction + '}';
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
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.direction) != Double.doubleToLongBits(other.direction)) {
            return false;
        }
        return Objects.equals(this.startingPointe, other.startingPointe);
    }

    public void setDirection(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    
    
}
