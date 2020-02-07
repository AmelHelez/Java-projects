package ba.edu.ssst;

public class Student extends Person {
   public Student(String f_name, String l_name) {
       super(f_name, l_name);
   }

   @Override
    public String toString() {
       return "Student";
   }
}
