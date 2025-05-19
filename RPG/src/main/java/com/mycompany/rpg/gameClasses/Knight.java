package com.mycompany.rpg.gameClasses;

public class Knight extends Avatar {
    public Knight(String name) {
        super(name, "Knight", 100, 100, 50, 50, 50, 50, 50, 50, 25, 25, 40, 40, 0, 1);
    }
    @Override
    public void magicAttacks(Avatar target) {
        // Implement Brawler-specific magical attacks here
        // For example, you could leave it empty or give it a specific behavior
}
}

