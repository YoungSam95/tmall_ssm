package com.ysen.tmall.service;

import com.ysen.tmall.entity.User;

import java.util.List;

public interface UserService {

    void add(User c);

    void delete(int id);

    void update(User c);

    User get(int id);

    List list();

    boolean isExist(String name);
}
