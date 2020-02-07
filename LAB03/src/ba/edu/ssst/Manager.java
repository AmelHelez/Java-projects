package ba.edu.ssst;

public class Manager implements IEmployee {
    private final double salary;
    private final int freedays;
    private final int y_of_exp;

    public Manager(double salary, int freedays, int y_of_exp) {
        this.salary = salary;
        this.freedays = freedays;
        this.y_of_exp = y_of_exp;
    }


    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public double getEarnings() {
        return this.salary + this.y_of_exp*300;
    }

    @Override
    public int numberOfFreeDays() {
        return this.freedays;
    }
}
