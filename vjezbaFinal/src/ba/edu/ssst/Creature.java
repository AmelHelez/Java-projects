package ba.edu.ssst;

public class Creature {
    private final String name;
    private int health;
    private final int damage;

    public Creature(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public Boolean isAlive() {
        return health > 0;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public void receiveDamage(int dmg) {
        health -= dmg;
    }


}
