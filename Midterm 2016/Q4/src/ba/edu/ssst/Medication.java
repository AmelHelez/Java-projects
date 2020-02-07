package ba.edu.ssst;

public class Medication {
   private final String name;
   private final int weight;
   private int serial = 100000;
   private static int cnt;

   public static int getCnt() {
       return cnt;
   }

   public Medication(String name,int weight) {
       this.name = name;
       this.weight = weight;
       serial += cnt;
       cnt++;
   }

   @Override
    public String toString() {
       return this.name + ", " + this.weight + ", " + this.serial;
   }
}
