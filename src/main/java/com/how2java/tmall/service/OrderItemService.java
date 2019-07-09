package com.how2java.tmall.service;

import com.how2java.tmall.pojo.Order;
import com.how2java.tmall.pojo.OrderItem;

import java.util.List;

public interface OrderItemService {

    void add(OrderItem c);

    void delete(Integer id);

    void update(OrderItem c);

    OrderItem get(Integer id);

    List list();

    void fill(List<Order> os);

    void fill(Order order);

    int getSaleCount(Integer cid);

    List<OrderItem> listByUser(Integer uid);
}
