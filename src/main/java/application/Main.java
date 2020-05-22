package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import classes.User;

public class Main {

	public static void main(String[] args) {
		
		User u = new User(null, "lucas@gmail.com", "1234");
		User u2 = new User(null, "viviane@gmail.com", "4321");
		User u3 = new User(null, "livia@gmail.com", "1243");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("entity-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		
		em.persist(u); // save class in the database
		em.persist(u2); 
		em.persist(u3);
		
		em.getTransaction().commit();
		
		System.out.print("feito");
	}

}
