package eu.ipscstore.data;

import org.apache.commons.lang3.RandomStringUtils;

import java.time.LocalDate;

public class User {

	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private String title;

	public User(final String password, final String firstName, final String lastName, final LocalDate birthDate, final String title) {
		this.email = RandomStringUtils.randomAlphabetic(8) + "@email.com";
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.title = title;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public String getTitle() {
		return title;
	}

	public String getFullName() {
		return getFirstName() + " " + getLastName();
	}
}
