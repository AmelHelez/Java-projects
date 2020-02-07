package ba.edu.ssst;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        File file = new File("employees.txt");
        Scanner s = new Scanner(file);
        ArrayList<Employee> employees = new ArrayList<>();

        while(s.hasNextLine()) {
            String line = s.nextLine();
            String[] elements = line.split(", ");
            if(elements.length == 4) {
                String ime = elements[0].trim();
                String prezime = elements[1].trim();
                String dep = elements[2].trim();
                Integer salary = Integer.parseInt(elements[3].trim());

                Employee employee = new Employee(ime,prezime,dep,salary);

                employees.add(employee);
                }
            }

/*
        for(Employee e : employees) {
            System.out.println(e);
        }
*/
      ArrayList<Thread> threads = new ArrayList<>();
        for(int i = 0; i < 4; i++) {
            HighestSalaryThread hs = new HighestSalaryThread(employees);
            Thread t1 = new Thread(hs);
            LowestSalaryThread ls = new LowestSalaryThread(employees);
            Thread t2 = new Thread(ls);
            t1.start();
            t2.start();
            threads.add(t1);
            threads.add(t2);
        }

        threads.forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


        File fout = new File("salaries.txt");
        FileOutputStream fos = new FileOutputStream(fout);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

        bw.write("Highest salary: " + Sync.largest + "\nLowest salary: " + Sync.lowest);

        bw.close();
        }
}
