package io.EntityRelationships;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Student");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Student s1=entityManager.find(Student.class,1);
		System.out.println(s1.getName());
		
		for(Course c:s1.getCourseList()) {		// read courseList form studentclass.
			System.out.println(c.getCourseName());
		}
		
		
//		System.out.println(s1.getName()+" "+s1.getCard().getSoftwareVersion()+" "+s1.getCard().getCardNumber());
//		System.out.println(s1.getName());
		
//		StudentIdCard c1=entityManager.find(StudentIdCard.class,3);
//		System.out.println(c1.getStudent().getName()+" "+c1.getCardNumber()+" "+c1.getSoftwareVersion());
		
//		Course cc1=entityManager.find(Course.class,6);
//		System.out.println(cc1.getCourseName()+" "+cc1.getStudent().getName());
		
	}

}
