package com.alan.springbootlei.service;

import com.alan.springbootlei.dto.CreateOrderRequest;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
