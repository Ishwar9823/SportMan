package com.cg.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.Dao.sportManDao;
import com.cg.entity.SportMan;
import com.cg.repository.Repository1;

@Service
public class ServiceSport implements sportManDao {
	
	@Autowired
	private Repository1 dao;


	public String addDetails(SportMan sport) {
		// TODO Auto-generated method stub
		dao.save(sport);
		return "Added Successfully";
	}


	public List<SportMan> getDetails() {
		// TODO Auto-generated method stub
		
		return dao.findAll();
	}

}
