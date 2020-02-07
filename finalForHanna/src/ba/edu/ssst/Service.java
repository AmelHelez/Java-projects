package ba.edu.ssst;

import java.util.ArrayList;

public class Service {
    private final String serviceName;
    private final int marketSize;
    private final double totalMoneyInYear;
    private ArrayList<Shop> shops;

    public Service(String serviceName, int marketSize, double totalMoneyInYear) {
        this.serviceName = serviceName;
        this.marketSize = marketSize;
        this.totalMoneyInYear = totalMoneyInYear;
        this.shops = new ArrayList<>();
    }

    public String getServiceName() { return serviceName;}
    public int getMarketSize() {return marketSize;}
    public double getTotalMoneyInYear() {return totalMoneyInYear;}
    public ArrayList<Shop> getShops() {return shops;}

    public void addShop(Shop s) {this.shops.add(s);}

    @Override
    public String toString()
    {
        String output = "";
        output += this.serviceName + " " + this.marketSize + " " + this.totalMoneyInYear;
        for(Shop s : shops) {
            output += s;
        }
        return output;
    }
}
