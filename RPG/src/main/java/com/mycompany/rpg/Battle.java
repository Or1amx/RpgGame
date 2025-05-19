package com.mycompany.rpg;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.mycompany.rpg.gameClasses.Avatar;
import com.mycompany.rpg.gameClasses.Enemy;

public class Battle {
    private static int roundCounter = 0;

    public static int getRoundCounter() {
        return roundCounter;
    }

        public static void battleMember(List<Object> hero, List<Object> enemies) {
            boolean gameOver = false;
            

            List<Avatar> allAvatars = new ArrayList<>();

            for (Object entity : hero) {
                if (entity instanceof Avatar) {
                    allAvatars.add((Avatar) entity);
                }
            }

            for (Object entity : enemies) {
                if (entity instanceof Avatar) {
                    allAvatars.add((Avatar) entity);
                }
            }
            //Eventuell in Schleife wegen Geschwindigkeit senken
            allAvatars.sort(Comparator.comparingInt(Avatar::getSpeed).reversed());

            /* Hier while Schleife, wenn die Liste keinen Helden oder Gegner mehr enthält */

            while (gameOver == false) {
                
            /* Zähler verbessern, da alle Gegner doppelt gezählt werden */
                int numberOfHeroes = 0;
                int numberOfEnemies = 0;
                for (int j = 0; j < allAvatars.size(); j++) {
                    Avatar current = allAvatars.get(j);
                    if (current instanceof Enemy){
                        numberOfEnemies++;
                    }
                    else {
                        numberOfHeroes++;
                    }
                }

                for (int i = 0; i < allAvatars.size(); i++) {
                    Avatar current = allAvatars.get(i);
                    if (!current.isAlive()) {
                        if(current instanceof Enemy){
                            numberOfEnemies--;
                            continue;
                        }
                        else {
                            numberOfHeroes--;
                            continue;
                        }
                        
                    }
            
                    if (current instanceof Enemy) {
                        //Methode was der Gegner macht KI 



                        
                    } else {

                        Enemy selectedEnemy = Battle.selectEnemy(current, enemies);

                    if(selectedEnemy != null) {
                        //Methode was der Held machen kann (Angreifen, Magie, Blocken, Status)
                        Scanner Command = new Scanner(System.in);
                        System.out.println("What should " + current.getName() + "do?");
                        System.out.println("1. Attack /n 2. Magic /n 3. Block /n 4. Scan");
                        int attackScanner = Command.nextInt();  // Read user input
                        

                        //Attack und magicAttack müssen angepasst werden 
                        switch(attackScanner){
                            case 1:
                                current.attack(selectedEnemy);
                                break;
                            case 2:
                                current.magicAttacks(selectedEnemy);
                                break;
                            case 3:
                                current.blockAttack();
                                break;
                            case 4: 
                                current.scanEnemy();
                        }
                    }
                    
                }

                /* Eventuell noch Ausgabe bei Sieg oder nicht Sieg */
                if (numberOfEnemies == 0) {
                    gameOver = true;
                    LvlUpManager.memberLevelUp(hero, enemies);
                }
                
                else if (numberOfHeroes == 0) {
                    gameOver = true;

                }
                else {
                    gameOver = false;
                    roundCounter++;
                    numberOfEnemies = 0;
                    numberOfHeroes = 0;
                }


                }        
              }

              }

              // Lässt dich Gegner auswählen 
              public static Enemy selectEnemy(Avatar hero, List<Object> enemies) {
                System.out.println("Choose an enemy");
                List<Enemy> aliveEnemy = new ArrayList<>();
            
                for (int i = 0; i < enemies.size(); i++) {
                    Object current = enemies.get(i); // Hole das Objekt der Liste
                    
                    // Wenn das Objekt ein Enemy ist, casten und behandeln
                    if (current instanceof Enemy) {
                        Enemy enemy = (Enemy) current; // Cast zu Enemy
                        if (enemy.isAlive()) {
                            aliveEnemy.add(enemy);
                            System.out.println((i + 1) + ". " + enemy.getName());
                        }
                    }
                    // Eventuell überarbeiten für KI
                    else if (current instanceof Avatar) {
                        Avatar avatar = (Avatar) current; 
                        System.out.println((i + 1) + ". " + avatar.getName());
                    }
                    else {
                        System.out.println("Unbekanntes Objekt: " + current);
                    }

                }

                    Scanner choose = new Scanner(System.in);
                    int enemySelected = choose.nextInt(); 

                    return aliveEnemy.get(enemySelected-1);
                    
                
                

                

              
        }  
    
    }

