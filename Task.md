Please, implement automation tests for "http://www.ipscstore.eu” website related to the new account creation and login functionality.

Tests should cover registration starting from home page and login.

Main test logic consists of the two successful scenarios:

1) Account creation.

a. Generate random strings to use as email for starting of the registration.
b. Open "Log in" form and fill the “E-mail address” filed using the generated string to start of the new account creation.
c. On the opened registration form fill the all mandatory fields, including optional “Title” in order to pass site security restrictions.
d. Register with small simple validation (for example, verify that you are currently logged in).
c. Logout.

2) Login using registered account.

a. Reuse same random strings to put in “E-mail address” and “Password” fields.
b. Login to user account.
c. Navigation to your shopping cart.
d. On the opened “Your Address” form fill the mandatory fields only.
e. Verify that you shopping cart is an empty.
f. Logout.

Please, implement the both tests using:

1) Selenium + WebDriver (http://docs.seleniumhq.org/projects/)
2) TestNG framework to implement test @Test case class and @Test methods in it (http://testng.org/doc/index.html).
3) Page Objects pattern (https://code.google.com/p/selenium/wiki/PageObjects)
4) Java language to implement tests (http://www.oracle.com/technetwork/java/javase/downloads/index.html)
5) IntellJ IDEA CE (preferably) or Eclipse IDE's (https://www.jetbrains.com/idea/download/, https://www.eclipse.org/downloads/)

It’s necessary to implement tests for running on Desktop (any of the Windows, Linux, Mac OS).
Bonus (optional): implement the same tests for running on any Mobile (Android or iOS platforms) devices.

Please, provide Java code for Selenium tests and Page Objects in ZIP file. Tests should be runnable by TestNG.


