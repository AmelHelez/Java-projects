package ba.edu.ssst;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Tom", "House cat");
        Dog dog = new Dog("Garonja","Njemacki ovcar");
        Snake snake = new Snake("Kevin Durant",true);
        Iguana iguana = new Iguana("Rapka",false);

        System.out.println("This is a snake called Kevin Durant and it makes the following sound: " + snake.makeSound());

        System.out.println("This is an iguana Rapka and it makes the following sound: " + iguana.makeSound());

        System.out.println("This is my cat: \n" + cat.showPicture());

        System.out.println("\nAnd this is my dog: \n" + dog.showPicture());
    }
}

