package model;

import org.hibernate.Session;
import org.hibernate.Transaction;

import app1.Util;


public class Manager1 

{
	public static void main (String args[])
	{
		Session s1 = Util.getconnection();
		Transaction tx = s1.beginTransaction();
		Person s2 = new Person();
		s2.setId(01);
		s2.setFname("Sachin");
		s2.setLname("Paul");
		s2.setAge(23);
		
		Person s3 = new Person();
		s3.setId(02);
		s3.setFname("Namrata");
		s3.setLname("Malhotra");
		s3.setAge(20);
		
		s1.save(s2);
		tx.commit();
		tx=s1.beginTransaction();
		int i = (Integer)s1.save(s3);
		System.out.println(i);
		
		tx.commit();
		s1.flush();
		s1.close();
		System.out.println("Done");
	}

}
