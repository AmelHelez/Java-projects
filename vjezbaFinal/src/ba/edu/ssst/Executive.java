package ba.edu.ssst;

public class Executive implements IEmployee {
    private final double salary;
    private final int free_days;
    private final int number_of_emps;

    public Executive(double salary, int number_of_emps) {
        this.salary = salary;
        this.free_days = 0;
        this.number_of_emps = number_of_emps;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public double getEarnings() {
        return salary + 500 * number_of_emps;
    }

    @Override
    public int numberOfFreeDays() {
        return free_days;
    }

    @Override
    public String toString() {
        return "Salary: " + this.salary + "\nFree days: "
                + this.free_days + "\nNumber of employees: "
                + this.number_of_emps;
    }
}
