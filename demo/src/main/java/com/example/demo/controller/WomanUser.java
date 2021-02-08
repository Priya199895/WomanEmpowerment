package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Login;
import com.example.demo.entity.ResponseDTO;
import com.example.demo.entity.User;
import com.example.demo.services.UserService;
import com.example.demo.services.UserServiceImpl;
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/vi")
public class WomanUser {
@Autowired
private UserServiceImpl userService;

@PostMapping(value="/add", consumes="application/json")
public void add(@RequestBody User r) {
	userService.add(r);
}
@RequestMapping(path = "/user/{id}", method = RequestMethod.GET)
public User fetch(@PathVariable("id") int id) {
	return userService.fetch(id);
}
//
//@CrossOrigin
//@RequestMapping(path = "/userlogin/verifyuser", method = RequestMethod.POST)
//public String verifyUser(@RequestBody User login) {
//	User user = userService.verifyUser(login);
//	if (user != null) {
//		return "{\"status\" : \"" + user.getName() + " you are logged in  Successfully!\"}";
//	} else {
//		return "{\"status\" : \"Sorry Your Details are incorrect!\"}";
//	}
//}

@CrossOrigin
@RequestMapping(path = "/userVerify/verify", method = RequestMethod.POST)
public ResponseDTO verify(@RequestBody Login login) {
	
	ResponseDTO responseDTO = userService.confirmLogin(login);
	return responseDTO;
}

@RequestMapping(path = "/user/fetch", method = RequestMethod.GET)
public List<User> fetchAll() {
	List<User> list = userService.fetchEach();
	return list;
}

}
