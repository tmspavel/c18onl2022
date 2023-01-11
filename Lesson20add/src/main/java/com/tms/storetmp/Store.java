package com.tms.storetmp;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Store {
    private List<Product> productList = new ArrayList<>();
    private Set<Product> productSet = new LinkedHashSet<>();

    public void edit(Product newP) {
        if (productList.contains(newP)) {
            productList.remove(newP);
            productList.add(newP);
        } else {
            // handle missing product
        }


        if (productSet.contains(newP)) {
            productList.add(newP);
        } else {
            // handle missing product
        }
    }
}
