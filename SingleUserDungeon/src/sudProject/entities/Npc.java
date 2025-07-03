package sudProject.entities;

import sudProject.map.Room;
import sudProject.Entity;

public abstract class Npc extends Entity {
    // /--ATTRIBUTES--/
    public static int numberOfNpcs;

    // /--CONSTRUCTORS--/
    public Npc(String npcName, int minStatValue, int maxStatValue, int indexClassStat, int classStat, int hp, int maxHp, int baseAtk,
               Room npcPosition, int indexNpcPosition, boolean canBeAttacked, int inventoryCap, int money, int xp) {
        super(npcName, minStatValue, maxStatValue, indexClassStat, classStat, hp, maxHp,
                baseAtk, npcPosition, indexNpcPosition, canBeAttacked, inventoryCap, money, xp);
        numberOfNpcs++;
    }

    // /--METHODS--/
    @Override
    public void attack(Entity target) {
        if(target.isCanBeAttacked()){
            target.setHp(target.getHp() - this.getAtk() + this.getAtkBonusFromStat());
        }
    }
}
