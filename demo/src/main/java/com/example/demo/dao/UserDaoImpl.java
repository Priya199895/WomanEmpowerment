package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.data.mapping.AccessOptions.SetOptions.Propagation;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Login;
import com.example.demo.entity.User;
@Repository
public class UserDaoImpl {
@PersistenceContext
public EntityManager manager;
@Transactional
public void add(User r) {
	manager.persist(r);
	System.out.println("record added");
}

public User fetchUser(Login login) {
	Query query = manager.createQuery(
			"Select user from User as user where user.username=:username and user.password=:password ");
	query.setParameter("username", login.getUsername());
	query.setParameter("password", login.getPassword());
	if(query.getSingleResult()!=null)
	return (User) query.getSingleResult();
	else 
		return null;
}
@Transactional
public List<User> fetchAll() {
	Query q = manager.createQuery("select obj from User as obj");
	return q.getResultList();
}
public User fetchUser(int id) {
	return manager.find(User.class, id);

}


}

