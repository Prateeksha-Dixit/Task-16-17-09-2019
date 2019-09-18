package com.wp;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmpEntry {

	public static void main(String[] args) {
		
		Employee e1=new Employee(111,"AAA",50000,new Laptop("L111"));
		e1.getVehicles().add(new Vehicle(1));e1.getProjects().add(new Project("p111"));
		e1.getVehicles().add(new Vehicle(2));e1.getProjects().add(new Project("p112"));
		e1.getVehicles().add(new Vehicle(3));e1.getProjects().add(new Project("p113"));
		
		
		Session session=Util.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(e1); 
		tr.commit();
		session.close();
		System.out.println("Employees Data Stored");

	}

}
