package rpg;
import rpg.classes.Character;

import java.util.ArrayList;

public class CharacterAdmin {
    private ArrayList<Character> characters;

    public CharacterAdmin() {
        characters = new ArrayList<>();
    }

    public void characterAdd(Character character) {
        characters.add(character);
    }

    public void showPartyMembers() {
        for (Character character : characters) {
            character.showStats();
        }
    }
}  