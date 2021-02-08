package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Training_Sectors;
import com.example.demo.exceptions.Training_SectorsException;

public interface Training_SectorsDao {
	public abstract List<Integer> getTraining_SectorsId() throws Training_SectorsException;

	public Training_Sectors insertTraining_Sectors(Training_Sectors ts) throws Training_SectorsException;
		public List<Training_Sectors> getAllTraining_Sectors() throws Training_SectorsException ;
		public void updateTraining_Sectors(Training_Sectors ts) throws Training_SectorsException;
		public void deleteTraining_Sectors(int Training_Sectors_Id) throws Training_SectorsException;}
