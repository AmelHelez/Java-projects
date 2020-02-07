package ba.edu.ssst;

public class Manager implements IEmployee {
    double salary;
    int freedays;
    int years;

    public Manager(double salary,int freedays,int years) {
        this.salary = salary;
        this.freedays = freedays;
        this.years = years;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public double getEarnings() {
        return this.salary + 300 * this.years;
    }

    @Override
    public int numberOfFreeDays() {
        return this.freedays;
    }
}
