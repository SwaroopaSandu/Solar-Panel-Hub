package com.product.Backend_Solar.Repository;


import com.product.Backend_Solar.Entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends CrudRepository<Product,Integer> {


}
