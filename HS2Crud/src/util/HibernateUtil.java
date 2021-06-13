package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil { 	

	private static SessionFactory sessionFactory;  
	private static SessionFactory  createSessionFactory() {  
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		sessionFactory=con.buildSessionFactory();
		return sessionFactory;
	}
	public static SessionFactory getSessionFactory() {  
		if(sessionFactory == null) sessionFactory = createSessionFactory();  
		return sessionFactory;  
	}  
}
