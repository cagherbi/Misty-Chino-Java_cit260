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
public class Navigation implements Serializable{
    
    private String navigationType;
    private String description;

    public Navigation() {
    }

    public String getNavigationType() {
        return navigationType;
    }

    public void setNavigationType(String navigationType) {
        this.navigationType = navigationType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.navigationType);
        hash = 37 * hash + Objects.hashCode(this.description);
        return hash;
    }

    @Override
    public String toString() {
        return "Navigation{" + "navigationType=" + navigationType + ", description=" + description + '}';
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
        final Navigation other = (Navigation) obj;
        if (!Objects.equals(this.navigationType, other.navigationType)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
}
