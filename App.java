package com.hibernate.hibernateproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		// creating a Hibernate configuration and session factory
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		// creating session
		Session session = sessionFactory.openSession();

		try { //writing code in try catch block to handle exceptions that might disrupts the normal flow of program
			// begin transaction
			session.beginTransaction();

			// creating object of customer class
			Customer customer = new Customer(1, "dhruv");
			// creating object of product class
			Product product = new Product(102, "electronicsmy", customer);

			// Save the Customer and product	
			session.save(customer);
			session.save(product);

			// commit the transaction
			session.getTransaction().commit();

			//fetching the data by id 
			Product fetchedProduct = session.get(Product.class, 102);
			System.out.println("Product Name: " + fetchedProduct.getPname());
			System.out.println("Customer Name: " + fetchedProduct.getCustomer().getCname());
		} catch (Exception e) {
			e.printStackTrace();
			// rollback the transaction in case of an error
			session.getTransaction().rollback();
		} finally {//this code will execute even if program fires error
			// Close the session and session factory
			session.close();
			sessionFactory.close();
		}
	}
}
