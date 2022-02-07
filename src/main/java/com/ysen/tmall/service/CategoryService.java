package com.ysen.tmall.service;

import com.ysen.tmall.entity.Category;
import com.ysen.tmall.util.Page;

import java.util.List;

public interface CategoryService {

    int total();
    List<Category> list(Page page);
}
