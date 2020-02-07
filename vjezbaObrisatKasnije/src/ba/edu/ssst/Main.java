package ba.edu.ssst;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
      /*  ArrayList<Integer> erej = new ArrayList<>();
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

        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(Integer i : erej) {
            if(map.containsKey(i)) {
            Integer element = map.get(i);
            map.put(i,element + 1); }
            else {
                map.put(i,1);
            }
        }
        File file = new File("numbers_counter.txt");
        FileOutputStream fos2 = new FileOutputStream(file);
        BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(fos2));
        for(Integer i : erej) {
            map.forEach((key, value) -> {
                try {
                    bw2.write(key + " - " + value + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } bw2.close();


     File file = new File("team_members.txt");
     Scanner s = new Scanner(file);

     while(s.hasNextLine()) {
         String line = s.nextLine();
         String[] elements = line.split(", ");
         if(elements.length == 4) {
             String ime = elements[0].trim();
             String prezime = elements[1].trim();
             String teamName = elements[2].trim();
             Boolean captain = Boolean.parseBoolean(elements[3].trim());

             TeamMember teamMember = new TeamMember(ime,prezime,captain);

             if(Storage.getInstance().mapa.containsKey(teamName)) {
                 ArrayList<TeamMember> members = Storage.getInstance().mapa.get(teamName);
                 members.add(teamMember);
                 Storage.getInstance().mapa.put(teamName,members);
             } else {
                 ArrayList<TeamMember> members = new ArrayList<>();
                 members.add(teamMember);
                 Storage.getInstance().mapa.put(teamName,members);
             }
         }
     }

     Storage.getInstance().mapa.forEach((k,v) -> {
         System.out.println(String.format("Team %s has following members: ", k));
         for(TeamMember m : v) {
             System.out.println(m);
         }
     });

      Map<String,ArrayList<Employee>> listMap = new HashMap<>();
    File file = new File("employees.txt");
    Scanner s = new Scanner(file);

    while(s.hasNextLine()) {
        String line = s.nextLine();
        String[] elements = line.split(", ");
        if(elements.length == 4) {
            String ime = elements[0].trim();
            String prezime = elements[1].trim();
            String department = elements[2].trim();
            Integer salary = Integer.parseInt(elements[3].trim());


            Employee employee = new Employee(ime,prezime);

            if(listMap.containsKey(department)) {
                ArrayList<Employee> employees = listMap.get(department);
                employees.add(employee);
                listMap.put(department,employees);
            }
            else {
                ArrayList<Employee> employees = new ArrayList<>();
                employees.add(employee);
                listMap.put(department,employees);
            }

        }
    }
/*
    listMap.forEach((k,v) -> {
        System.out.println(String.format("Department %s has the following employees: " , k));
        for(Employee e : v) {
            System.out.println(e);
        }
    });

    File fout = new File("dep1.txt");
    FileOutputStream fos = new FileOutputStream(fout);
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

    listMap.forEach((depName,employees) -> {
        try {
            bw.write("Departmssent " + depName + " has the following employees: \n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(Employee e : employees) {
            int cnt = 10;
            try {
                bw.write(e + "\n");
                cnt--;
                if(cnt == 0) break;
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    });
    bw.close();
    /*
    listMap.forEach((depName,employees) -> {
        try {
            bw.write("Department " + depName + " has the following members: \n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    });
*/
      File file = new File("employees.txt");
      Scanner s = new Scanner(file);
      ArrayList<Employee> employees = new ArrayList<>();

        while(s.hasNextLine()) {
          String line = s.nextLine();
          String[] elem = line.split(", ");

          if(elem.length == 4) {
              String name = elem[0].trim();
              String surname = elem[1].trim();
              String depName = elem[2].trim();
              Integer salary = Integer.parseInt(elem[3].trim());

              Employee e = new Employee(name,surname,depName,salary);

          employees.add(e);
           }
      }
      LargestSalaryThread largest = new LargestSalaryThread(employees);
      LowestSalaryThread lowest = new LowestSalaryThread(employees);

      Thread t1 = new Thread(largest);
      Thread t2 = new Thread(lowest);

      t1.start();
      t2.start();

      t1.join();
      t2.join();

      PrintWriter pw = new PrintWriter("salaries.txt");
      pw.println("Highest salary: " + Sync.largest + "\nSmallest salary: " + Sync.smallest);

      pw.close();


    }


}