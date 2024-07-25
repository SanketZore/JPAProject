package io.zore;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PokedexInitiatorUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Sanket");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Pokemon p=entityManager.find(Pokemon.class,"Pikachu");		
		if(p!=null) {
			p.setPower(200);
			entityTransaction.begin();
			entityManager.persist(p);
			entityTransaction.commit();
		}else {
			System.out.println("Entry Does not Exist.");
		}
		
		
	}

}
