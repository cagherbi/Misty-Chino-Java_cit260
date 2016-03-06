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
public class MapIslands  implements Serializable {
    
    private double headed;
    private String directionNorth;
    private String directionSouth;
    private String directionEast;
    private String directionWest;

    public MapIslands() {
    }

    public double getHeaded() {
        return headed;
    }

    public void setHeaded(double headed) {
        this.headed = headed;
    }

    public String getDirectionNorth() {
        return directionNorth;
    }

    public void setDirectionNorth(String directionNorth) {
        this.directionNorth = directionNorth;
    }

    public String getDirectionSouth() {
        return directionSouth;
    }

    public void setDirectionSouth(String directionSouth) {
        this.directionSouth = directionSouth;
    }

    public String getDirectionEast() {
        return directionEast;
    }

    public void setDirectionEast(String directionEast) {
        this.directionEast = directionEast;
    }

    public String getDirectionWest() {
        return directionWest;
    }

    public void setDirectionWest(String directionWest) {
        this.directionWest = directionWest;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.headed) ^ (Double.doubleToLongBits(this.headed) >>> 32));
        hash = 79 * hash + Objects.hashCode(this.directionNorth);
        hash = 79 * hash + Objects.hashCode(this.directionSouth);
        hash = 79 * hash + Objects.hashCode(this.directionEast);
        hash = 79 * hash + Objects.hashCode(this.directionWest);
        return hash;
    }

    @Override
    public String toString() {
        return "MapIslands{" + "headed=" + headed + ", directionNorth=" + directionNorth + ", directionSouth=" + directionSouth + ", directionEast=" + directionEast + ", directionWest=" + directionWest + '}';
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
        final MapIslands other = (MapIslands) obj;
        if (Double.doubleToLongBits(this.headed) != Double.doubleToLongBits(other.headed)) {
            return false;
        }
        if (!Objects.equals(this.directionNorth, other.directionNorth)) {
            return false;
        }
        if (!Objects.equals(this.directionSouth, other.directionSouth)) {
            return false;
        }
        if (!Objects.equals(this.directionEast, other.directionEast)) {
            return false;
        }
        if (!Objects.equals(this.directionWest, other.directionWest)) {
            return false;
        }
        return true;
    }

    public void setMapIsalands(String string) {
         
    }

    
}
    
    
    

