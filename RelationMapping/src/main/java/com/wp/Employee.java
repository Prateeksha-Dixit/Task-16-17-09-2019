package com.wp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	private int eno;
	private String ename;
	private double sal;
	
	@OneToOne
	private Laptop laptop;
	
	@OneToMany(mappedBy="employee")
	private List<Vehicle> vehicles=new ArrayList<Vehicle>();
	
	@ManyToMany
	private List<Project> projects=new ArrayList<Project>();
	
	
	

	
	public Employee(int eno, String ename, double sal, Laptop laptop, List<Vehicle> vehicles, List<Project> projects) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		this.laptop = laptop;
		this.vehicles = vehicles;
		this.projects = projects;
	}

	public Employee(int eno, String ename, double sal, List<Project> projects) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		this.projects = projects;
	}

	

	public Employee(int eno, String ename, double sal) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
	}

	public Employee(int eno, String ename, double sal, Laptop laptop) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		this.laptop = laptop;
	}

	public Employee() {
		super();
		
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	
	
	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public Employee(int eno) {
		super();
		this.eno = eno;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", sal=" + sal + ", laptop=" + laptop + "]";
	}
	
	
	
	
}
