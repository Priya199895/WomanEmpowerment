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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Training_Sectors;
import com.example.demo.exceptions.Training_SectorsException;
import com.example.demo.services.Training_SectorsService;


@CrossOrigin(origins = "*")//any url,any port,any server
@RestController
@RequestMapping("/api/training_sectors")
public class Training_SectorsController {

	@Autowired
	private Training_SectorsService service;
	
	//http://localhost:8080/api/training_sectors/getAllTraining_Sectors
		@GetMapping(value="/getAllTraining_Sectors", produces="application/json")
		public @ResponseBody List<Training_Sectors> getAllTraining_Sectors()
		{
			List<Training_Sectors> training_SectorsList=null;
			
			try {
				training_SectorsList=service.getAllTraining_Sectors();
			} catch (Training_SectorsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return training_SectorsList;
		}
		
		@GetMapping(value="/getTraining_SectorsId", produces="application/json")
		public @ResponseBody List<Integer> getTraining_SectorsId()
		{
			List<Integer> list=null;
			
			try {
				list=service.getTraining_SectorsId();
			} catch (Training_SectorsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
		}
		
		
		//http://localhost:8080/api/training_sectors/insertTraining_Sectors
		@PostMapping(value="/insertTraining_Sectors",consumes="application/json")
		public @ResponseBody Training_Sectors insertTraining_Sectors(@RequestBody Training_Sectors ts)
		{
			Training_Sectors temp =null;
			try {
				temp=service.insertTraining_Sectors(ts);
			} catch (Training_SectorsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return temp;
		}
		
		
		
		//http://localhost:8080/api/training_sectors/deleteTraining_Sectors/106
			@DeleteMapping(value="/deleteTraining_Sectors/{id}")
			public void deleteTraining_Sectors(@PathVariable int id)
			{
				
					try {
						service.deleteTraining_Sectors(id);
					} catch (Training_SectorsException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
			}
			
	
	
	//http://localhost:8080/api/training_sectors/updateTraining_Sectors
	@PutMapping(value="/updateTraining_Sectors")
	 public void updateNgo(@RequestBody Training_Sectors ts) 
	 {
		
		try {
			service.updateTraining_Sectors(ts);
		} catch (Training_SectorsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	
}








