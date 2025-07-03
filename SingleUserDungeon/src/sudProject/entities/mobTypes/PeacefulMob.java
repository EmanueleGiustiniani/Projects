package sudProject.entities.mobTypes;

import sudProject.map.Room;
import sudProject.Entity;

public abstract class PeacefulMob extends Entity {
    // /--ATTRIBUTES--/
    public static int numberOfPeacefulMobs;
    // /--CONSTRUCTORS--/
    public PeacefulMob(String mobName, int hp, int hpMax, Room mobPosition, int indexMobPosition, int inventoryCap, int money, int xp) {
        super(mobName, 0, 1, -1, -1, hp, hpMax,0,
                mobPosition, indexMobPosition, true, inventoryCap, money, xp);
        numberOfPeacefulMobs++;
    }

    // /--METHODS--/
    @Override
    public void attack(Entity target) {
        if(target.isCanBeAttacked()){
            target.setHp(target.getHp() - this.getAtk() + this.getAtkBonusFromStat());
        }
    }


    // /--GETTER-&-SETTER--/
}
