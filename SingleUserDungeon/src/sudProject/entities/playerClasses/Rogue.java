package sudProject.entities.playerClasses;

import sudProject.entities.Player;

public class Rogue extends Player {
    // /--ATTRIBUTES--/

    // /--CONSTRUCTORS--/
    public Rogue(String firstName, String lastName, String email, String password, String playerName) {
        super(firstName, lastName, email, password, playerName, DEXTERITY_INDEX, dice.nextInt(CLASS_STARTING_P_VALUE, MAX_ATTRIBUTE_P_VALUE));
    }
}