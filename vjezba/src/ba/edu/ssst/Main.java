package ba.edu.ssst;

import javax.swing.plaf.metal.MetalComboBoxEditor;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        /*
        BankAccount bankAccount = new BankAccount(12.5);
        bankAccount.Deposit(100);
        System.out.println(bankAccount);

        Triangle t = new Triangle(2.4,1.2,3.5);
        System.out.println(t);

        Angle a1 = new Angle(49,27,4);
        Angle a2 = new Angle(45,75,140);
        System.out.println(a1);
        System.out.println(a2);

        ArrayList<GeometricShape> shapes = new ArrayList<>();
        shapes.add(new Circle("White",8.5));
        shapes.add(new Rectangle("Blue",4,7));
        shapes.add(new Trianglee("Red",2,3,4));

        for (GeometricShape g : shapes) {
            System.out.println("Type: " + g.getType() + "\n" + g);
        }
    */

        ArrayList<Integer> erej = new ArrayList<>();
        Random r = new Random();
        int nr;
        for(int i = 0; i < 1000; i++) {
            nr = r.nextInt(60) - 10;
            erej.add(nr);
        }
        Collections.sort(erej);
        File fout = new File("sorted_array.txt");
        FileOutputStream fos = new FileOutputStream(fout);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

        for(Integer i : erej) {
            bw.write(i + "\n");
        }
        bw.close();
    }
    }
