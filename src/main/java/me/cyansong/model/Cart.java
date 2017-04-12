package me.cyansong.model;

import java.util.List;

public class Cart {
    private double totalPrice;
    private double totalSave;

    private List<CartItem> cartItemList;

    @Override
    public String toString() {
        return "Cart{" +
                "totalPrice=" + totalPrice +
                ", totalSave=" + totalSave +
                ", cartItemList=" + cartItemList +
                '}';
    }
}
