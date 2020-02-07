package ba.edu.ssst;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    City city = new City("Sarajevo");
	city.addBuilding(new IndustryBuilding("SSST",35,2));
	city.addBuilding(new IndustryBuilding("IUS",55,2));
	city.addBuilding(new IndustryBuilding("Oracle",100,1));
	city.addBuilding(new IndustryBuilding("Nacional",44,1));
	city.addBuilding(new IndustryBuilding("Zara",91,4));
	city.addBuilding(new House("Hacienda",10,4));
	city.addBuilding(new House("Sloga",19,7));
	city.addBuilding(new House("Meeting Point",7,2));
	city.addBuilding(new House("Walter",10,5));
	city.addBuilding(new House("Cloud",5,5));
    double area = 0;

    System.out.println("Industry Buildings: ");
	for(Building b : city.getBuildings()) {
		area += b.getArea();
		if(b.getClass() == IndustryBuilding.class) {
			System.out.println(b);
		}
	}
	System.out.println("-------------------------");
	System.out.println("Houses: ");
	for(Building b : city.getBuildings()) {
		if(b.getClass() == House.class) {
			System.out.println(b);
		}
	}

	System.out.println("Area for " + city.getName() + " is: " + area);
    }
    }


