package me.cyansong.model;

public class OrderItem {
    private String barcode;
    private double count;

    public OrderItem() {
    }

    public OrderItem(String barcode, double count) {
        this.barcode = barcode;
        this.count = count;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setCount(double count) {
        this.count = count;
    }

    public String getBarcode() {

        return barcode;
    }

    public double getCount() {
        return count;
    }
}
