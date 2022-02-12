package com.ysen.tmall.service;

import com.ysen.tmall.entity.Product;
import com.ysen.tmall.entity.PropertyValue;

import java.util.List;

public interface PropertyValueService {

    void init(Product p);

    void update(PropertyValue pv);

    PropertyValue get(int ptid, int pid);

    List<PropertyValue> list(int pid);
}
