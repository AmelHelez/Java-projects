package ba.edu.ssst;

public class BlueCollarWorker implements IEmployee {
    double salary;
    int freedays;

    public BlueCollarWorker(double salary,int freedays)
    {
        this.salary = salary;
        this.freedays = freedays;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public double getEarnings() {
        return this.salary;
    }

    @Override
    public int numberOfFreeDays() {
        return this.freedays;
    }
}
