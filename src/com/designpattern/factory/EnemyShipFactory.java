package com.designpattern.factory;

/**
 * Created by mbiswas on 4/23/18.
 */
public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String newShipType){

        EnemyShip newShip = null;

        if(newShipType.toUpperCase().equals("U")){
            return new UFOEnemyShip();
        }else if(newShipType.toUpperCase().equals("R")){
            return new RocketEnemyShip();
        }else if(newShipType.toUpperCase().equals("B")){
            return new BigUFOEnemyShip();
        }else{
            return null;
        }
    }
}
