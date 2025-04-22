package rpg.classes;

public abstract class Avatar{
    private String name;
    private String rpgclass;
    private int hp;
    private int mana;
    private int defense;
    private int attack;
    private int luck;
    private int speed;
    private int exp;

    public Avatar(String name, String rpgclass, int hp, int mana, int defense, int attack, int luck, int speed, int exp){
        this.name = name;
        this.rpgclass = rpgclass;
        this.hp = hp;
        this.mana = mana;
        this.defense = defense;
        this.attack = attack;
        this.luck = luck;
        this.speed = speed;
        this.exp = exp;

    }

        public String getName() {
            return name;
    }

        public String getRpgclass() {
            return rpgclass;
    }

        public String getHp() {
            return name;
    }

        public int getMana() {
            return mana;
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

// Angriffe werden geblockt, jedoch 1 Zug weg        
        public void blockAttack() {}
    
    public abstract void magiattacks();
    
}