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
 * @author Chino
 */
public class Supply implements Serializable {
    
    
    private String foodType;
    private String drinkType;
    private String weaponType;
    private String toolType;
    private double supplyKit;
    private double timeTraveled;
    private double crewBoarded;

    public Supply() {
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public String getToolType() {
        return toolType;
    }

    public void setToolType(String toolType) {
        this.toolType = toolType;
    }

    public double getSupplyKit() {
        return supplyKit;
    }

    public void setSupplyKit(double supplyKit) {
        this.supplyKit = supplyKit;
    }

    public double getTimeTraveled() {
        return timeTraveled;
    }

    public void setTimeTraveled(double timeTraveled) {
        this.timeTraveled = timeTraveled;
    }

    public double getCrewBoarded() {
        return crewBoarded;
    }

    public void setCrewBoarded(double crewBoarded) {
        this.crewBoarded = crewBoarded;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.foodType);
        hash = 71 * hash + Objects.hashCode(this.drinkType);
        hash = 71 * hash + Objects.hashCode(this.weaponType);
        hash = 71 * hash + Objects.hashCode(this.toolType);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.supplyKit) ^ (Double.doubleToLongBits(this.supplyKit) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.timeTraveled) ^ (Double.doubleToLongBits(this.timeTraveled) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.crewBoarded) ^ (Double.doubleToLongBits(this.crewBoarded) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Supply{" + "foodType=" + foodType + ", drinkType=" + drinkType + ", weaponType=" + weaponType + ", toolType=" + toolType + ", supplyKit=" + supplyKit + ", timeTraveled=" + timeTraveled + ", crewBoarded=" + crewBoarded + '}';
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
        final Supply other = (Supply) obj;
        if (Double.doubleToLongBits(this.supplyKit) != Double.doubleToLongBits(other.supplyKit)) {
            return false;
        }
        if (Double.doubleToLongBits(this.timeTraveled) != Double.doubleToLongBits(other.timeTraveled)) {
            return false;
        }
        if (Double.doubleToLongBits(this.crewBoarded) != Double.doubleToLongBits(other.crewBoarded)) {
            return false;
        }
        if (!Objects.equals(this.foodType, other.foodType)) {
            return false;
        }
        if (!Objects.equals(this.drinkType, other.drinkType)) {
            return false;
        }
        if (!Objects.equals(this.weaponType, other.weaponType)) {
            return false;
        }
        if (!Objects.equals(this.toolType, other.toolType)) {
            return false;
        }
        return true;
    }

    
  
    
    
    
    
}
