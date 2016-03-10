/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesCaribbean.model;

import java.io.Serializable;

/**
 *
 * @author Chino Agherbi
 */
public class PortRoyal implements Serializable{
    private double travelTime;

    public PortRoyal() {
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
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
        final PortRoyal other = (PortRoyal) obj;
        return Double.doubleToLongBits(this.travelTime) == Double.doubleToLongBits(other.travelTime);
    }

    @Override
    public String toString() {
        return "PortRoyal{" + "travelTime=" + travelTime + '}';
    }

    public void setString(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
