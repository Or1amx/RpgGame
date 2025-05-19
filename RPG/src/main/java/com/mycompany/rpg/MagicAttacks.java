package com.mycompany.rpg;
import java.util.Random;

import com.mycompany.rpg.gameClasses.Avatar;
import com.mycompany.rpg.statusEffects.Burning;


public class MagicAttacks {

    public static boolean getRandomBoolean(double trueChancePercent) {
        Random rand = new Random();
        return rand.nextDouble() < (trueChancePercent / 100.0);
    }

    //später entfernen
    public static void main(String[] args) {
        boolean result = getRandomBoolean(70);  // 70% chance of being true
        System.out.println("Random result: " + result);
    }

    public static void fireball(Avatar caster, Avatar target) {
        if (caster.getMana() >= 10) {
            // Schaden und Manakosten zuerst
            target.setHp(target.getHp() - 20);
            caster.setMana(caster.getMana() - 10);
    
            System.out.println(caster.getName() + " casts Fireball! Deals 20 damage.");
    
            // 50% Chance auf Brennen
            if (Math.random() < 0.5) {
                Burning burnEffect = new Burning();
                burnEffect.apply(target);
            }
    
        } else {
            System.out.println("Not enough mana!");
        }
    }
    
}
