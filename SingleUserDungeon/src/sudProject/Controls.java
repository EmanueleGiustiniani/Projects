package sudProject;

public enum Controls {
    MOVE("MOVE"),
    ATTACK("ATTACK"),
    ESCAPE("ESCAPE"),
    LEVEL_UP("LEVELUP"),
    PICK_FROM_CORPSE("PICKFROMCORPSE"),
    INVENTORY("INVENTORY"),
    PICK_UP("PICKUP"),
    BUY("BUY"),
    UNEQUIP("UNEQUIP"),
    QUIT("QUIT"),
    REST("REST");

    private final String value;

    Controls(String value){
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}

