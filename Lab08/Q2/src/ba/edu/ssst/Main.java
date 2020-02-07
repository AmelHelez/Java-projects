package ba.edu.ssst;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Map<Integer,Integer> map = new TreeMap<>();

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Leo","Messi",10));
        students.add(new Student("Robert","Lewandowski",10));
        students.add(new Student("Asim","Zec",5));
        students.add(new Student("Niklas","Sule",9));
        students.add(new Student("James","Rodriguez",7));
        students.add(new Student("Joshua","Kimmich",9));
        students.add(new Student("David","Alaba",6));
        students.add(new Student("Marco","Reus",4));
        students.add(new Student("Izet","Fazlinovic",10));
        students.add(new Student("Leon","Goretzka",8));
        students.add(new Student("Eden","Hazard",4));
        students.add(new Student("LeBron","James",10));

        for(Student s : students) {
            System.out.println(s); // just for the test in the end
            System.out.println("------------");
        }
        System.out.println("=====================");

        for(Student s : students) {
            if(map.containsKey(s.getPoints())) {
                Integer point = map.get(s.getPoints());
                map.put(s.getPoints(), point + 1);
            } else {
                map.put(s.getPoints(), 1);
            }
        }

        map.forEach((k,v) -> {
            System.out.println(v + " student(s) has/have " +
                    k + " points.");
        });


    }
}
