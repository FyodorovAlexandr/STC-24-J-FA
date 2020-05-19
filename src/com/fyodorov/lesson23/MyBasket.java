package com.fyodorov.lesson23;

import java.util.*;

public class MyBasket implements Basket {

    ArrayList arrayList = new ArrayList();

    @Override
    public void addProduct(String product, int quantity) {
        arrayList.add(product);
        arrayList.add(quantity);
    }

    @Override
    public void removeProduct(String product) {
        int index = arrayList.indexOf(product);
        arrayList.remove(index+1);
        arrayList.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        if(arrayList.contains(product)){
            int index = arrayList.indexOf(product);
            arrayList.set(index+1, quantity);
        }
    }

    @Override
    public void clear() {
        arrayList.clear();
        System.out.println("Clear basket: "+arrayList);
    }

    @Override
    public List<String> getProducts() {
        Iterator products  = arrayList.iterator();
        while(products.hasNext()){
            System.out.printf("%s %s \n", products.next(), products.next()+ " шт.");
        }
        System.out.println();
        return arrayList;
    }

    @Override
    public int getProductQuantity(String product) {
        if(arrayList.contains(product)){
            int index = arrayList.indexOf(product);
            System.out.println("Количество продукта: "+product + " = " + arrayList.get(index));
            return (Integer) arrayList.get(index+1);
        }else {
            System.out.println("Корзина пуста");
            return 0;
        }
    }
}
