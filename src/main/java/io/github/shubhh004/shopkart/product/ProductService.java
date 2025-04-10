package io.github.shubhh004.shopkart.product;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> productList;

    public ProductService() {
        productList = new LinkedList<>();
    }
    //CRUD-create read update delete
    //Create
     public Product addProduct(Product product){
        productList.add(product);
        return product;
    }
}
