package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import classes.User;

public class Main {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("entity-jpa");
		EntityManager em = emf.createEntityManager();


		int id = 2;
		
		User getUser = em.find(User.class, id);

		System.out.println(getUser);
		System.out.print("feito");
		
		em.close();
		emf.close();
	}

}
