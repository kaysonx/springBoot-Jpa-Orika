package me.cyansong.model;

import java.util.HashMap;
import java.util.Map;

public class Product {
    public Product(String barcode, String name, String unit, double price) {
        this.barcode = barcode;
        this.name = name;
        this.unit = unit;
        this.price = price;
    }

    private String barcode;
    private String name;
    private String unit;
    private double price;

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBarcode() {

        return barcode;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public double getPrice() {
        return price;
    }

    public Map<String, Object > toJson() {
        return new HashMap<String, Object>() {{
            put("name", getName());
            put("price", getPrice());
            put("barcode", getBarcode());
            put("unit", getUnit());
        }};
    }
}
