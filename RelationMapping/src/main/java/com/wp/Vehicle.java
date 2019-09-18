package com.wp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle {
	@Id
	private int vcode;
	private String vname;
	private String duration;
	
	@ManyToOne
	private Employee employee;
	
	

	public Vehicle() {
		super();
	
	}
	
	

	
	public Vehicle(int vcode) {
		super();
		this.vcode = vcode;
	}




	public Vehicle(int vcode, String vname, String duration) {
		super();
		this.vcode = vcode;
		this.vname = vname;
		this.duration = duration;
	}


	public Vehicle(int vcode, String vname, String duration, Employee employee) {
		super();
		this.vcode = vcode;
		this.vname = vname;
		this.duration = duration;
		this.employee = employee;
	}

	public int getVcode() {
		return vcode;
	}

	public void setVcode(int vcode) {
		this.vcode = vcode;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	@Override
	public String toString() {
		return "Vehicle [vcode=" + vcode + ", vname=" + vname + ", duration=" + duration + "]";
	}
	
	
	
	
	
	

}
