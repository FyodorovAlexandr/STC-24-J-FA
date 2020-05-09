package com.fyodorov.lesson20;

import com.fasterxml.jackson.databind.*;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Json {
    public static void main(String[] args) {

        URL url = null;
        try {
            url = new URL("https://www.metaweather.com/api/location/search/?query=London");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
            String line = reader.readLine();
            ObjectMapper mapper = new ObjectMapper();
            City[] city = mapper.readValue(line, City[].class);
            System.out.println(city[0]);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
