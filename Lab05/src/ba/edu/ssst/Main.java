package ba.edu.ssst;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
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

        for(int i = 0; i < erej.size(); i++) {
            bw.write(erej.get(i) + "\n");
        }
        bw.close();
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(Integer i : erej) {
            if(map.containsKey(i)) {
                Integer element = map.get(i);
                map.put(i,element + 1);
            } else {
                map.put(i,1);
            }
        }
        File fout2 = new File("numbers_counter.txt");
        FileOutputStream fos2 = new FileOutputStream(fout2);
        BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(fos2));

        map.forEach((key,value) -> {
            try {
                bw2.write(key + " - " + value + " times\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        bw2.close();

    }
}
