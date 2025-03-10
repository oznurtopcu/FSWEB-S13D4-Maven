package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Player player = new Player("aslı", 100, Weapon.AXE);
        System.out.println("health reamining: " + player.healthRemaining());

        Player player2 = new Player("aslı", 100, Weapon.AXE);
        System.out.println("health reamining: " + player2.healthRemaining());

        player.loseHealth((int) (player2.getWeapon().getDamage() * player2.getWeapon().getAttackSpeed()));
        System.out.println("health reamining after damage: " + player.healthRemaining());

        player.restoreHealth(70);
        System.out.println("health reamining after restore: " + player.healthRemaining());
    }
}