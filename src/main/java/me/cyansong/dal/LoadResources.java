package me.cyansong.dal;

import me.cyansong.model.Product;
import me.cyansong.model.Promotion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoadResources {
    public static List<Product> loadAllItems(){
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("ITEM000000","可口可乐","瓶",3.00));
        productList.add(new Product("ITEM000001","雪碧","瓶",3.00));
        productList.add(new Product("ITEM000002","苹果","斤",5.50));
        productList.add(new Product("ITEM000003","荔枝","斤",15.00));
        productList.add(new Product("ITEM000004","电池","个",2.00));
        productList.add(new Product("ITEM000005","方便面","袋",4.50));
        return productList;
    }

    public static List<Promotion> loadAllPromotions(){
        List<Promotion> promotionList = new ArrayList<>();
        List<String> stringList = Arrays.asList("ITEM000000", "ITEM000001", "ITEM000005");
        promotionList.add(new Promotion("BUY_TWO_GET_ONE_FREE",stringList));
        return promotionList;
    }

}
