package com.alan.springbootlei.dao;


import com.alan.springbootlei.dto.ProductQueryParams;
import com.alan.springbootlei.dto.ProductRequest;
import com.alan.springbootlei.model.Product;

import java.util.List;

public interface ProductDao {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
