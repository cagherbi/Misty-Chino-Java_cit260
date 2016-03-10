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
public class Supply implements Serializable {
    private double foodType;
    private double drinkType;
    private double toolType;

    public Supply() {
    }

    public double getFoodType() {
        return foodType;
    }

    public void setFoodType(double foodType) {
        this.foodType = foodType;
    }

    public double getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(double drinkType) {
        this.drinkType = drinkType;
    }

    public double getToolType() {
        return toolType;
    }

    public void setToolType(double toolType) {
        this.toolType = toolType;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.foodType) ^ (Double.doubleToLongBits(this.foodType) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.drinkType) ^ (Double.doubleToLongBits(this.drinkType) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.toolType) ^ (Double.doubleToLongBits(this.toolType) >>> 32));
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
        final Supply other = (Supply) obj;
        if (Double.doubleToLongBits(this.foodType) != Double.doubleToLongBits(other.foodType)) {
            return false;
        }
        if (Double.doubleToLongBits(this.drinkType) != Double.doubleToLongBits(other.drinkType)) {
            return false;
        }
        return Double.doubleToLongBits(this.toolType) == Double.doubleToLongBits(other.toolType);
    }

    @Override
    public String toString() {
        return "Supply{" + "foodType=" + foodType + ", drinkType=" + drinkType + ", toolType=" + toolType + '}';
    }

    public void foodType(String food) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
