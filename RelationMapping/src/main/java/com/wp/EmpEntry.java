package com.wp;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmpEntry {

	public static void main(String[] args) {
		
		Employee e1=new Employee(111,"AAA",50000,new Laptop("L111"));
		Employee e2=new Employee(112,"BBB",60000,new Laptop("L112"));
		Employee e3=new Employee(113,"CCC",70000,new Laptop("L113"));
		
		Session session=Util.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(e1); session.save(e2); session.save(e3);
		tr.commit();
		session.close();
		System.out.println("Employees Data Stored");

	}

}
