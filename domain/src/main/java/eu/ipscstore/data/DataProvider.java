package eu.ipscstore.data;

import java.time.LocalDate;

public class DataProvider {

	private static User USER;

	public static User createUser() {
		USER = new User("123", "123", "123", LocalDate.now(), "asd");
		return USER;
	}

	public static User getUser() {
		return USER;
	}
}
