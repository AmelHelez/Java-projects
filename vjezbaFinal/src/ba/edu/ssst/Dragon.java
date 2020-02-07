package ba.edu.ssst;

public class Dragon extends Creature {
    public Dragon(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void receiveDamage(int dmg) {
        if(dmg % 2 == 0 && dmg % 3 == 0) {
            super.receiveDamage(dmg);
        }


    }
}
