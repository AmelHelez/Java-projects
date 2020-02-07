package ba.edu.ssst;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hash map: ");
        Map hashMap = new HashMap<String,String>();
        hashMap.put("A1a",10);
        hashMap.put("B2b",20);
        hashMap.put("C3c",30);
        hashMap.put("D4d",40);
        hashMap.put("E5e",50);
        hashMap.put("F6f",60);

        hashMap.forEach((k,v) -> {
            String output = k + " : " + v;
            System.out.println(output);
        });

        System.out.println("Tree map: ");
        Map treeMap = new TreeMap<String,String>();
        treeMap.put("C3c",30);
        treeMap.put("D4d",40);
        treeMap.put("A1a", 10);
        treeMap.put("B2b", 20);
        treeMap.put("E5e", 50);
        treeMap.put("F6f", 60);

        treeMap.forEach((k, v) -> System.out.println(k + " : " + v));

        System.out.println("Linked Hash map:");
        Map linkedMap = new LinkedHashMap<String, String>();
        linkedMap.put("C3c", 30);
        linkedMap.put("D4d", 40);
        linkedMap.put("A1a", 10);
        linkedMap.put("B2b", 20);
        linkedMap.put("E5e", 50);
        linkedMap.put("F6f", 60);

        linkedMap.forEach((k, v) -> System.out.println(k + " : " + v));

    }
}
