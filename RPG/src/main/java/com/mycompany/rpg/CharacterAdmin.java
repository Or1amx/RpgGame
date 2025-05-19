package com.mycompany.rpg;

import java.util.ArrayList;  // Correctly import Avatar class
import java.util.List;

import com.mycompany.rpg.gameClasses.Avatar;

public class CharacterAdmin {
    private ArrayList<Avatar> characters;  // Use Avatar as the type

    public CharacterAdmin() {
        characters = new ArrayList<>();
    }

    public ArrayList<Object> getCharactersAsObjects() {
        return new ArrayList<>(characters);  // Java automatically treats each Avatar as Object
    }
    

    public void characterAdd(Avatar avatar) {  // Add Avatar instances
        characters.add(avatar);
    }

    public List<Avatar> getAllAvatars() {
        return characters;
    }

    public void showPartyMembers() {
        for (Avatar avatar : characters) {  // Iterate through the list of Avatars
            avatar.showStats();  // Show stats for each avatar
        }
    }
}

