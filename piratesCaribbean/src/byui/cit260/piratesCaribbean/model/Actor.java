package byui.cit260.piratesCaribbean.model;

import java.io.Serializable;

/**
 *
 * @author Chino and Misty
 */

public enum Actor implements Serializable {
    
    JackSparrow("Captain of the Black Pearl and legendary pirate of the Seven Seas."),
    HectorBarbosa("Once a ferocious pirate and deadly enemy of Captain Jack Sparrow."),
    DavyJones("Condemned for eternity to captain the Flying Dutchman."),
    JoshuaGibbs("A superstitious deckhand with muted impatience for authority."),
    WillTurner("Sails the seas to save his father, find his true identity and reunite with his true love Elizabeth Swan."),
    ElizabethSwan("With an adventurous spirit, she has long been fascinated with the world of buccaneers."),
    TiaDalma("A mysterious woman who wields the power of voodoo-like magic."),
    Blackbeard("The blackest soul and the darkest heart of any pirate who ever lived."),
    Angelica("Angelica is a dangerous pirate to match swords with.");
    
    private final String description;

    Actor(String description) {
        this.description = description;
        
    }

    public String getDescription() {
        return description;
    }

    public void setName(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setDescription(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
    

