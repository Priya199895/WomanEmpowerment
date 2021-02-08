package com.example.demo.services;

import java.util.List;

import javax.transaction.Transactional
;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.UserDao;
import com.example.demo.dao.UserDaoImpl;
import com.example.demo.entity.Login;
import com.example.demo.entity.ResponseDTO;
import com.example.demo.entity.ResponseType;
import com.example.demo.entity.User;

@Service("womService")
public class UserServiceImpl implements UserService {
@Autowired
UserDaoImpl dao;


public void add(User r) {
	dao.add(r);
}

public User fetch(int id) {
	return dao.fetchUser(id);
}
@Transactional
public User verifyUser(Login login) {
	String username = login.getUsername();
	
	String password = login.getPassword();
	boolean flag = false;
	List<User> list = dao.fetchAll();
	for (User x : list) {
		System.out.println(x.getUsername());
		if (username.equals(x.getUsername()) && password.equals(x.getPassword()))
			return x;
	}
	return null;
}

@Transactional
public ResponseDTO confirmLogin(Login login) {
	ResponseDTO responseDTO = new ResponseDTO();
	try {
		User usr = dao.fetchUser(login);
		if (usr.getUsername().equals(login.getUsername()) && usr.getPassword().equals(login.getPassword())) {
			responseDTO.setResponseType(ResponseType.VERIFIED);
			responseDTO.setUsername(usr.getUsername());
			System.out.println("inside if");
			System.out.println(responseDTO.getUsername());
			return responseDTO;
		}
		else {
			System.out.println("incorrect details");
		}

		responseDTO.setResponseType(ResponseType.NOTVERIFIED);
		return responseDTO;
	} catch (Exception e) {
		e.printStackTrace();
		responseDTO.setResponseType(ResponseType.ERROR);
		return responseDTO;
	}
}

@Override
public List<User> fetchEach() {
	return dao.fetchAll();

}

}
