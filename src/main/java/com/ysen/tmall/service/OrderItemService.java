package com.ysen.tmall.service;

import com.ysen.tmall.entity.Order;
import com.ysen.tmall.entity.OrderItem;

import java.util.List;

public interface OrderItemService {

    void add(OrderItem c);

    void delete(int id);

    void update(OrderItem c);

    OrderItem get(int id);

    List list();

    void fill(List<Order> os);

    void fill(Order o);

}