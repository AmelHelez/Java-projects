package ba.edu.ssst;

public class BasePlusCommisionEmployee extends CommisionEmployee {
    private double baseSalary;
    public BasePlusCommisionEmployee(String firstName, String lastName, String socialSecurityNumber,double sales,double commisionRate,double baseSalary) {
        super(firstName, lastName, socialSecurityNumber,sales,commisionRate);
        if(baseSalary < 0.0) throw new IllegalArgumentException("Base salary must be >= 0");
        this.baseSalary = baseSalary;
     }

     public void setBaseSalary(double baseSalary) {
        if(baseSalary < 0.0) throw new IllegalArgumentException("Base salary must be >= 0");
        this.baseSalary = baseSalary;
     }

     public double getBaseSalary() {
        return baseSalary;
     }

     @Override
    public double earnings() {
        return baseSalary + super.earnings();
     }

     @Override
    public String toString() {
        return super.toString() + "\nBase salary: " + getBaseSalary();
     }

}
