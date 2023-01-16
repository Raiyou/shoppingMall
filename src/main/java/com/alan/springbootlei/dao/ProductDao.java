package com.alan.springbootlei.dao;


import com.alan.springbootlei.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

}
