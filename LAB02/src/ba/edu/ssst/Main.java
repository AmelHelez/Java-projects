package ba.edu.ssst;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     ArrayList<Creature>  creatures = new ArrayList<>();
     Dragon dragon = new Dragon("Red", 100, 40);
     Dragon d = new Dragon("Green", 50, 70);
     Zombie zombie = new Zombie("Zoomie", 20, 10);
     Zombie z = new Zombie("Zoomy", 20, 10);
     Zombie z2 = new Zombie("Zoomer",20,10);
     creatures.add(dragon);
        creatures.add(d);
        creatures.add(zombie);
        creatures.add(z);
        creatures.add(z2);

     Scanner scanner = new Scanner(System.in);
     System.out.println("Hero name: ");
     String heroName = scanner.nextLine();
     System.out.println("Hero health: ");
     int heroHealth = scanner.nextInt();
     System.out.println("Hero damage: ");
     int heroDamage = scanner.nextInt();

     Hero hero = new Hero(heroName,heroHealth,heroDamage);

     boolean creatureAlive;

     do {
         for(Creature creature: creatures) {
             creature.receiveDamage(hero.getDamage());
         }
         for(Creature creature: creatures) {
             hero.receiveDamage(creature.GetDamage());
         }
         System.out.println(hero.getName() + " is alive, " + hero.isAlive());
         for (Creature creature: creatures) {
             System.out.println(creature.getName() + " is alive, " + creature.isAlive());
         }
         creatureAlive = false;
         for(Creature creature: creatures) {
             creatureAlive = creatureAlive || creature.isAlive();
         }
     } while(hero.isAlive() && creatureAlive);
    }
}
