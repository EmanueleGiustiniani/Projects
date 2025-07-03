package sudProject.entities.npcTypes;

import sudProject.entities.Npc;
import sudProject.map.Room;
import sudProject.Entity;

public class CanNotBeAttackedNpc extends Npc {

    // /--CONSTRUCTORS--/
    public CanNotBeAttackedNpc(String npcName, int minStatValue, int maxStatValue, int indexClassStat, int classStat, int hp,
                               int maxHp, int baseAtk, Room npcPosition, int indexNpcPosition, int inventoryCap, int money) {
        super(npcName, minStatValue, maxStatValue, indexClassStat, classStat, hp, maxHp,
                baseAtk, npcPosition, indexNpcPosition, false, inventoryCap, money, 0);
    }
    // /--METHODS--/
    @Override
    public void attack(Entity target) {
        if(target.isCanBeAttacked()){
            target.setHp(target.getHp() - this.getAtk() + this.getAtkBonusFromStat());
        }
    }
}
