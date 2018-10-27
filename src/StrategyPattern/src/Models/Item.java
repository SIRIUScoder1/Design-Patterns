package StrategyPattern.src.Models;

public class Item {

    private String upcCode;
    private int price;

    public Item(final String upcCode, final int price) {
        this.upcCode = upcCode;
        this.price = price;
    }

    public String getUpcCode() {
        return this.upcCode;
    }

    public int getPrice() {
        return this.price;
    }
}
