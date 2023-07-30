package oneToOneRelation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
public static void main(String[] args) {
	Configuration config=new Configuration();
	config.configure("hibernate.cfg.xml");
	config.addAnnotatedClass(User.class);
	config.addAnnotatedClass(Vehicle.class);
	SessionFactory sessionFactory=config.buildSessionFactory();
	Session session=sessionFactory.openSession();
	Transaction tx=session.beginTransaction();
	User user=new User();
	Vehicle veh=new Vehicle();
	user.setUsername("Lavanya");
	veh.setVehiclename("scarpio");
	
	session.save(veh);
	user.setVehicle(veh);
	session.save(user);
	tx.commit();
	
}
}
