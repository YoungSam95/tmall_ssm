package com.ysen.tmall.service.impl;

import com.ysen.tmall.entity.User;
import com.ysen.tmall.entity.UserExample;
import com.ysen.tmall.mapper.UserMapper;
import com.ysen.tmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public void add(User u) {
        userMapper.insert(u);
    }

    @Override
    public void delete(int id) {
        userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(User u) {
        userMapper.updateByPrimaryKeySelective(u);
    }

    @Override
    public User get(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public List<User> list(){
        UserExample example =new UserExample();
        example.setOrderByClause("id desc");
        return userMapper.selectByExample(example);

    }

}
