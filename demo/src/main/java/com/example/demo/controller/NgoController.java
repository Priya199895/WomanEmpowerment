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

import com.example.demo.entity.Ngo;
import com.example.demo.exceptions.NgoException;
import com.example.demo.services.NgoService;


@CrossOrigin(origins = "*")//any url,any port,any server
@RestController
@RequestMapping("/api/ngo")
public class NgoController {

	@Autowired
	private NgoService service;
	
	//http://localhost:8080/api/ngo/getAllNgos
	@GetMapping(value="/getAllNgos", produces="application/json")
	public @ResponseBody List<Ngo> getAllNgo()
	{
		List<Ngo> ngoList=null;
		try {
			ngoList=service.getAllNgos();
		} catch (NgoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ngoList;
	}
	
	
	
	//http://localhost:8080/api/ngo/insertNgo
	@PostMapping(value="/insertNgo",consumes="application/json")
	public @ResponseBody Ngo insertNgo(@RequestBody Ngo ngo)
	{
		Ngo ngotemp=null;
		try {
			ngotemp=service.insertNgo(ngo);
		} catch (NgoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ngotemp;
	}
	
	
	//http://localhost:8080/api/ngo/deleteNgo/5556
			@DeleteMapping(value="/deleteNgo/{id}")
			public void deleteNgo(@PathVariable int id)
			{
				try {
					service.deleteNgo(id);
				} catch (NgoException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
	
	
	//http://localhost:8080/api/ngo/updateNgo
	@PutMapping(value="/updateNgo")
	 public void updateNgo(@RequestBody Ngo ngo) 
	 {
		
		try {
			service.updateNgo(ngo);
		} catch (NgoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	
	
	
	

}



