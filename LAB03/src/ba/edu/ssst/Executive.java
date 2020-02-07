package ba.edu.ssst;

public class Executive implements IEmployee {
    private final double salary;
    private final int freedays;
    private final int num_of_workers;


    public Executive(int num_of_workers) {
        this.salary = 0;
        this.freedays = 0;
        this.num_of_workers = num_of_workers;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public double getEarnings() {
        return this.salary + 500*this.num_of_workers;
    }

    @Override
    public int numberOfFreeDays() {
        return this.freedays;
    }
}
