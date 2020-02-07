package ba.edu.ssst;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Animal a1 = new Animal("Medo","Brundo",6);
        Animal a2 = new Animal("Kurac","Palac",23);
        Animal a3 = new Animal("Nemam","Pojma",12);

        ArrayList<Animal> list = new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);

        for (Animal a: list) {
            System.out.println(a);
        }
    }
}
