package com.mycompany.rpg.gameClasses;

public class Brawler extends Avatar {
    public Brawler(String name) {
        super(name, "Brawler", 150, 150, 60, 60, 70, 70, 100, 100, 5, 5, 20, 20, 0, 1);
    }
    @Override
    public void magicAttacks(Avatar target) {
        // Implement Brawler-specific magical attacks here
        // For example, you could leave it empty or give it a specific behavior

    
    }
}
