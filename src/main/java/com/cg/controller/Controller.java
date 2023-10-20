package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.SportMan;
import com.cg.service.ServiceSport;


@RestController
public class Controller {
	
	
	
	@Autowired
	private ServiceSport s;
	
	
	@PostMapping("/add")
	public String addDetails(@RequestBody SportMan sport) {
		return s.addDetails(sport);
	}
	
	@GetMapping("/get")
	public List<SportMan> getDetails(){
		return s.getDetails();
	}
}
