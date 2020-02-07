package ba.edu.ssst;

public class Hero {
    private final String name;
    private int health;
    private final int damage;

    public Hero(String name, int health, int damage) {
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

    public void receiveDamage(int dmg) {
        if(dmg % 2 == 0 && health % 2 == 0) {
            health -= dmg;
        }
    }


}
