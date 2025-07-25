package sudProject.map;

import sudProject.Entity;
import sudProject.itemManagement.Inventory;

import java.util.ArrayList;

public class Room{
    // /--ATTRIBUTES--/
    private String roomName;
    private String roomDescription;

    private Room northRoom;
    private Room southRoom;
    private Room eastRoom;
    private Room westRoom;
    private String mapOutput;

    public static final int PLAYER_INDEX = -1;
    public static final int CAT_INDEX = 0;
    public static final int GUARD_INDEX = 1;
    public static final int CULTIST_INDEX = 2;
    public static final int CORPSE_INDEX = 3;
    public static final int ROOM_MAIN_NPC_INDEX = 4;
    public static final int UNDEAD_CAT_INDEX = 5;
    public static final int BOSS_INDEX = 6;

    private int maxGuardsInRoom;

    private Inventory roomObjects = new Inventory(100);

    private ArrayList<ArrayList> roomEntities = new ArrayList<>();

    // /--CONSTRUCTORS--/
    public Room(String roomName, int maxGuardsInRoom){
        this.roomName = roomName;
        addEntityType(7);
        this.maxGuardsInRoom = maxGuardsInRoom;
    }
    // /--METHODS--/
    public void setRooms(Room northRoom, Room southRoom, Room eastRoom, Room westRoom){
        this.northRoom = northRoom;
        this.southRoom = southRoom;
        this.eastRoom = eastRoom;
        this.westRoom = westRoom;
        mapOutput = MapOutput.getRoomOutput(northRoom, southRoom, eastRoom, westRoom);
    }


    private void addEntityType(int numOfGameEntities){
        for(int i=0; i<numOfGameEntities; i++){
            roomEntities.add(new ArrayList<Entity>());
        }
    }

    public String getEntitiesText(){
        StringBuilder sb = new StringBuilder();
        sb.append("Entità del luogo:\n");

        for(int i = 0; i < roomEntities.size(); i++){
            if(i == CORPSE_INDEX) continue;

            ArrayList<Entity> entitiesList = roomEntities.get(i);
            if(!entitiesList.isEmpty()){
                for(Entity e : entitiesList){
                    sb.append(e.getName()).append(" ");
                }
                sb.append("\n");
            }
        }

        sb.append(getCorpsesText());  // usa il metodo che restituisce i cadaveri

        return sb.toString();
    }

    public String getCorpsesText(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nCadaveri:\n");
        ArrayList<Entity> array = roomEntities.get(CORPSE_INDEX);
        if(!array.isEmpty()){
            for(Entity e : array){
                sb.append(e.getName()).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public int getCorpseIndex(String corpseName){
        ArrayList<Entity> array = roomEntities.get(CORPSE_INDEX);
        int index = -1;
        for(int i=0; i< array.size(); i++){
            Entity e = array.get(i);
            if(e.getName().trim().toUpperCase().equals(corpseName)){
                index = i;
                break;
            }
        }
        return index;
    }
    public void printMapOutput() {
        System.out.println(mapOutput);
    }
    public boolean isWayOut(){
        return northRoom != null || southRoom != null || eastRoom != null || westRoom != null;
    }

    // /--GETTER-&-SETTER--/


    public String getRoomName() {
        return roomName;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public Room getNorthRoom() {
        return northRoom;
    }

    public Room getSouthRoom() {
        return southRoom;
    }

    public Room getEastRoom() {
        return eastRoom;
    }

    public Room getWestRoom() {
        return westRoom;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public ArrayList<ArrayList> getRoomEntities() {
        return roomEntities;
    }

    public int getMaxGuardsInRoom() {
        return maxGuardsInRoom;
    }
    public Inventory getRoomObjects(){
        return roomObjects;
    }

    public String getMapOutput() {
        return mapOutput;
    }
}
