package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.User;

public interface UserDao {
public void add(User r);

public User fetchUser(int id);

public List<User> fetchAll();

public User fetchUser(User login);

}
