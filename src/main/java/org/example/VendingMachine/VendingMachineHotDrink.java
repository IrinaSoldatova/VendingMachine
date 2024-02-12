package org.example.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineHotDrink implements VendingMachine {
    List<Product> productList = new ArrayList<>();

    public void addHotDrink(HotDrink hotDrink) {
        productList.add(hotDrink);
    }

    @Override
    public void initProducts(List<Product> list) {
        productList = list;

    }

    @Override
    public Product getProduct(String name, double volume, double temp) {
        for (Product product : productList) {
            if (product.getName().equals(name) && product.getVolume() == volume && product.getTemp() == temp)
                return product;
        }
        return null;
    }

    @Override
    public Product getProduct(String name, double volume) {
        for (Product product : productList) {
            if (product.getName().equals(name) && product.getVolume() == volume)
                return product;
        }
        return null;
    }
}
