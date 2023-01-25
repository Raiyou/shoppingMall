package com.alan.springbootlei.service;

import com.alan.springbootlei.dto.CreateOrderRequest;
import com.alan.springbootlei.dto.OrderQueryParams;
import com.alan.springbootlei.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
