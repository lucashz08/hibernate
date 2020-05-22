package application;

import classes.User;

public class Main {

	public static void main(String[] args) {
		
		User u = new User(1, "lucas@gmail.com", "1234");
		User u2 = new User(2, "viviane@gmail.com", "4321");
		User u3 = new User(3, "livia@gmail.com", "1243");
		
		System.out.println(u);
		System.out.println(u2);
		System.out.println(u3);

	}

}
