package ba.edu.ssst;

public class Employee {
    protected String firstName;
    protected String lastname;
    protected int salary;
    protected String department;

    public Employee(String firstName, String lastname, int salary, String department) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.salary = salary;
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    protected void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    protected void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getSalary() {
        return salary;
    }

    protected void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    protected void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee [firstName=" + firstName + ", lastname=" + lastname + ", salary=" + salary + ", department="
                + department + "]\n";
    }

}
