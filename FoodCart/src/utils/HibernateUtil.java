package utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

@SuppressWarnings("deprecation")
public class HibernateUtil {
	static SessionFactory sessionFactory;
	
	public static Session getSession(){
		sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		return session;
	}
}
