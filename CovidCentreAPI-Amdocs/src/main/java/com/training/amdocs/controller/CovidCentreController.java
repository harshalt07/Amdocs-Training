package com.training.amdocs.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.amdocs.dao.CentreDaoImpl;
import com.training.amdocs.pojo.CovidCentre;

@RestController
public class CovidCentreController {
	@Autowired
	private CentreDaoImpl centreDao;
	
	public CovidCentreController() {
		System.out.println("in ctor of " + getClass());
	}
	
	@GetMapping("/allCentres")
	public ResponseEntity<?> getAllCentres() {
		System.out.println("get all centres");
		return new ResponseEntity<>(centreDao.getAllCentres(), HttpStatus.OK);
	}
	
	@GetMapping("/allCentres/{pincode}")
	public ResponseEntity<?> getCentreByPincode(@PathVariable int pinCode) {
		System.out.println("get  Covid centre by pincode");
		return new ResponseEntity<>(centreDao.getCovidCentre(pinCode), HttpStatus.OK);
	}
	
	@PostMapping("/addCentre")
	public ResponseEntity<?> addCentre(@RequestBody CovidCentre abc ){
		System.out.println(" add new Covid Centre");
		return new ResponseEntity<>(centreDao.addCovidCentre(abc), HttpStatus.CREATED);
	}
	
	

}

