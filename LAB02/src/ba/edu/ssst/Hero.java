package ba.edu.ssst;

public class Hero {
    private final String name;
    private int health;
    private final int damage;

    public Hero(String name,int health,int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public Boolean isAlive() {
        return health > 0;
    }
    public void receiveDamage(int iDamage) {
        if(iDamage % 2 == 0 && health % 2 == 0) {
        health -= iDamage; }
    }

}
