package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Trainee;
import com.example.demo.entity.Training_Sectors;
import com.example.demo.entity.Training_Trainee;
import com.example.demo.exceptions.TraineeException;


@Repository
public class TraineeDaoImpl implements TraineeDao{
	

	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Trainee> getAllTrainees() throws TraineeException {
		String strQuery="from Trainee";
//		manager.getTransaction().begin();
		Query qry=manager.createQuery(strQuery);
		List<Trainee> traineeList=qry.getResultList();
//		manager.getTransaction().commit();
		System.out.println(traineeList);
		return traineeList;
	}
	

	@Override
	public Trainee insertTrainee(Training_Trainee trainee) throws TraineeException {
	//manager.getTransaction().begin();
		int id = trainee.getTraining_id();
		Training_Sectors t=manager.find(Training_Sectors.class, id);
		Trainee joinee = new Trainee();
		joinee.setTraining_sectors(t);
   joinee.setAddress(trainee.getAddress());
   joinee.setAgeProof(trainee.getAgeProof());
   joinee.setChildAge(trainee.getChildAge());
   joinee.setContactNo(trainee.getContactNo());
   joinee.setDob(trainee.getDob());
   joinee.setEmail(trainee.getEmail());
   joinee.setNoOfChildren(trainee.getNoOfChildren());
   joinee.setPhysicallyChallenged(trainee.getPhysicallyChallenged());
   joinee.setStatus(trainee.getStatus());
  joinee.setMarriageStatus(trainee.getMarriageStatus());
  joinee.setName(trainee.getName());
		manager.persist(joinee);
		//manager.getTransaction().commit();
		return joinee;
	}

	@Override
	public void updateTrainee(Trainee trainee) throws TraineeException {
		manager.merge(trainee);
		
	}

	@Override
	public void deleteTrainee(int Trainee_Id) throws TraineeException {
		Trainee temp=manager.find(Trainee.class,Trainee_Id);
		
	}
	public List<Trainee> fetch(String username) {
		String str = "select t from Trainee t where t.Email=:uname";
		Query query =manager.createQuery(str);
		query.setParameter("uname", username);
		return query.getResultList();
		
	}

}
