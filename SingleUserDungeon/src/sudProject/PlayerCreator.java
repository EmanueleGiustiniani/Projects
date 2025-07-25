package sudProject;

import sudProject.entities.Player;
import sudProject.entities.playerClasses.*;

import java.io.Console;
import java.util.Arrays;

public class PlayerCreator {
    public Console console = System.console();

    // /--METHODS--/
    public Player createNewPlayer(){
        System.out.println("CREAZIONE GIOCATORE:");
        System.out.println("INSERISCI FIRSTNAME:");
        String firstname = console.readLine();
        System.out.println("INSERISCI LASTNAME:");
        String lastname = console.readLine();
        System.out.println("INSERISCI EMAIL:");
        String email = console.readLine();
        System.out.println("INSERISCI PASSWORD:");
        String password = console.readLine();
        System.out.println("INSERISCI PLAYER NAME:");
        String playerName = console.readLine();
        boolean state = false;
        String className;
        do {
            System.out.println("SCEGLI LA CLASSE DEL TUO PERSONAGGIO:");
            System.out.println(Arrays.toString(Classes.values()));
            className = console.readLine().toUpperCase();
            for(Classes c : Classes.values()){
                if(className.equals(c.getString())){
                    state = true;
                    break;
                }
            }
        }while(!state);
        Player player = switch (Classes.valueOf(className)) {
            case PALADIN -> new Paladin(firstname, lastname, email, password, playerName);
            case PRIEST -> new Priest(firstname, lastname, email, password, playerName);
            case ROGUE -> new Rogue(firstname, lastname, email, password, playerName);
            case WIZARD -> new Wizard(firstname, lastname, email, password, playerName);
        };
        return player;
    }
}
