package com.product.Backend_Solar.ServiceImplementation;

import com.product.Backend_Solar.Entity.Product;
import com.product.Backend_Solar.Repository.ProductRepo;
import com.product.Backend_Solar.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;
    public Product addNewProduct(Product product){

        return productRepo.save(product);

    }



}
