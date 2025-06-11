package com.abhi_prep.lamdbaPractice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Pocs {
    public static void main(String[]args){
        Product product1 = new Product("sampoo", 67, 5);
        Product product2 = new Product("Books", 200, 3);
        Product product3 = new Product("metals", 808, 8);
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);

        List<Product> res = products.stream().sorted(Comparator.comparing(Product::name)).toList();
        System.out.println("sorted by name of product: "+res);
        //filter of those product whose starting character is B
//        products.stream().filter(Product::name);
    }
}


record Product(String name,int price,int stock){
}