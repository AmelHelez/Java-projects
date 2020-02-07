package ba.edu.ssst;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Output implements Runnable{
    private Thread t;
    private final String name;

    public Output(String name) {
        this.name = name;
        System.out.println("Creating " + name);
    }

    @Override
    public void run() {
    System.out.println("Running " + name);
    try {
        ArrayList<Integer> erej = new ArrayList<>();
        Random r = new Random();

        for(int i = 0; i < 20; i++) {
            erej.add(r.nextInt(50));
        }

        Collections.sort(erej);

        File fout = new File("out.txt");
        FileOutputStream fos = new FileOutputStream(fout);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

        for(Integer i : erej) {
            bw.write(i + "\n");
        }
        bw.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}
