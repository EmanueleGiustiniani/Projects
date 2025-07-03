package sudProject.entities.npcTypes.npcs;

import sudProject.map.MapFrame;
import sudProject.map.Room;
import sudProject.entities.Player;
import sudProject.entities.npcTypes.CanNotBeAttackedNpc;

public class MoonPriest extends CanNotBeAttackedNpc {


    // /--CONSTRUCTORS--/
    public MoonPriest(String npcName, Room npcPosition, int indexNpcPosition) {
        super(npcName, 0, 5, WISDOM_INDEX, 20,
                25, 25, 2, npcPosition, indexNpcPosition, 1, 400);
    }
    // /--METHODS--/
    public void levelUpPlayer(Player player){
        if(player.xpOverCap()){
            player.setXp(player.getXp()-player.getMaxXp());
            player.setPlayerLevel(player.getPlayerLevel() + 1);
            player.setMaxXp(player.getMaxXp()+ Player.STARTING_MAX_XP);
            player.setMaxHp(player.getMaxHp() + 5);
            player.setHp(player.getMaxHp());
            if(player.getPlayerLevel()%5==0){
                boolean loop = true;
                do{
                    //aumenta statistiche
                    MapFrame.setLog("Scegli la statistica da aumentare: (STRENGTH) (DEXTERITY) (CONSTITUTION) (INTELLIGENCE) (WISDOM) (CHARISMA)\n");
                    switch(console.readLine().toUpperCase()){
                        case "STRENGTH":
                            if(player.getStrength() != MAX_ATTRIBUTE_P_VALUE-1){
                                player.setStrength(player.getStrength()+1);
                                loop = false;
                            }
                            break;
                        case "DEXTERITY":
                            if(player.getDexterity() != MAX_ATTRIBUTE_P_VALUE-1){
                                player.setDexterity(player.getDexterity()+1);
                                loop = false;
                            }
                            break;
                        case "CONSTITUTION":
                            if(player.getConstitution() != MAX_ATTRIBUTE_P_VALUE-1){
                                player.setConstitution(player.getConstitution()+1);
                                loop = false;
                            }
                            break;
                        case "INTELLIGENCE":
                            if(player.getIntelligence() != MAX_ATTRIBUTE_P_VALUE-1){
                                player.setIntelligence(player.getIntelligence()+1);
                                loop = false;
                            }
                            break;
                        case "WISDOM":
                            if(player.getWisdom() != MAX_ATTRIBUTE_P_VALUE-1){
                                player.setWisdom(player.getWisdom()+1);
                                loop = false;
                            }
                            break;
                        case "CHARISMA":
                            if(player.getCharisma() != MAX_ATTRIBUTE_P_VALUE-1){
                                player.setCharisma(player.getCharisma()+1);
                                loop = false;
                            }
                            break;
                        default:
                            MapFrame.appendToLog("Nome statistica errato, riprova\n");
                            break;
                    }
                }while(loop);
            }
        }else{
            MapFrame.setLog("Non puoi ancora salire di livello\nPunti esperienza:   "+ player.getXp() + " / " + player.getMaxXp() +"\n");
        }
    }
}
