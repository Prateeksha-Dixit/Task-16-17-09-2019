package com.wp;

import java.util.List;

import org.hibernate.Session;

public class SearchEmp {

	public static void main(String[] args) {
		
		Session session=Util.getSF().openSession();
		Employee emp=session.get(Employee.class, 111);
		System.out.println(emp.getEno());
		System.out.println(emp.getEname());
		System.out.println(emp.getSal());
		System.out.println(emp.getLaptop().getLcode());
		System.out.println(emp.getLaptop().getBrand());
		System.out.println(emp.getLaptop().getPrice());
		List<Vehicle> vehicles=emp.getVehicles();
		for(Vehicle v:vehicles)
		{
			System.out.println(v.getVname());
		}
		
		List<Project> projects=emp.getProjects();
		for(Project p:projects)
		{
			System.out.println(p.getPtitle());
		}
		
		session.close();

	}

}
