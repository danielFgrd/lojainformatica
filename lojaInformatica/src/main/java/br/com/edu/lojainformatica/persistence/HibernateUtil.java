package package br.com.edu.lojainformatica.persistence;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import br.edu.com.lojainformatica.model.*;

public class HibernateUtil {

	
	private static final SessionFactory factory = buildSessionFactory(); 
	
	private static SessionFactory buildSessionFactory() {
			
		Configuration configuration = new Configuration();
		
		//pacote onde ficam as classes que representam entidades
		configuration.addAnnotatedClass(Cliente.class);
		configuration.addAnnotatedClass(Hardware.class);
		configuration.addAnnotatedClass(Vendas.class);
		
		configuration.configure();
		
		return configuration.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		
		return factory;
	}
	
}
