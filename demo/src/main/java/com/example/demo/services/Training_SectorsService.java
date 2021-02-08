package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Training_Sectors;
import com.example.demo.exceptions.Training_SectorsException;


public interface Training_SectorsService {
	public abstract List<Training_Sectors> getAllTraining_Sectors() throws Training_SectorsException;
	public abstract Training_Sectors insertTraining_Sectors(Training_Sectors ts) throws Training_SectorsException;
	public abstract void updateTraining_Sectors(Training_Sectors ts) throws Training_SectorsException;
	public abstract void deleteTraining_Sectors(int Training_Sectors_Id) throws Training_SectorsException;
	public abstract List<Integer> getTraining_SectorsId() throws Training_SectorsException;

}
