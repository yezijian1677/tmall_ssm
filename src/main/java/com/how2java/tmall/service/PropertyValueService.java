package com.how2java.tmall.service;

import com.how2java.tmall.pojo.Product;
import com.how2java.tmall.pojo.PropertyValue;

import java.util.List;

public interface PropertyValueService {

    void init(Product product);

    void update(PropertyValue value);

    PropertyValue get(Integer ptid, Integer pid);

    List<PropertyValue> list(Integer cid);
}
