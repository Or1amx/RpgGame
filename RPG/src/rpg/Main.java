package rpg;

public class Main {
    public static void main(String[] args) {
        CharacterAdmin characters = new CharacterAdmin();

        Character one = new Knight("Paulus", "Hero", 999, 999, 999, 999, 999, 999, 1000);
        Character two = new Character("Paulus", "Hero", 999, 999, 999, 999, 999, 999, 1000);
        Character three = new Character("Paulus", "Hero", 999, 999, 999, 999, 999, 999, 1000);
        Character four = new Character("Paulus", "Hero", 999, 999, 999, 999, 999, 999, 1000);


        characters.characterAdd(one);
        characters.characterAdd(two);
        characters.characterAdd(three);
        characters.characterAdd(four);


        characters.showPartyMembers();
    }
}