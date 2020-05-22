package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import classes.User;

public class Main {

	public static void main(String[] args) {
		
		User u = new User(1, "lucas@gmail.com", "1234");
		User u2 = new User(2, "viviane@gmail.com", "4321");
		User u3 = new User(3, "livia@gmail.com", "1243");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("entity-jpa");
		EntityManager em = emf.createEntityManager();

	}

}
