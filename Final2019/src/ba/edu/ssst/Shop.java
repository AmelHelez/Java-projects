package ba.edu.ssst;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Shop {
    private final String name;
    private final Date dateOpened;
    private final int numberEmployees;
    private final double dailyProfit;
    private final double dailyRevenue;
    private DateFormat df = new SimpleDateFormat("dd/MM/yyyy");


    public Shop(String name, Date dateOpened, int numberEmployees, double dailyProfit, double dailyRevenue) {
        this.name = name;
        this.dateOpened = dateOpened;
        this.numberEmployees = numberEmployees;
        this.dailyProfit = dailyProfit;
        this.dailyRevenue = dailyRevenue;
    }

    public String getName() {
        return name;
    }

    public int getNumberEmployees() {
        return numberEmployees;
    }

    public Date getDateOpened() {
        return dateOpened;
    }

    public double getDailyProfit() {
        return dailyProfit;
    }

    public double getDailyRevenue() {
        return dailyRevenue;
    }

    @Override
    public String toString() {
        return this.name + " " + df.format(this.dateOpened) + " " + this.numberEmployees + " " + this.dailyProfit + " " + this.dailyRevenue;
    }
}
