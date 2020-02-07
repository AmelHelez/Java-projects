package ba.edu.ssst;

public class Executive implements IEmployee {
    double salary;
    int freedays;
    int num_of_employees;

    public Executive(double salary,int num_of_employees) {
        this.salary = salary;
        this.freedays = 0;
        this.num_of_employees = num_of_employees;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public double getEarnings() {
        return this.salary + 500 * this.num_of_employees;
    }

    @Override
    public int numberOfFreeDays() {
        return this.freedays;
    }
}
