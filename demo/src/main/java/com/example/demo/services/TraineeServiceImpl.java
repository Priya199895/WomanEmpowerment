package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dao.TraineeDao;
import com.example.demo.entity.Trainee;
import com.example.demo.entity.Training_Trainee;
import com.example.demo.exceptions.TraineeException;


@Service
public class TraineeServiceImpl implements TraineeService {

	@Autowired
	private TraineeDao dao;
	
	@Override
	public List<Trainee> getAllTrainees() throws TraineeException {
		return dao.getAllTrainees();
	}

	@Transactional
	@Override
	public Trainee insertTrainee(Training_Trainee trainee) throws TraineeException {
		return dao.insertTrainee(trainee);
	}

	@Transactional
	@Override
	public void updateTrainee(Trainee trainee) throws TraineeException {
		 dao.updateTrainee(trainee);
		
	}

	@Transactional
	@Override
	public void deleteTrainee(int Trainee_Id) throws TraineeException {
		dao.deleteTrainee(Trainee_Id);
		
	}
	
	public List<Trainee> fetch(String uname) {
		return dao.fetch(uname);
	}

}

