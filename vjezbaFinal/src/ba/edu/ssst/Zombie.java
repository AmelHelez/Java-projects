package ba.edu.ssst;

public class Zombie extends Creature {

    public Zombie(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void receiveDamage(int dmg) {
        if(dmg % 11 == 0) {
            super.receiveDamage(dmg * 2);
        }
    }
}
