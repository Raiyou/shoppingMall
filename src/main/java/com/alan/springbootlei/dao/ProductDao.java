package com.alan.springbootlei.dao;


import com.alan.springbootlei.dto.ProductRequest;
import com.alan.springbootlei.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
