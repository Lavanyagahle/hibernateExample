package com.edu;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		// Configuration
		 Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many times do you want to add product");
		 int num=sc.nextInt();
		 sc.nextLine();
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Product.class);
		//config.addAnnotatedClass(Customer.class);

		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		//Product product=new Product();
		  
		  for(int i=1;i<=num;i++) { System.out.println("Enter product name: ");
		  String productname=sc.nextLine(); 
		  sc.nextLine();
		  System.out.println("Enter product price");
		  float productprice=sc.nextFloat(); //
		  sc.nextLine(); 
		  Product product=new Product();
		  product.setProductname(productname);
		  product.setProductprice(productprice);
		  session.save(product);
		  
		  }
		 
			/*
			 * product.setProductname("smart watch"); product.setProductprice(4550.00f);
			 * Customer cs=new Customer(); cs.setCustomername("prem");
			 * cs.setCustomeremail("prem@gmail.com"); session.save(cs);
			 * session.save(product);//product is in transient
			 */ 
		 tx.commit();
		session.close();
		// sc.close();

	}
}
