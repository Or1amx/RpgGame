package com.mycompany.rpg.statusEffects;
import com.mycompany.rpg.gameClasses.Avatar;

//Eventuell muss die Struktur verändert werden durch Vererbung

//Angriff muss noch irgendwie verändert werden 

public class Burning {

    public void apply(Avatar target) {
        int duration = (int) (Math.random() * 5) + 1; // 1–5 Runden
        target.applyStatus("burning", duration);
    }

    
    public void burning(Avatar target){
        boolean burning = true;
        int randomNum = (int)(Math.random() * 5);

        int baseAttack = target.getAttack();
        double burningAttack = baseAttack * 0.80;

        int baseHealth = target.getHp();
        double burningHealth = baseHealth;
        
        target.applyStatus("burning", randomNum);

        while(burning == true){
            target.reduceStatusTimer("burning");
            burningHealth = burningHealth - baseHealth * 0.05;

            if(target.getStatusRounds("burning") <= 0){
                burning = false;
            }
        


        }

    }
}
