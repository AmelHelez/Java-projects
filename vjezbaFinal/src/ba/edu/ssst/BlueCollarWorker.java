package ba.edu.ssst;

public class BlueCollarWorker implements IEmployee{
    double salary;
    int free_days;

    BlueCollarWorker(double salary,int free_days) {
        this.salary = salary;
        this.free_days = free_days;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public double getEarnings() {
        return salary;
    }

    @Override
    public int numberOfFreeDays() {
        return free_days;
    }

    @Override
    public String toString() {
        return "Salary: " + this.salary
                + "\nFree days: " + this.free_days;
    }
}
