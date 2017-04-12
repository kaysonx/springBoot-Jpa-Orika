package me.cyansong.model;

public class CartItem {
    private OrderItem orderItem;
    private Product product;
    private double totalPrice;
    private double savePrice;

    @Override
    public String toString() {
        return "CartItem{" +
                "orderItem=" + orderItem +
                ", product=" + product +
                ", totalPrice=" + totalPrice +
                ", savePrice=" + savePrice +
                '}';
    }
}
