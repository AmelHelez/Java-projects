package ba.edu.ssst;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class RunnableDemo implements Runnable {
    private Thread t;
    private String threadName;

    RunnableDemo(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    public void run() {
        System.out.println("Running " + threadName);
        try {
            ArrayList<Integer> array = new ArrayList<>();
            Random r = new Random();

            for (int i = 0; i < 20; i++) {
                array.add(r.nextInt(100));
            }
            Collections.sort(array);

            File fout = new File("out.txt");
            FileOutputStream fos = new FileOutputStream(fout);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

            for (Integer i : array) {
                bw.write(i + "\n");
            }
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
        public void start () {
            System.out.println("Starting " + threadName);
            if (t == null) {
                t = new Thread(this, threadName);
                t.start();
            }
        }


}

