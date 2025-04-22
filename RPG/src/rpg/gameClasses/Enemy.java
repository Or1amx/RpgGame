package rpg.classes;

public class Enemy extends Character {
    public Enemy(String name, String rpgclass, int hp, int mana, int defense, int attack, int luck, int speed, int exp){
        super(name, rpgclass, hp, mana, defense, attack, luck, speed, exp);
    }

    @Override
    public void magiattacks() {}
}