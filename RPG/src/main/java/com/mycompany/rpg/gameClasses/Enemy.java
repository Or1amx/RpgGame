package com.mycompany.rpg.gameClasses;

public class Enemy extends Avatar {
    public Enemy(String name, String rpgclass, int hp, int baseHp, int mana, int baseMana, int defense, int baseDefense, int attack, int baseAttack, int luck, int baseLuck, int speed, int baseSpeed, int exp, int lvl) {
        super(name, rpgclass, hp, baseHp, mana, baseMana, defense, baseDefense, attack, baseAttack, luck, baseLuck, speed, baseSpeed, exp, lvl);
    }

    @Override
    public void magicAttacks(Avatar target) {
        // Implement Brawler-specific magical attacks here
        // For example, you could leave it empty or give it a specific behavior
    }
}
