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
public class TreasureIslandLevel  implements Serializable{
    
    private String description;
    private String travelTime;
    private double noOfItems;

    public TreasureIslandLevel() {
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(String travelTime) {
        this.travelTime = travelTime;
    }

    public double getNoOfItems() {
        return noOfItems;
    }

    public void setNoOfItems(double noOfItems) {
        this.noOfItems = noOfItems;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.description);
        hash = 43 * hash + Objects.hashCode(this.travelTime);
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.noOfItems) ^ (Double.doubleToLongBits(this.noOfItems) >>> 32));
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
        final TreasureIslandLevel other = (TreasureIslandLevel) obj;
        if (Double.doubleToLongBits(this.noOfItems) != Double.doubleToLongBits(other.noOfItems)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.travelTime, other.travelTime)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TreasureIslandLevel{" + "description=" + description + ", travelTime=" + travelTime + ", noOfItems=" + noOfItems + '}';
    }

    void description(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void travelTime(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void noOfItems(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
    
    
}
