package com.alan.springbootlei.service;

import com.alan.springbootlei.dto.CreateOrderRequest;
import com.alan.springbootlei.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
