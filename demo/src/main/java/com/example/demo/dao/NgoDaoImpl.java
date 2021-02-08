package com.example.demo.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Ngo;
import com.example.demo.exceptions.NgoException;


@Repository
public class NgoDaoImpl implements NgoDao {
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Ngo> getAllNgos() throws NgoException {
		String strQuery="from Ngo";
		Query qry=manager.createQuery(strQuery);
		List<Ngo> ngoList=qry.getResultList();
		return ngoList;
	}

	@Override
	public Ngo insertNgo(Ngo ngo) throws NgoException{
		manager.persist(ngo);
		return ngo;
	}

	@Override
	public void updateNgo(Ngo ngo) throws NgoException {
		manager.merge(ngo);
	}

	@Override
	public void deleteNgo(int Ngo_Id) throws NgoException {
		
		Ngo ngotemp=manager.find(Ngo.class,Ngo_Id);
		manager.remove(ngotemp);
	}
}

