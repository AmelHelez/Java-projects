package ba.edu.ssst;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
	/* Scanner s = new Scanner(System.in);
        ArrayList<Number> erej = new ArrayList<>();
	int nr = s.nextInt();

	while(nr >= 0) {
	    erej.add(new Number(nr));
	    nr = s.nextInt();
    }

    for(Number n : erej) {
        System.out.print(n + " ");
    }

    NumberCollection nc = new NumberCollection();
    int sum = 0;
    int nr2 = s.nextInt();

    while(nr2 != 0) {
        sum += nr2;
        if(sum <= 100) {
        nc.add(nr2);
        } else {
            break;
        }
        nr2 = s.nextInt();
    }

    System.out.println(nc);
    System.out.println("Sum: " + sum);


	try {
        File file = new File("teams.txt");
        Scanner s = new Scanner(file);

        while (s.hasNextLine()) {
            String line = s.nextLine();
            String[] elements = line.split(",");
            if (elements.length == 4) {
                String firstName = elements[0].trim();
                String lastName = elements[1].trim();
                String teamName = elements[2].trim();
                Boolean captain = Boolean.parseBoolean(elements[3].trim());

                TeamMember tm = new TeamMember(firstName, lastName, captain);

                if (Storage.getInstance().members.containsKey(teamName)) {
                    ArrayList<TeamMember> memb = Storage.getInstance().members.get(teamName);
                    memb.add(tm);
                    Storage.getInstance().members.put(teamName, memb);
                } else {
                    ArrayList<TeamMember> memb = new ArrayList<>();
                    memb.add(tm);
                    Storage.getInstance().members.put(teamName, memb);
                }
            }
        }

        Storage.getInstance().members.forEach((teamName, members) -> {
            System.out.println(String.format("Team %s has following members", teamName));
            for (TeamMember teamMember : members) {
                System.out.println(teamMember);
            }
            System.out.println("=============================");

        });
    } catch(FileNotFoundException e) {
	    e.printStackTrace();
    }

	        boolean hasTeam = false;
	        for(Team t : Storage.getInstance().erej) {
	            if(t.getTeamName().equals(teamName)) {
	                hasTeam = true;
	                break;
                }
            }
            if(!hasTeam) {
                Storage.getInstance().erej.add(new Team(teamName));
            }

            for(Team t : Storage.getInstance().erej) {
                if(t.getTeamName().equals(teamName)) {
                    t.addMember(tm);
                }
            }
        }
    }
    for(Team t : Storage.getInstance().erej) {
        System.out.println(String.format("Team %s has following members:", t.getTeamName())); {
            for(TeamMember tm : t.getMembers()) {
                System.out.println(tm);



            }
        }

    }
/*
     ArrayList<IEmployee> employees = new ArrayList<>();
     employees.add(new Manager(1400,18,7));
     employees.add(new Manager(1800,22,9));
     employees.add(new Executive(1000,23));
     employees.add(new BlueCollarWorker(800,22));
     employees.add(new BlueCollarWorker(1200,30));

     int sum1 = 0;
     for(IEmployee e : employees) {
         sum1 += e.getSalary();
     }
     System.out.println("Average salary is: " + sum1 / employees.size());

     //avg managers only
        int sumManager = 0;
        int cntManager = 0;
        for(IEmployee e : employees) {
            if(e.getClass() == Manager.class) {
                sumManager += e.getSalary();
                cntManager++;
            }
        }
        System.out.println("The average salary for managers is: " + sumManager / cntManager);

        //free days
        int free_days = 0;
        for(IEmployee e :employees) {
            free_days += e.numberOfFreeDays();
        }
        System.out.println("The number of free days is: " + free_days);

        //all employees with max and min earning
        double min = employees.get(0).getEarnings();
        for(IEmployee e : employees) {
            if(e.getEarnings() < min) min = e.getEarnings();
        }
        System.out.println("The minimal earning is: " + min);

        double max = employees.get(0).getEarnings();
        for(IEmployee e : employees) {
            if(e.getEarnings() > max) max = e.getEarnings();
        }
        System.out.println("The maximal earning is: " + max);


	ArrayList<Integer> numbers = new ArrayList<>();
	Random r = new Random();

	for(int i = 0; i < 1000; i++) {
	    numbers.add(r.nextInt(60) - 10);
    }
        Collections.sort(numbers);

	File fout = new File("out.txt");
        FileOutputStream fos = new FileOutputStream(fout);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

        for(Integer i : numbers) {
            bw.write(i + "\n");
        }
        bw.close();


        Map<Integer,Integer> map = new TreeMap<>();
        for(Integer i : numbers) {
            if(map.containsKey(i)) {
                Integer number = map.get(i);
                map.put(i,number + 1);
            } else {
                map.put(i,1);
            }
        }

        File fout2 = new File("numbers_counter.txt");
        FileOutputStream fos2 = new FileOutputStream(fout2);
        BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(fos2));

        map.forEach((key,value) -> {
            try {
                bw2.write(key + " : " + value + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
      bw2.close();
    */

	ArrayList<Integer> erej = new ArrayList<>();
	Random r = new Random();

	for(int i = 0; i < 100000; i++) {
	    erej.add(r.nextInt(1000000));
    }


    }
}
