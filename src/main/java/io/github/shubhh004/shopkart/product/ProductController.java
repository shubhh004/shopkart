package io.github.shubhh004.shopkart.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//REST- REpresentational State Transfer
//JASON- java script object notation
@RestController
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // Create - POST
    @PostMapping("/products/add")
    public Product addProduct(@RequestBody Product product){
        productService.addProduct(product);
        return product;
    }
    // Read - GET

    // Update - PUT

    // Delete - DELETE

    // REQUEST - HTTP Method & URL
    // RESPONSE - HTTP STATUS & RESPONSE BODY

}
