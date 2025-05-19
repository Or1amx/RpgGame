package com.mycompany.rpg.gameClasses;

import java.util.Scanner;

public class Mage extends Avatar {
    public Mage(String name) {
        super(name, "Mage", 80, 80, 100, 100, 25, 25, 70, 70, 25, 25, 25, 25, 0, 1);
    }

    
    
    @Override

    
    public void magicAttacks(Avatar target) {
        // Define multiple magic attack options
        System.out.println(getName() + " is preparing a magic attack!");

        // Example magic attacks
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a magic attack:");
        System.out.println("1. Fireball (10 Mana)");
        System.out.println("2. Ice Blast (15 Mana)");
        System.out.println("3. Heal (costs Mana)");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1: // Fireball
                if (getMana() >= 10) {
                    target.setHp(target.getHp() - 20);  // Deal 20 damage
                    System.out.println(getName() + " casts Fireball! Deals 20 damage.");
                    // Deduct mana
                    setMana(getMana() - 10);
                } else {
                    System.out.println("Not enough mana!");
                }
                break;

            case 2: // Ice Blast
                if (getMana() >= 15) {
                    target.setHp(target.getHp() - 15);  // Deal 15 damage
                    System.out.println(getName() + " casts Ice Blast! Deals 15 damage.");
                    setMana(getMana() - 15);
                } else {
                    System.out.println("Not enough mana!");
                }
                break;

            case 3: // Heal
                if (getMana() >= 10) {
                    setHp(getHp() + 10);  // Heal 10 HP
                    System.out.println(getName() + " casts Heal! Restores 10 HP.");
                    setMana(getMana() - 10);
                } else {
                    System.out.println("Not enough mana!");
                }
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }

        
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


