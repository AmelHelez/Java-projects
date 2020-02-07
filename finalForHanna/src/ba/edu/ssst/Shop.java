package ba.edu.ssst;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Shop {
    private final String name;
    private final Date dateOpened;
    private final int employeeNumber;
    private final double dailyProfit;
    private final double dailyRevenue;
    private DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    public Shop(String name, Date dateOpened, Integer employeeNumber, Double dailyProfit, Double dailyRevenue) {
        this.name = name;
        this.dateOpened = dateOpened;
        this.employeeNumber = employeeNumber;
        this.dailyProfit = dailyProfit;
        this.dailyRevenue = dailyRevenue;
    }
    public String getName() {
        return name;
    }

    public int getEmployeeNumber() { return employeeNumber;}
    public double getDailyProfit() {return dailyProfit;}
    public double getDailyRevenue() {return dailyRevenue;}
    public Date getDateOpened() {return dateOpened;}

    @Override
    public String toString() {
     return this.name + " " + df.format(this.dateOpened) + " " + this.employeeNumber + " "
     + this.dailyProfit + " " + this.dailyRevenue;
    }
}
