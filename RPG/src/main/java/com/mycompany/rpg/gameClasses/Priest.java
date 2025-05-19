package com.mycompany.rpg.gameClasses;

public class Priest extends Avatar {
    public Priest(String name) {
        super(name, "Priest", 100, 100, 1000, 1000, 50, 50, 80, 80, 25, 35, 30, 30, 0, 1);
    }
    @Override
    public void magicAttacks(Avatar target) {
        // Implement Brawler-specific magical attacks here
        // For example, you could leave it empty or give it a specific behavior
}

@Override
public void levelUp() {
setLvl(getLvl() + 1); // Use setter

// Adjust base stats with Mage-appropriate growth
this.baseHp += 10;
setHp(this.baseHp); // Update current HP to new base

this.baseMana += 20;
setMana(this.baseMana); // Update current Mana to new base

this.baseAttack += 5;
this.attack = this.baseAttack;

this.baseDefense += 5;
this.defense = this.baseDefense;

this.baseSpeed += 7;
this.speed = this.baseSpeed;

this.baseLuck += 3;
this.luck = this.baseLuck;

System.out.println(getName() + " the Mage has reached level " + getLvl() + "!");
}
}
