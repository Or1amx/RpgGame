package com.mycompany.rpg.statusEffects;
import com.mycompany.rpg.gameClasses.Avatar;


public class Frozen {

    public void apply(Avatar target) {
        int duration = (int) (Math.random() * 3) + 1; // 1–5 Runden
        target.applyStatus("frozen", duration);
        System.out.println(target.getName() + " is now frozen for " + duration + " rounds!");
    }

    // Optional: eine Methode zur Burn-Wirkung, die du in jeder Runde aufrufst
    public void applyEffect(Avatar target) {
        if (target.hasStatus("frozen")) {
            int damage = (int)(target.getHp() * 0.05); // 5 % Schaden
            target.setHp(target.getHp() - damage);
            System.out.println(target.getName() + " suffers " + damage + " freeze damage!");
            target.reduceStatusTimer("frozen");
        }
    }
}

    
    