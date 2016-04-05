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

    private String address;
    private String postalCode;
    private String city;
    private String country;
    private String mobilePhone;
    private String alias;

    public User(final String password, final String firstName, final String lastName, final int day,
                final int month, final int year, final String title, final String address, final String postalCode,
                final String city, final String country, final String mobilePhone, final String alias) {
        this.email = RandomStringUtils.randomAlphabetic(8) + "@email.com";
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = LocalDate.of(year, month, day);
        this.title = title;

        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
        this.mobilePhone = mobilePhone;
        this.alias = alias;
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

    public String getAddress() {
        return address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getAlias() {
        return alias;
    }
}
