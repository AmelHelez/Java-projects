package ba.edu.ssst;

import java.util.ArrayList;

public class Singleton {

   private static Singleton instance;
   public ArrayList<Integer> array;

   private Singleton() {
       this.array = new ArrayList<>();
   }

   public static Singleton getInstance() {
       if(instance == null) {
           instance = new Singleton();
       }
       return instance;
   }
}
