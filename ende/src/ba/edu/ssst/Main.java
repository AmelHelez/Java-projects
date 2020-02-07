package ba.edu.ssst;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
	/*City city = new City("Sarajevo");
	city.addBuilding(new House("Nova Otoka",76.5,100));
	city.addBuilding(new House("Moja kuca",23,4));
	city.addBuilding(new House("Zlajina",20,5));
	city.addBuilding(new House("kurica",51.3,23));
	city.addBuilding(new House("nenina kuca",21.2,1));
	city.addBuilding(new IndustryBuilding("SSST",123,2));
	city.addBuilding(new IndustryBuilding("Atlant",100,1));
	city.addBuilding(new IndustryBuilding("Ant Colony",55,3));
	city.addBuilding(new IndustryBuilding("IUS",432,3));
	city.addBuilding(new IndustryBuilding("BURCH",99,2));

	System.out.println("Industry buildings: ");
	for(Building b : city.getBuildings()) {
	    if(b.getClass() == IndustryBuilding.class) {
	        System.out.println(b);
        }
        else {
            System.out.println(b);
        }
    }
    int totalArea = 0;
    for(Building b : city.getBuildings()) {
    	totalArea += b.getArea();
	}
    System.out.println("==================");
    System.out.println(totalArea);
    */

	File file = new File("employees.txt");
		Scanner s = new Scanner(file);
		Map<String, ArrayList<Employee>> map = new HashMap<>();

		while(s.hasNextLine()) {
			String line = s.nextLine();
			String[] elem = line.split(", ");

			if(elem.length == 4) {
				String ime = elem[0].trim();
				String surname = elem[1].trim();
				String dep = elem[2].trim();
				Integer salary = Integer.parseInt(elem[3].trim());


				Employee e = new Employee(ime,surname,salary);
				Department d = new Department(dep);

				d.addEmployee(e);

				if(map.containsKey(dep)) {
					ArrayList<Employee> employees = map.get(dep);
					employees.add(e);
					map.put(dep,employees);
				} else {
					ArrayList<Employee> employees = new ArrayList<>();
					employees.add(e);
					map.put(dep,employees);
				}

			}
		}
		HighestPerDepartment highest = new HighestPerDepartment();
		Thread t = new Thread(highest);
		t.start();
		t.join();



		map.forEach((k,v) -> {
			int total = v.get(0).getSalary();
			System.out.print(String.format("The highest salary for department %s is: ", k));
			for(Employee e : v) {
				if(e.getSalary() > total) total = e.getSalary();
			}
				System.out.println(total);
		});



	}
}
