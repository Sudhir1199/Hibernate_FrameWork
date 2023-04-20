package org.MyFirst.hibernate;

import org.hibernate.Session;
import org.MyFirst.hibernate.entity.Users;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")//xml location
				.addAnnotatedClass(Users.class)//entity class Binding
				.buildSessionFactory();
		
		//the SessionFactory in Hibernate is responsible for the 
		//creation of Session objects. The Hibernate Session provides methods such as save, delete and update, all of which are used to perform CRUD-based operations on the database to which the SessionFactory connects.

		// Using session factory we will build session object
		Session sess = factory.getCurrentSession();

		try {
			// Create Object of Entity Class type

			Users user = new Users("Sudhir", "Sarbeswar123#", "Sudhir", "Kumar Nayak");

			// Start Transaction

			sess.beginTransaction();

			// Perform Operation

			sess.save(user);

			// Commit transaction

			sess.getTransaction().commit();
			System.out.println("Row Added!!");

		} catch (Exception e) {

		} finally {
			sess.close();
			factory.close();
		}

	}

}
