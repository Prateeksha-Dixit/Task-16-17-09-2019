package com.wp;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class LaptopEntry {

	public static void main(String[] args) {
		Laptop l1=new Laptop("L111","HCL",40000);
		Laptop l2=new Laptop("L112","HP",50000);
		Laptop l3=new Laptop("L113","Sony",60000);
		
		Session session=Util.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(l1); session.save(l2); session.save(l3);
		tr.commit();
		session.close();
		
		System.out.println("Laptop Details Stored");

	}

}
