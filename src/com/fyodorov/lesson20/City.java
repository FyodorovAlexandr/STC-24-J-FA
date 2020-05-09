package com.fyodorov.lesson20;

import com.fasterxml.jackson.annotation.JsonProperty;

public class City {

    @JsonProperty("title")
    public String cityName;
    public String location_type;
    public int woeid;
    public String latt_long;

    @Override
    public String toString() {
        return "City {" +
                "title = '" + cityName + '\'' +
                ", location_type = '" + location_type + '\'' +
                ", woeid = " + woeid +
                ", latt_long = '" + latt_long + '\'' +
                '}';
    }
}


