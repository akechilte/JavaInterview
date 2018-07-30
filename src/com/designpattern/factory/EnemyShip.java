package com.designpattern.factory;

/**
 * Created by mbiswas on 4/23/18.
 */
public abstract class EnemyShip {

    private String name;
    private double amtDamage;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setDamage(double amtDamage) {
        this.amtDamage = amtDamage;
    }

    public double getDamage() {
        return amtDamage;
    }

    public void followingHeroShip(){
        System.out.println(getName() +"is following the hero.");
    }

    public void displayEnemyShip(){
        System.out.println(getName() +"is on the Screen.");
    }

    public void enemyShipShoots(){
        System.out.println(getName() +"attacks and does" +getDamage());
    }

}
