package com.mycompany.rpg;

import java.util.List;

import com.mycompany.rpg.gameClasses.Avatar; 
import com.mycompany.rpg.gameClasses.Enemy; 

public class LvlUpManager {
    public static void memberLevelUp(List<Object> hero, List<Object> enemies){

        Boolean heroesAlive = false;

        for (int i = 0; i < hero.size(); i++) {
            Object obj = hero.get(i);
            Avatar avatar = (Avatar) obj; 
            int hp = avatar.getHp();      

            if(hp <= 0) {
                heroesAlive = false;
            }
            else{
                heroesAlive = true;
                break;
            }
        }

        int gettingExp = 0;
        if (heroesAlive) {
        for (int j = 0; j < enemies.size(); j++) {
            Object obj1 = enemies.get(j);
            if (obj1 instanceof Enemy) {
            Enemy enemy = (Enemy) obj1;
            int exp = enemy.getExp();
            gettingExp += exp;
                }
            }

    heroesAlive = false;
        }

        for (int i = 0; i < hero.size(); i++) {
            Object obj = hero.get(i);
            Avatar avatar = (Avatar) obj; 
            int exp = avatar.getExp();
            exp += gettingExp; 
            avatar.setExp(exp);
            int lvl = avatar.getLvl();    
            int lvlbefore = lvl;
            lvl = exp / 50;
            if(lvl > lvlbefore){
                System.out.println("Congratulation" + avatar.getName() + "has a level up :)");
                avatar.levelUp();
                
            }

        } 



        

        

    }
}
    

