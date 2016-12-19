/**
 * 
 */
/**
 * @author vicky_000
 *
 */
package Configuration;


import model.Person;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

class configuration
{

	 public static void main(String args[])
	 {
		 Configuration cfg=new Configuration();
		 cfg.configure("hibernate.cfg.xml");
		 SessionFactory sf=cfg.buildSessionFactory();
		 Session s1=sf.openSession();
		 Transaction tx=s1.beginTransaction();
				 Person m1=new Person();
				 	m1.setAge(25);
				 	m1.setFname("fname");
				 	m1.setLname("lname");
		 s1.save(m1);
		 tx.commit();
		 s1.flush();
		 s1.close();
		 
		 
		 
		 
	 }
	 
}