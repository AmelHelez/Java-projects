package ba.edu.ssst;

import java.security.InvalidParameterException;

public class Report {
   public void print() throws InvalidParameterException {
       for(Person p: Storage.getInstance().names) {
           if(p.getFirstname().length() < 10) {
               System.out.println(p);
           } else {
               throw new InvalidParameterException("Name is too long.");
           }
       }
   }
}
