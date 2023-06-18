package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        if (app.getUser().isLogged()) {
            app.getUser().logout();
        }
    }
       /* @Test
        public void loginPositiveTest() {
            //open login form
            String email = "benb@gmail.com", password = "Beny$123456";
            app.getUser().openLoginRegistrationForm();
            app.getUser().fillLoginRegistrationForm(email, password);


            //click on the login button
            app.getUser().submitLogin();
            app.getUser().pause(300);
            //Assert
            Assert.assertTrue(app.getUser().isElementPresent(By.xpath("//button[contains(text(),'Sign Out')]")));
            //  pause(300);

        }*/

        @Test
        public void loginNegativeTestWrongEmail () {
            String email = "benbgmail.com", password = "Beny$123456";
          app.getUser().openLoginRegistrationForm();
          app.getUser().fillLoginRegistrationForm(email,password);//  openLoginRegistrationForm();
           // fillLoginRegistrationForm(email, password);
            app.getUser().submitLogin();

        }

    @AfterMethod
    public void tearDown() {

    }

}