package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Ngo;
import com.example.demo.exceptions.NgoException;


public interface NgoDao {
	
	public abstract List<Ngo> getAllNgos() throws NgoException;
	public abstract Ngo insertNgo(Ngo ngo) throws NgoException;
	public abstract void updateNgo(Ngo ngo) throws NgoException;
	public abstract void deleteNgo(int Ngo_Id) throws NgoException;
}
