package com.cg.Dao;

import java.util.List;

import com.cg.entity.SportMan;

public interface sportManDao {
	
	public String addDetails(SportMan sport);
	
	public List<SportMan> getDetails();
}
