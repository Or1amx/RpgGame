package com.mycompany.rpg.gameClasses;
import java.util.HashMap;
import java.util.Map;

public abstract class Avatar{
    protected  String name;
    protected String rpgclass;
    protected int hp;
    protected int baseHp;
    protected int mana; 
    protected int baseMana;
    protected int defense;
    protected int baseDefense;
    protected int attack;
    protected int baseAttack;
    protected int luck;
    protected int baseLuck;
    protected int speed;
    protected int baseSpeed;
    protected int exp;
    protected int lvl;

    public Avatar(String name, String rpgclass, int hp, int baseHp, int mana, int baseMana, int defense, int baseDefense, int attack, int baseAttack, int luck, int baseluck, int speed, int baseSpeed, int exp, int lvl){
        this.name = name;
        this.rpgclass = rpgclass;
        this.hp = hp;
        this.baseHp = baseHp;
        this.mana = mana;
        this.baseMana = baseMana;
        this.defense = defense;
        this.baseDefense = baseDefense;
        this.attack = attack;
        this.baseAttack = baseAttack;
        this.luck = luck;
        this.baseLuck = baseLuck;
        this.speed = speed;
        this.baseSpeed = baseSpeed;
        this.exp = exp;
        this.lvl = lvl;

    }

    //Kann wahrscheinlich weg// 
    public Avatar(Avatar original) {
        this.hp = original.hp;
        this.mana = original.mana;
        this.defense = original.defense;
        this.attack = original.attack;
        this.luck = original.luck;
        this.speed = original.speed;
    }

        public String getName() {
            return name;
    }

        public String getRpgclass() {
            return rpgclass;
    }

        public int getHp() {
            return hp;
    }

        public void setHp(int hp) {
        this.hp = Math.max(0, hp);  // Optional: prevent negative HP
    }
    

        public int getMana() {
            return mana;
    }

    public void setMana(int mana) {
        this.mana = Math.max(0, mana);  // Optional: prevent negative HP
    }

        public int getDefense() {
            return defense;
        }

        public int getAttack() {
            return attack;
        }

        public int getLuck() {
            return luck;
        }

        public int getSpeed() {
            return speed;
        }

        public int getExp() {
            return exp;
        }

        public void setExp(int exp) {
            this.exp = Math.max(0, exp);
        }

        public int getLvl() {
            return lvl;
        }

        public void setLvl(int lvl) {
            this.lvl = Math.max(0, lvl);
        }

        public void showStats() {
        System.out.println(
            "Name: " + name + System.lineSeparator() +
            "Klasse: " + rpgclass + System.lineSeparator() +
            "HP: " + hp + System.lineSeparator() +
            "Mana: " + mana + System.lineSeparator() +
            "Verteidigung: " + defense + System.lineSeparator() +
            "Angriff: " + attack + System.lineSeparator() +
            "Glück: " + luck + System.lineSeparator() +
            "Geschwindigkeit: " + speed + System.lineSeparator() +
            "Erfahrung: " + exp + System.lineSeparator());
    
        }

/*Bei attack müssen wahrscheinlich Gegner als Eingabe eingeben werden bzw. 
man braucht ein Eingabewert 
Auch muss der damage noch berechnet werden*/

        public int attackdamage() {
         int attackdamage = getAttack();
         return attackdamage; 
             }

        public void attack(Avatar target) {
            int attack = attackdamage();
            int newHp = target.getHp() - attack;
            target.setHp(newHp);
        }
        
        

// Angriffe werden geblockt, jedoch 1 Zug weg        
        public void blockAttack() {}
    
        public abstract void magicAttacks(Avatar target);

        public boolean isAlive() {
            return getHp() > 0;
        }

        public void scanEnemy(){
            showStats();
        }
        
//Wichtig für StatusEffects.java
        private Map<String, Integer> statusEffects = new HashMap<>();

        public void applyStatus(String status, int rounds) {
            statusEffects.put(status, rounds);
        }
        
        public int getStatusRounds(String status) {
            return statusEffects.getOrDefault(status, 0);
        }

        public void reduceStatusTimer(String status){
            statusEffects.put(status, getStatusRounds(status) - 1);
        if (getStatusRounds(status) <= 0) {
            statusEffects.remove(status);
            System.out.println(name + " is no longer affected by " + status + ".");
        }
        }

        public void removeStatus(String status) {
            statusEffects.remove(status);
            System.out.println(name + " is no longer affected by " + status + ".");
        }
        
        public boolean hasStatus(String status) {
            return statusEffects.containsKey(status) && getStatusRounds(status) > 0;
        }
        public abstract void levelUp();
}


