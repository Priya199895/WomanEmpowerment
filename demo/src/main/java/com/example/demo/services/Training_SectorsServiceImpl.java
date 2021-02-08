package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.Training_SectorsDao;
import com.example.demo.dao.Training_SectorsDaoImpl;
import com.example.demo.entity.Training_Sectors;
import com.example.demo.exceptions.Training_SectorsException;


@Service
public class Training_SectorsServiceImpl  implements Training_SectorsService{

	@Autowired
	private Training_SectorsDao dao;
	
	@Override
	public List<Training_Sectors> getAllTraining_Sectors() throws Training_SectorsException {
		return dao.getAllTraining_Sectors();
	}
	public List<Integer> getTraining_SectorsId() throws Training_SectorsException {
		return dao.getTraining_SectorsId();
	}
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	@Override
	public Training_Sectors insertTraining_Sectors(Training_Sectors ts) throws Training_SectorsException {
		// TODO Auto-generated method stub
		return dao.insertTraining_Sectors(ts);
	}
	
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	@Override
	public void updateTraining_Sectors(Training_Sectors ts) throws Training_SectorsException {
		// TODO Auto-generated method stub
		dao.updateTraining_Sectors(ts);
	}
	
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	@Override
	public void deleteTraining_Sectors(int Training_Sectors_Id) throws Training_SectorsException {
		// TODO Auto-generated method stub
		dao.deleteTraining_Sectors(Training_Sectors_Id);
	}

}
