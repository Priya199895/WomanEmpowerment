package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Login;
import com.example.demo.entity.ResponseDTO;
import com.example.demo.entity.User;


public interface UserService {

public void add(User r);

public User fetch(int id);

public User verifyUser(Login login);

public ResponseDTO confirmLogin(Login login);

public List<User> fetchEach();


}
