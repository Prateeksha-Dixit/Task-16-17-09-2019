package com.wp;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class VehicleEntry {

	public static void main(String[] args) {
		
		Vehicle v1=new Vehicle(1,"Honda","1",new Employee(111));
		Vehicle v2=new Vehicle(2,"Hero","2",new Employee(112));
		Vehicle v3=new Vehicle(3,"KTM","3",new Employee(113));
	
		
		
		
		Session session=Util.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(v1); session.save(v2); session.save(v3);
		
		tr.commit();
		session.close();
		System.out.println("VEHICLES STORED SUCCESSFULLY");

	}

}
