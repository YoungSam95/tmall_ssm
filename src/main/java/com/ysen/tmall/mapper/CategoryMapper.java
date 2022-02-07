package com.ysen.tmall.mapper;

import com.ysen.tmall.entity.Category;
import com.ysen.tmall.util.Page;

import java.util.List;

public interface CategoryMapper {

    public List<Category> list(Page page);

    public int total();
}
