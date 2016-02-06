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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.foodType);
        hash = 73 * hash + Objects.hashCode(this.drinkType);
        hash = 73 * hash + Objects.hashCode(this.weaponType);
        hash = 73 * hash + Objects.hashCode(this.toolType);
        return hash;
    }

    @Override
    public String toString() {
        return "Supply{" + "foodType=" + foodType + ", drinkType=" + drinkType + ", weaponType=" + weaponType + ", toolType=" + toolType + '}';
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
