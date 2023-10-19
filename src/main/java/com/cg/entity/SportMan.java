package com.cg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SportMan {
	@Id
	private int sportMan_id;
	private String sport_Name;
	private String sport_Salary;

	public SportMan() {
		
	}

	public SportMan(int sportMan_id, String sport_Name, String sport_Salary) {
		super();
		this.sportMan_id = sportMan_id;
		this.sport_Name = sport_Name;
		this.sport_Salary = sport_Salary;
	}

	public int getSportMan_id() {
		return sportMan_id;
	}

	public void setSportMan_id(int sportMan_id) {
		this.sportMan_id = sportMan_id;
	}

	public String getSport_Name() {
		return sport_Name;
	}

	public void setSport_Name(String sport_Name) {
		this.sport_Name = sport_Name;
	}

	public String getSport_Salary() {
		return sport_Salary;
	}

	public void setSportName_Salary(String sport_Salary) {
		this.sport_Salary = sport_Salary;
	}

	@Override
	public String toString() {
		return "SportMan [sportMan_id=" + sportMan_id + ", sport_Name=" + sport_Name + ", sportName_Salary="
				+ sport_Salary + "]";
	}
	
	
	
}
