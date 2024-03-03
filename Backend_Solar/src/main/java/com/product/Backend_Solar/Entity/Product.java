package com.product.Backend_Solar.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productId;
    private String productName;

    private String productDescription;

    private String productSize;

    private String productModule;

    private String productInvertor;

    private String productRacking;


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductSize() {
        return productSize;
    }

    public void setProductSize(String productSize) {
        this.productSize = productSize;
    }

    public String getProductModule() {
        return productModule;
    }

    public void setProductModule(String productModule) {
        this.productModule = productModule;
    }

    public String getProductInvertor() {
        return productInvertor;
    }

    public void setProductInvertor(String productInvertor) {
        this.productInvertor = productInvertor;
    }

    public String getProductRacking() {
        return productRacking;
    }

    public void setProductRacking(String productRacking) {
        this.productRacking = productRacking;
    }


    public Product(int productId, String productName, String productDescription, String productSize, String productModule, String productInvertor, String productRacking) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productSize = productSize;
        this.productModule = productModule;
        this.productInvertor = productInvertor;
        this.productRacking = productRacking;
    }


    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", productSize='" + productSize + '\'' +
                ", productModule='" + productModule + '\'' +
                ", productInvertor='" + productInvertor + '\'' +
                ", productRacking='" + productRacking + '\'' +
                '}';
    }





}
