package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.NgoDao;
import com.example.demo.entity.Ngo;
import com.example.demo.exceptions.NgoException;



@Service
public class NgoServiceImpl implements NgoService{
	
	@Autowired
	private NgoDao dao;
	
	@Override
	public List<Ngo> getAllNgos() throws NgoException {
		return dao.getAllNgos();
	}
	

	@Transactional
	@Override
	public Ngo insertNgo(Ngo ngo) throws NgoException {
		//return dao.insertNgo(ngo);
		//Ngo ngo1=ngo;
		Ngo temp=dao.insertNgo(ngo);
		return temp;
		//if(temp==null||)
	}

	@Transactional
	@Override
	public void updateNgo(Ngo ngo) throws NgoException {
		dao.updateNgo(ngo);
	}

	@Transactional
	@Override
	public void deleteNgo(int Ngo_Id) throws NgoException {
		dao.deleteNgo(Ngo_Id);
		
	}

	
	
	




}







