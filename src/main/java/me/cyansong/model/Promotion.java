package me.cyansong.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Promotion {
    private String type;
    private List<String> barcodes;

    public Promotion(String type, List<String> barcodes) {
        this.type = type;
        this.barcodes = barcodes;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBarcodes(List<String> barcodes) {
        this.barcodes = barcodes;
    }

    public String getType() {

        return type;
    }

    public List<String> getBarcodes() {
        return barcodes;
    }

    public Map<String, Object > toJson() {
        return new HashMap<String, Object>() {{
            put("type", getType());
            put("barcodes", getBarcodes());
        }};
    }
}
