package sudProject.entities.playerClasses;

import sudProject.entities.Player;

public class Paladin extends Player {
    // /--ATTRIBUTES--/


    // /--CONSTRUCTORS--/
    public Paladin(String firstName, String lastName, String email, String password, String playerName) {
        super(firstName, lastName, email, password, playerName, STRENGTH_INDEX, dice.nextInt(CLASS_STARTING_P_VALUE, MAX_ATTRIBUTE_P_VALUE));
    }
}
