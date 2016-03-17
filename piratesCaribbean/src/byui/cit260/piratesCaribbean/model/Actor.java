package byui.cit260.piratesCaribbean.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Chino and Misty
 */

public enum Actor implements Serializable {
    
    Jack Sparrow("Captain of the Black Pearl and legendary pirate of the Seven Seas."),
    Hector Barbosa("Once a ferocious pirate and deadly enemy of Captain Jack Sparrow."),
    Davy Jones("Condemned for eternity to captain the Flying Dutchman."),
    Joshua Gibbs("A superstitious deckhand with muted impatience for authority."),
    Will Turner("Sails the seas to save his father, find his true identity and reunite with his true love Elizabeth Swan."),
    Elizabeth Swan("With an adventurous spirit, she has long been fascinated with the world of buccaneers."),
    Tia Dalma("A mysterious woman who wields the power of voodoo-like magic."),
    Blackbeard("The blackest soul and the darkest heart of any pirate who ever lived."),
    Angelica("Angelica is a dangerous pirate to match swords with.");
    
    private final String description;

    Actor(String description) {
        this.description = description;
        
    }

    public String getDescription() {
        return description;
    }

}
    

