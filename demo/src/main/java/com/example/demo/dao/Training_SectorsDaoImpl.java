package com.example.demo.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Training_Sectors;
import com.example.demo.exceptions.Training_SectorsException;


@Repository
public class Training_SectorsDaoImpl implements Training_SectorsDao {
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Training_Sectors> getAllTraining_Sectors() throws Training_SectorsException {
		String strQuery="Select ts from Training_Sectors ts";
		Query qry=manager.createQuery(strQuery);
		List<Training_Sectors> training_SectorsList=qry.getResultList();
		return training_SectorsList;
	}
	public List<Integer> getTraining_SectorsId() throws Training_SectorsException
	{
		String strQuery="Select ts.Training_Sector_Id from Training_Sectors ts";
		Query qry=manager.createQuery(strQuery);
		List<Integer> list=qry.getResultList();
		return list;

	}
	@Override
	public Training_Sectors insertTraining_Sectors(Training_Sectors ts) throws Training_SectorsException {
		manager.persist(ts);
		return ts;
	}

	@Override
	public void updateTraining_Sectors(Training_Sectors ts) throws Training_SectorsException {
		manager.merge(ts);
		
	}

	@Override
	public void deleteTraining_Sectors(int Training_Sectors_Id) throws Training_SectorsException {
		Training_Sectors temp=manager.find(Training_Sectors.class,Training_Sectors_Id);
		manager.remove(temp);
		
	}

}

