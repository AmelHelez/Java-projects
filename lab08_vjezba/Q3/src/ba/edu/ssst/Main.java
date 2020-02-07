package ba.edu.ssst;

import java.io.*;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {
    Singleton.getInstance().list.add(new Student("Philippe","Coutinho",8));
    Singleton.getInstance().list.add(new Student("Ivan","Perisic",7));
    Singleton.getInstance().list.add(new Student("Benjamin","Pavard",9));
    Singleton.getInstance().list.add(new Student("Leroy","Sane",10));
    Singleton.getInstance().list.add(new Student("Lucas","Hernandez",9));
    Singleton.getInstance().list.add(new Student("Robert","Lewandowski",10));

       /* Map<Integer,Integer> map = new HashMap<>();
        for(Student s : Singleton.getInstance().list) {
            if(map.containsKey(s.getNumOfPoints())) {
                Integer i = Singleton.getInstance().mapa.get(s.getNumOfPoints());
                Singleton.getInstance().mapa.put(s.getNumOfPoints(),i+1);
            } else Singleton.getInstance().mapa.put(s.getNumOfPoints(),1);
        } */
       CountThread ct = new CountThread();
       Thread t = new Thread(ct);
       t.start(); t.join();

       File file = new File("points.txt");
        FileOutputStream fos = new FileOutputStream(file);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

        Singleton.getInstance().mapa.forEach((k,v) -> {
            try {
                bw.write(v + " student(s) got " + k + " points.\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        bw.close();
    }
}
