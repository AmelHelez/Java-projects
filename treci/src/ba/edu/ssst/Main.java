package ba.edu.ssst;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Main {

    protected static ArrayList<Employee> employeeList;
    protected static ArrayList<Manager> managerList;
    protected static ArrayList<String> departments;

    public static void main(String[] args) {

        employeeList = loadEmployees();
        managerList = loadManagers();

        for (Manager m : managerList) {
            m.getDepartmentStats(employeeList);
        }

        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e2.getSalary() - e1.getSalary();
            }
        });

        int topThree = 3;

        for (String dep : departments) {
            ArrayList<Employee> departmentList = new ArrayList<>();
            for (Employee e : employeeList) {
                if (topThree == 0) {
                    break;
                } else {
                    if (dep.equals(e.getDepartment())) {
                        departmentList.add(e);
                        topThree--;
                    }
                }
            }
            createFile(dep, departmentList);
            departmentList.clear();
            topThree = 3;
        }

    }

    private static void createFile(String departmentName, ArrayList<Employee> listToPrint) {
        BufferedWriter bw = null;
        File file = new File(departmentName + "TopEarners.txt");

        try {
            bw = new BufferedWriter(new FileWriter(file));
            for (Employee e : listToPrint) {
                bw.write(e.toString());
            }
            bw.close();
        } catch (IOException io) {
            io.printStackTrace();
        }
    }

    private static ArrayList<Manager> loadManagers() {

        String txtFile = "managers.txt";
        String delim = ",";
        String line = "";
        BufferedReader br = null;
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        ArrayList<Manager> list = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader(cl.getResource(txtFile).getFile()));

            while ((line = br.readLine()) != null) {
                String[] manager = line.split(delim);
                String department = manager[0];
                String name = manager[1].substring(1,manager[1].length());
                double budget = Double.parseDouble(manager[2].substring(1,manager[2].length()));

                Manager newManager = new Manager(department, name, budget);
                list.add(newManager);
            }

        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
        } catch (IOException io) {
            io.printStackTrace();
        }

        return list;
    }

    private static ArrayList<Employee> loadEmployees() {

        ArrayList<Employee> list = new ArrayList<>();
        departments = new ArrayList<>();
        String txtFile = "employees.txt";
        String delim = ",";
        String line = "";
        BufferedReader br = null;

        ClassLoader cl = ClassLoader.getSystemClassLoader();

        try {
            br = new BufferedReader(new FileReader(new File(cl.getResource(txtFile).getFile())));
            while ((line = br.readLine()) != null) {
                String[] employee = line.split(delim);
                String firstName = employee[0];
                String lastName = employee[1].substring(1,employee[1].length());
                String department = employee[2].substring(1,employee[2].length());
                int salary = Integer.parseInt(employee[3].substring(1,employee[3].length()));

                Employee employeeForList = new Employee(firstName, lastName, salary, department);
                list.add(employeeForList);

                if (!departments.contains(department)) {
                    departments.add(department);
                }
            }

        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
        } catch (IOException io) {
            io.printStackTrace();
        }

        return list;
    }

}


