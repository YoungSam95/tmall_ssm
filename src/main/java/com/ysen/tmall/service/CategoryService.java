package com.ysen.tmall.service;

import com.ysen.tmall.entity.Category;
import com.ysen.tmall.util.Page;

import java.util.List;

public interface CategoryService {

    List<Category> list();

    void add(Category category);

    void delete(int id);

    Category get(int id);

    void update(Category category);
}
