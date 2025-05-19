package com.mycompany.rpg;

import java.util.Scanner;

import com.mycompany.rpg.gameClasses.Avatar;
import com.mycompany.rpg.gameClasses.Enemy;

public class Main {

    int heroConstant = 4;
    public static void main(String[] args) {

        // Create the CharacterAdmin object to manage all avatars
        CharacterAdmin avatarAdmin = new CharacterAdmin();

        CharacterAdmin enemyAdmin = new CharacterAdmin();

        Avatar enemy1 = new Enemy("Bob", "Enemy", 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 1);
        enemyAdmin.characterAdd(enemy1);

        for(int i = 0; i < 4; i++){

            EnumClass rpgClass = null;
            Scanner namescanner = new Scanner(System.in);
            System.out.println("Enter name of the " + (i + 1) + ". " + "hero");
            String heroName = namescanner.nextLine();

            Scanner classscanner = new Scanner(System.in);
            System.out.println("Enter class of the " + i + "hero 1 = Knight /n  2 = Mage /n 3 = Brawler /n 4 = Priest");
            int heroClass = classscanner.nextInt();
            
            switch(heroClass){
                case 1:
                    rpgClass = EnumClass.KNIGHT;
                    break;
                case 2:
                    rpgClass = EnumClass.MAGE;
                    break;
                case 3:
                    rpgClass = EnumClass.BRAWLER;
                     break;
                case 4:
                    rpgClass = EnumClass.PRIEST;
                    break;
                default:
                    System.out.println("Ungültige Klasse! Standardmäßig wird Knight gewählt.");
                    rpgClass = EnumClass.KNIGHT;
    
            }

            Avatar numberhero = rpgClass.create(heroName);
            avatarAdmin.characterAdd(numberhero);
            
        }
        // Display the stats of each character in the party
        avatarAdmin.showPartyMembers();

        CharacterAdmin backupListe = new CharacterAdmin();

        for (Avatar a : avatarAdmin.getAllAvatars()) {
            backupListe.characterAdd(a);
           
        }
        

        enemyAdmin.showPartyMembers();

        Battle.battleMember(avatarAdmin.getCharactersAsObjects(), enemyAdmin.getCharactersAsObjects());

        LvlUpManager.memberLevelUp(avatarAdmin.getCharactersAsObjects(), enemyAdmin.getCharactersAsObjects());
    }
}
