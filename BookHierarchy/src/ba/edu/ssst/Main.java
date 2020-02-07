package ba.edu.ssst;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new PrintBook("1001 noc",900,"Onur Aksal","Osmansko Carstvo",00001));
        books.add(new PrintBook("Robinzon Kruso",1719,"Daniel Defoe","Engleska",001234));
        books.add(new AudioBook("Guliverova Putovanja",1726,"Jonathan Swift",1000,23,"Kurac"));

        for (Book b : books) {
            System.out.println(b);
        }
        Scanner s = new Scanner(System.in);
         Scanner au = new Scanner(System.in);
        System.out.println("Now enter book name: ");
        String name = s.nextLine();
        System.out.println();
        System.out.println("Now enter book year: ");
        int year = s.nextInt();
        System.out.println();
        System.out.println("Now enter book author: ");
        String author = au.nextLine();
        System.out.println();


        Book book = new Book(name,year,author);
        System.out.println(book);

    }
}
