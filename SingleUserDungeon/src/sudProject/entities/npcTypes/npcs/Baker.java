package sudProject.entities.npcTypes.npcs;

import sudProject.items.itemTypes.foods.Bread;
import sudProject.map.Room;
import sudProject.entities.npcTypes.CanNotBeAttackedNpc;

public class Baker extends CanNotBeAttackedNpc {

    // /--CONSTRUCTORS--/
    public Baker(String npcName, Room npcPosition, int indexNpcPosition) {
        super(npcName, 1, 4, DEXTERITY_INDEX, 8,
                10, 10, 2, npcPosition, indexNpcPosition, 1, 20);
        doBread();
    }

    // /--METHODS--/
    private void doBread(){
        if(!this.entityInventory.IsInventoryFull()){
            this.entityInventory.addItemToInventory(new Bread(10,false));
        }
    }
}
