package com.alan.springbootlei.service;

import com.alan.springbootlei.dto.ProductRequest;
import com.alan.springbootlei.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
