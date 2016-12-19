package app1;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import org.hibernate.service.ServiceRegistry;





public class Util 
{
	private static SessionFactory sf;
	

	static
	{
		Configuration c1=new Configuration();
		c1.configure("model.cfg.xml");
		ServiceRegistry sr= new StandardServiceRegistryBuilder().applySettings(c1.getProperties()).build();
		
	     SessionFactory sf=c1.buildSessionFactory();
	   
	}


	public static Session getconnection()
	{
		Session s1 = sf.openSession();
		
			return s1;
		
	
	}
}