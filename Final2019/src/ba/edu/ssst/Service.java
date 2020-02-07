package ba.edu.ssst;

import java.util.ArrayList;

public class Service {
    private final String type;
    private final int marketSize;
    private final double yearTotalMoney;
    private ArrayList<Shop> shops;

    public Service(String type, int marketSize, double yearTotalMoney) {
        this.type = type;
        this.marketSize = marketSize;
        this.yearTotalMoney = yearTotalMoney;
        this.shops = new ArrayList<>();
     }

    public String getType() {
        return type;
    }

    public int getMarketSize() {
        return marketSize;
    }

    public double getYearTotalMoney() {
        return yearTotalMoney;
    }

    public ArrayList<Shop> getShops() {
        return shops;
    }

    public void addShop(Shop s) {
        this.shops.add(s);
    }

    @Override
    public String toString() {
        String output = "";
        output += this.type + " " + this.marketSize + " " + this.yearTotalMoney;
        for (Shop s : shops) {
            output += s;
        }
        return output;
    }
}

