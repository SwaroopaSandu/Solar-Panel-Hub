package com.product.Backend_Solar.Controller;


import com.product.Backend_Solar.Entity.Product;
import com.product.Backend_Solar.Service.ProductService;
import com.product.Backend_Solar.ServiceImplementation.ProductServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/solar")
@RestController
public class ProductController
{

    @Autowired
    private ProductService productService;
    @PostMapping({"/addProduct"})
    public ResponseEntity<Product> addNewProduct(@RequestBody Product product){

        return new ResponseEntity<> (productService.addNewProduct(product), HttpStatus.CREATED);

    }
}
