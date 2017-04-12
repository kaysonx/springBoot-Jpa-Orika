package me.cyansong.controller;

import me.cyansong.dal.LoadResources;
import me.cyansong.model.OrderItem;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Path("pos")
public class PosController {

    @GET
    @Path("items")
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, Object> getItems(){
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("items",LoadResources.loadAllItems().stream().map(item -> item.toJson()).collect(Collectors.toList()));
        return map;
    }

    @GET
    @Path("promotions")
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String,Object> getPromotions(){
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("promotions",LoadResources.loadAllPromotions().stream().map(promotion -> promotion.toJson()).collect(Collectors.toList()));
        return map;
    }

    @POST
    @Path("orders")
    public void createOrder(Map<String,List<OrderItem>> orderMap){
        //   {
     //       "order":[
     //       {"barcode":"item1","count":5},
     //       {"barcode":"item2","count":2.3}
	//         ]
     //   }
        System.out.println(orderMap.get("order"));
    }
}
