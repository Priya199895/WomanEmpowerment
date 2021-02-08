package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Trainee;
import com.example.demo.entity.Training_Trainee;
import com.example.demo.exceptions.TraineeException;



public interface TraineeService {
	public abstract List<Trainee> fetch(String uname) throws TraineeException;
	public abstract List<Trainee> getAllTrainees() throws TraineeException;
	public abstract Trainee insertTrainee(Training_Trainee trainee) throws TraineeException;
	public abstract void updateTrainee(Trainee trainee) throws TraineeException;
	public abstract void deleteTrainee(int Trainee_Id) throws TraineeException;
}
