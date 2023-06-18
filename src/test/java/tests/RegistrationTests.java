package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        if (app.getUser().isLogged()) {
            app.getUser().logout();
        }
    }

   /* @Test
    public void registrationPositiveTest() {

        int i = (int) (System.currentTimeMillis() / 1000) % 3600;
        String email = "annb" + i + "@gmail.com ", password = "Annb" + i + "$123456";
        app.getUser().openLoginRegistrationForm();
        app.getUser().fillLoginRegistrationForm(email, password);
        app.getUser().submitRegistration();


    }*/

    @Test
    public void registrationNegativeTestWrongEmail() {
        int i = (int) (System.currentTimeMillis() / 1000) % 3600;
        String email = "abcd"+i+"gmail.com", password = "$Abcd123456789";

        app.getUser().openLoginRegistrationForm();
        app.getUser().fillLoginRegistrationForm(email, password);
        app.getUser().submitRegistration();

    }

    @AfterMethod
    public void tearDown() {

    }
}
