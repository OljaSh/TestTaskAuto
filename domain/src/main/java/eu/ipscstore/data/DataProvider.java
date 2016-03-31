package eu.ipscstore.data;

public class DataProvider {

	private static User USER;

	public static User createUser() {
		USER = new User("123456", "fName", "sName", "10", "may", "1980", "Ms.", "Maiami", "Brazil", "1234", "Tuvalu",  "55555", "ALIAS");
		return USER;
	}

	public static User getUser() {
		return USER;
	}
}
