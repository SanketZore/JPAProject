package io.zore;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PokedexInitiatorRead {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Sanket");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Pokemon p=entityManager.find(Pokemon.class,"Pikachu");
		
		System.out.println(p);
		System.out.println(p.getName());
		System.out.println(p.getType());
		System.out.println(p.getPower());
	
	}

}
