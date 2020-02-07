package ba.edu.ssst;

import java.io.*;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
  /*      File file = new File("teams.txt");
        Scanner s = new Scanner(file);

        while(s.hasNextLine()) {
            String line = s.nextLine();
            String[] elements = line.split(", ");
            if(elements.length == 4) {
                String ime = elements[0].trim();
                String prezime = elements[1].trim();
                String teamName = elements[2].trim();
                Boolean captain = Boolean.parseBoolean(elements[3].trim());

                TeamMember tm = new TeamMember(ime,prezime,captain);

                boolean hasTeam = false;
                for(Team t : Storage.getInstance().teams) {
                    if(t.getTeamName().equals(teamName)) {
                        hasTeam = true;
                        break;
                    }
                }
                if(!hasTeam) Storage.getInstance().teams.add(new Team(teamName));

                for(Team t : Storage.getInstance().teams) {
                    if(t.getTeamName().equals(teamName)) {
                        t.addMembers(tm);
                    }
                }

                for(Team t : Storage.getInstance().teams) {
                    System.out.println(String.format("Team %s has following members",t.getTeamName()));
                    for(TeamMember teamMember : t.getMembers()) System.out.println(teamMember);
                }
            }
        }

            ArrayList<Integer> erej = new ArrayList<>();
            Random r = new Random();
            for(int i = 0; i < 1000; i++) erej.add(r.nextInt(60) - 10);
            Collections.sort(erej);
            File f1 = new File("sorted_array.txt");
            FileOutputStream fos1 = new FileOutputStream(f1);
           BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(fos1));

           for(int i = 0; i < erej.size(); i++) bw1.write(erej.get(i) + "\n");
             bw1.close();
           Map<Integer,Integer> map = new HashMap<>();
           for(Integer i : erej) {
               if(map.containsKey(i)) {
                   Integer elem = map.get(i);
                   map.put(i,elem+1);
               } else map.put(i,1);
           }

           File f2 = new File("numbers_counter.txt");
           FileOutputStream fos2 = new FileOutputStream(f2);
           BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(fos2));

           map.forEach((k,v) -> {
               try {
                   bw2.write(k + " : " + v + " times.\n");
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }); bw2.close();

            ArrayList<Integer> erej = new ArrayList<>();
            Random r = new Random();
            for(int i = 0; i < 1000000; i++) erej.add(r.nextInt(100000));
            ArrayList<Thread> threads = new ArrayList<>();

            for(int i = 0; i < 5; i++) {
                List<Integer> list = erej.subList(i*200000, 200000 + i*200000);
                LessThan100 funct = new LessThan100(list);
                Thread t = new Thread(funct);
                t.start();
                threads.add(t);
            }

            threads.forEach(t -> {
                try {
                    t.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
       System.out.println("Numbers less than 100: " + Sync.lista);


     ArrayList<Integer> erej = new ArrayList<>();
     Random r = new Random();
     for(int i = 0; i < 10; i++) erej.add(r.nextInt(6));
     for(Integer i : erej) System.out.print(i + " ");
     ArrayList<Thread> threads = new ArrayList<>();
     for(int i = 0; i < 5; i++) {
         List<Integer> list = erej.subList(i*2,2+i*2);
         IncreaseBy10 funct = new IncreaseBy10(list);
         Thread t = new Thread(funct);
         t.start();
         threads.add(t);
     }

     threads.forEach(t -> {
         try {
             t.join();
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     });
     int sum = 0;
     for(Integer i : Singleton.getInstance().array) sum += i;
     System.out.println("The sum is: " + sum);
   */
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("LeBron","James",10));
        students.add(new Student("Kobe","Bryant",9));
        students.add(new Student("Anthony","Davis",7));
        students.add(new Student("Sani","Campara",2));
        students.add(new Student("Emir","Spahic",4));
        students.add(new Student("Edin","Dzeko",9));
        students.add(new Student("Derrick","Rose",1));
        students.add(new Student("Paul","George",7));

        Map<Integer,Integer> map = new HashMap<>();
        for(Student s : students) {
            if(map.containsKey(s.getPoints())) {
                Integer broj = map.get(s.getPoints());
                map.put(s.getPoints(),broj+1);
            } else map.put(s.getPoints(),1);
        }
        map.forEach((k,v) -> {
            System.out.println(v + " students have " + k + " points.");
        });
    }

}
