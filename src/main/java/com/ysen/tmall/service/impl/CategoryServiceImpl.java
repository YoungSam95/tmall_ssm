package com.ysen.tmall.service.impl;

import com.ysen.tmall.entity.Category;
import com.ysen.tmall.mapper.CategoryMapper;
import com.ysen.tmall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryMapper categoryMapper;

    public List<Category> list(){
        return categoryMapper.list();
    }
}
