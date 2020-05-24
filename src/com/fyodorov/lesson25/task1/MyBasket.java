package com.fyodorov.lesson25.task1;

import java.util.*;

public class MyBasket implements Basket {

    Map<String, Integer> map = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        map.put(product, quantity);
    }

    @Override
    public void removeProduct(String product) {
        map.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        map.replace(product, quantity);
    }

    @Override
    public void clear() {
        map.clear();
        System.out.println("Clear basket: "+map);
    }

    @Override
    public List<String> getProducts() {
        for(Map.Entry <String, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+ " "+ entry.getValue()+ " шт.");
        }
        System.out.println();
        return null;
    }

    @Override
    public int getProductQuantity(String product) {
        if(map.containsValue(product)){
            System.out.println("Количество продуктов: "+product+ " - "+map.get(product));
        }else {
            System.out.println("Корзина пуста");
        }
        return 0;
    }
}

