package sudProject.items.itemTypes.weapons;

import sudProject.items.itemTypes.Weapon;

import static sudProject.Entity.DEXTERITY_INDEX;

public class Dagger extends Weapon {
    private final static int ATTRIBUTE_SCALING = DEXTERITY_INDEX;
    private static String name ="Dagger";
    private static String description ="Un semplice pugnale";
    private static int dmg = 4;

    // /--CONSTRUCTORS--/
    public Dagger(int value, boolean dropped) {
        super(name, value, dropped, description, dmg, ATTRIBUTE_SCALING);
    }
}
