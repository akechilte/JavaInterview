package com.designpattern.factory;

import java.util.Scanner;

/**
 * Created by mbiswas on 4/23/18.
 */
public class EnemyShipTesting {

    // Before Factory Pattern

//    public static void main(String[] args) {
//
//        EnemyShip theEnemy = null;
//
//        Scanner userInput = new Scanner(System.in);
//        String enemyShipOption = "";
//
//        System.out.println("What type of ship? (U / R)");
//        if(userInput.hasNextLine()){
//            enemyShipOption = userInput.nextLine();
//        }
//
//        if(enemyShipOption.equals("U") || enemyShipOption.equals("u")){
//
//            theEnemy = new UFOEnemyShip();
//
//        }else if(enemyShipOption.equals("R") || enemyShipOption.equals("r")){
//            theEnemy = new RocketEnemyShip();
//        }else{
//            System.out.println("Please give an input within (U / R)");
//        }
//        doStuffEnemy(theEnemy);
//    }


    // with Factory pattern (extra added EnemyShipFactory.java for factory pattern)
    public static void main(String[] args) {

        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip theEnemy = null;
        Scanner userInput = new Scanner(System.in);

        System.out.println("What type of ship? (U / R /B)");
        if(userInput.hasNextLine()){
            String typeOfShip = userInput.nextLine();
            theEnemy = shipFactory.makeEnemyShip(typeOfShip);
        }

        if(theEnemy != null){
            doStuffEnemy(theEnemy);
        }else{
            System.out.println("Please give an input within (U / R / B) next time");
        }



    }



    public static void doStuffEnemy(EnemyShip enemyship){

        enemyship.displayEnemyShip();
        enemyship.followingHeroShip();
        enemyship.enemyShipShoots();

    }
}

