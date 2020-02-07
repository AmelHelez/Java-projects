package ba.edu.ssst;

public class Manager {
    private final String department;
    private final String name;
    private final int budget;

    public Manager(String department, String name, int budget) {
        this.department = department;
        this.name = name;
        this.budget = budget;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public int getBudget() {
        return budget;
    }

    @Override
    public String toString() {
        return this.budget + "";
    }
}
