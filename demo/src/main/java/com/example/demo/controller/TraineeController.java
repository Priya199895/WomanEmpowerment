package com.example.demo.controller;


import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Trainee;
import com.example.demo.entity.Training_Trainee;
import com.example.demo.exceptions.TraineeException;
import com.example.demo.services.TraineeService;


@CrossOrigin(origins = "*")//any url,any port,any server
@RestController
@RequestMapping("/api/trainee")
public class TraineeController {
	
	@Autowired
	private TraineeService service;
	
	
			//http://localhost:8080/api/trainee/getAllTrainees
			@GetMapping(value="/getAllTrainees", produces="application/json")
			public @ResponseBody List<Trainee> getAllTrainees()
			{
				List<Trainee> traineeList=null;
				try {
					traineeList=service.getAllTrainees();
				} catch (TraineeException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return traineeList;
			}
			
			//http://localhost:8080/api/trainee/insertTrainee
			@PostMapping(value="/insertTrainee",consumes="application/json")
			public @ResponseBody Trainee insertTrainee(@RequestBody Training_Trainee trainee)
			{
				Trainee temp=null;
				try {
					 temp=service.insertTrainee(trainee);
				} catch (TraineeException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return temp;
			}
			
			
			//http://localhost:8080/api/trainee/deleteTrainee/14
			@DeleteMapping(value="/deleteTrainee/{id}")
			public void deleteTrainee(@PathVariable int id)
			{
				try {
					service.deleteTrainee(id);
				} catch (TraineeException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			
			//http://localhost:8080/api/trainee/updateTrainee
			@PutMapping(value="/updateTrainee")
			 public void updateNgo(@RequestBody Trainee trainee) 
			 {
				
				try {
					service.updateTrainee(trainee);
				} catch (TraineeException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
			
			@RequestMapping(path = "/login/{username}", method = RequestMethod.GET)
			public List<Trainee> fetch(@PathVariable("username") String uname) throws TraineeException {
				return service.fetch(uname);
			}
			
}
