package stepDefinitions;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class LoginPageSteps {
      private final LoginPage Login = new LoginPage(DriverFactory.getDriver());

      @Given("user is on login page")
      public void user_is_on_login_page() {
            DriverFactory.getDriver()
                    .get("https://test.sharebus.co/");
      }

      @When("Click signin button")
      public void clickSigninButton() {
            Login.signinButton();
      }

      @And("Enter valid email address {string}")
      public void enterValidEmailAddress(String email) {
            Login.emailAddress(email);
      }

      @And("Enter valid password {string}")
      public void enterValidPassword(String pass) {
            Login.password(pass);
      }

      @And("Click on signIn button")
      public void clickOnSignInButton() throws InterruptedException{
            Login.signIn();
      }
      @And("Click on the menue option")
      public void clickOnTheMenueOption() throws InterruptedException {
            Thread.sleep(6000);
            Login.clickShareleadMenue();
      }
      @And("Click on the sharelead")
      public void clickOnTheSharelead() {
            Login.clickSharelead();
      }

      @And("click on the continue button")
      public void clickOnTheContinueButton() throws InterruptedException{
            Login.clickContinue();
            Thread.sleep(4000);
      }

      @And("Click on the set up a  sharebus")
      public void clickOnTheSetUpASharebus() {
            Login.clickSetUpAShareBus();
      }

      @And("click on the from location {string}")
      public void clickOnTheFromLocation(String oslo) throws InterruptedException{
            Login.osloNorway(oslo);
            Thread.sleep(2000);
      }

      @And("select the destination point {string}")
      public void selectTheDestinationPoint(String destination) throws InterruptedException {
            Login.destinationPoint(destination);
            Thread.sleep(2000);
      }

      @And("select starting datepiker")
      public void selectStartingDatepiker() throws InterruptedException{
            Login.scrollToBottom();
            Thread.sleep(2000);
            Login.startingdate();
            Thread.sleep(2000);

      }

      @And("select starting time")
      public void selectStartingTime() throws InterruptedException{
            Login.startingTime();
            Thread.sleep(2000);

      }

      @And("select return date")
      public void selectReturnDate() throws InterruptedException{
            Login.clickReturndate();
            Thread.sleep(4000);
      }

      @And("select return time")
      public void selectReturnTime() throws InterruptedException{
            Login.clickReturnTime();
            Thread.sleep(2000);
      }

      @And("Click on the continue")
      public void clickOnTheContinue(){
            Login.clickContinue2();

      }



}
