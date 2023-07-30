package hibernateUpdateQuery;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class MainApp {
public static void main(String[] args) {
	Configuration config=new Configuration();
	config.configure("hibernate.cfg.xml");
	config.addAnnotatedClass(Product.class);
	SessionFactory sessionFactory=config.buildSessionFactory();
	Session session=sessionFactory.openSession();
	Transaction tx=session.beginTransaction();
	Query<Product> que=session.createQuery("update Product set pprice=:n where id=:i");
	que.setParameter("n", 45000.85);
	que.setParameter("i", 4);
	int status=que.executeUpdate();
	System.out.println(status);
	tx.commit();
	Transaction tx1= session.beginTransaction();
	Query<Product> query=session.createQuery("from Product");  
	List<Product> list=query.list();
    //System.out.println(list);
	
	Iterator<Product> itob=list.iterator();
	System.out.println("pid\tpname\tpprice");
    while(itob.hasNext()) {
    	//System.out.println(itob.next());
    	Product pr=itob.next();
    	System.out.println(pr.getProductid()+"\t"+pr.getProductname()+"\t"+pr.getProductprice());
    	
    }
    tx1.commit();

}
}
