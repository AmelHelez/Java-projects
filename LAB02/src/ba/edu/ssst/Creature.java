package ba.edu.ssst;

public class Creature {
      private final String name;
      protected int health;
      private final int damage;

      public Creature(String name,int health,int damage) {
          this.name = name;
          this.health = health;
          this.damage = damage;
      }

      public Boolean isAlive() {
          return health > 0;
      }
      public int GetDamage() {
          return damage;
      }
      public void receiveDamage(int iDamage) {
          health -= iDamage;
      }

      public String getName() {
          return name;
      }
}
