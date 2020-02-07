package ba.edu.ssst;

public class Manager implements IEmployee {
    private double salary;
    private int free_days;
    private final int experience;

    public Manager(double salary, int free_days, int experience) {
        this.salary = salary;
        this.free_days = free_days;
        this.experience = experience;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public double getEarnings() {
        return salary + 300 * experience;
    }

    @Override
    public int numberOfFreeDays() {
        return free_days;
    }
}
