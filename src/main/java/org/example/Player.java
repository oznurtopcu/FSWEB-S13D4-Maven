package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
        checkAndSetHealth(healthPercentage);

    }

    private void checkAndSetHealth(int healthPercentage) {
        if(healthPercentage > 100) {
            this.healthPercentage = 100;
        }else if(healthPercentage < 0) {
            this.healthPercentage = 0;
        }else {
            this.healthPercentage = healthPercentage;
        }
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void loseHealth(int damage) {
        int healthRemain = healthPercentage - damage;
        if(healthRemain <= 0) {
            System.out.println(name + " player has been knocked out of game");
        }
        healthPercentage = healthRemain;
        checkAndSetHealth(healthPercentage);
    }

    public void restoreHealth(int healthPotion) {
        healthPercentage += healthPotion;
        checkAndSetHealth(this.healthPercentage);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", healthPercentage=" + healthPercentage +
                ", weapon=" + weapon +
                '}';
    }
}




