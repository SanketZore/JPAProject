package io.zore;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PokedexInitiatorCreate {

	public static void main(String[] args) {

		Pokemon p1=new Pokemon();
		p1.setName("Chirazard");
		p1.setType("Fire");
		p1.setPower(1000);
		p1.setColor(Color.ORANGE);
		
		Pokemon p2=new Pokemon();
		p2.setName("Pikachu");
		p2.setType("Electric");
		p2.setPower(100);
		p2.setColor(Color.YELLOW);
		
		Pokemon p3=new Pokemon();
		p3.setName("Meowth");
		p3.setType("Normal");
		p3.setPower(100);
		p3.setColor(Color.CREAM);

		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Sanket");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(p1);
		entityManager.persist(p2);
		entityManager.persist(p3);
		entityTransaction.commit();
		
		
		
	}

}
