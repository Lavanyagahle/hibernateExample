package com.hibernateExample1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class MainApp {
public static void main(String[] args) {
	Configuration config=new Configuration();
	config.configure("hibernate.cfg.xml");
	config.addAnnotatedClass(Department.class);
	SessionFactory sf=config.buildSessionFactory();
	Session session=sf.openSession();
	Transaction ts=session.beginTransaction();
	Department dp=new Department();//Trancient state
	dp.setName("Management Department");
	dp.setAddress("Pune");//till here Trancient stage
	session.save(dp);// this it is in persistant state means permantly store data
	//session.delete(dp);//delete state
	ts.commit();
	session.close();//detatched

	/*
	 * Department dp1=new Department(); dp1.setName("Management Department");
	 * dp1.setAddress("Pune"); session.save(dp1);
	 */	
}
}
