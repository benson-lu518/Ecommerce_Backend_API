package com.bensonlu.ecommercebackendapi.dao;

import com.bensonlu.ecommercebackendapi.model.Order;
import com.bensonlu.ecommercebackendapi.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Order getOrderById(Integer order);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);

    Integer createOrder(Integer userId,Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}
