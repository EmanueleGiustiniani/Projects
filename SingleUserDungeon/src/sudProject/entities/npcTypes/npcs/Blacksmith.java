package sudProject.entities.npcTypes.npcs;

import sudProject.items.itemTypes.weapons.Dagger;
import sudProject.items.itemTypes.weapons.HolyMace;
import sudProject.items.itemTypes.weapons.Staff;
import sudProject.items.itemTypes.weapons.Sword;
import sudProject.map.Room;
import sudProject.entities.npcTypes.CanNotBeAttackedNpc;

public class Blacksmith extends CanNotBeAttackedNpc {

    // /--CONSTRUCTORS--/
    public Blacksmith(String npcName, Room npcPosition, int indexNpcPosition) {
        super(npcName, 5, 10, STRENGTH_INDEX, 13, 50,
                50, 10, npcPosition, indexNpcPosition, 5, 100);
        forge();
    }
    // /--METHODS--/
    private void forge(){
        if(!this.entityInventory.IsInventoryFull()){
            this.entityInventory.addItemToInventory(new Dagger(25,false));
            this.entityInventory.addItemToInventory(new Dagger(25,false));
            this.entityInventory.addItemToInventory(new HolyMace(50,false));
            this.entityInventory.addItemToInventory(new Sword(50,false));
            this.entityInventory.addItemToInventory(new Staff(50,false));
        }
    }
}
