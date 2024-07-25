package io.EntityRelationships;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1=new Student();
		s1.setName("sanket");
		
		Student s2=new Student();
		s2.setName("shubham");
		
		StudentIdCard c1=new StudentIdCard();
		c1.setSoftwareVersion("1.0.1");
		c1.setStudent(s1);
		
		StudentIdCard c2=new StudentIdCard();
		c2.setSoftwareVersion("1.0.2");
		c2.setStudent(s2);
		
		s1.setCard(c1);
		s2.setCard(c2);
		
		Course cc1=new Course();
		cc1.setCourseName("JAVA");
		Course cc2=new Course();
		cc2.setCourseName("DBMS");
		
		cc1.setStudent(s1);
		cc2.setStudent(s1);

		s1.setCourseList(List.of(cc1,cc2));
		s2.setCourseList(List.of(cc1));
		
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Student");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();	
		
		entityTransaction.begin();
		entityManager.persist(s1);
		entityManager.persist(s2);
		entityManager.persist(c1);
		entityManager.persist(c2);
		entityManager.persist(cc1);
		entityManager.persist(cc2);
		entityTransaction.commit();
		
		
	}

}
