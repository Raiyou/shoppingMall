package com.alan.springbootlei.dao;


import com.alan.springbootlei.constant.ProductCategory;
import com.alan.springbootlei.dto.ProductRequest;
import com.alan.springbootlei.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
