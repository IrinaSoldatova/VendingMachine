package org.example.VendingMachine;

import java.util.List;

public interface VendingMachine {

    void initProducts(List<Product> list);

    Product getProduct(String name, double volume, double temp);

    Product getProduct(String name, double volume);
}
