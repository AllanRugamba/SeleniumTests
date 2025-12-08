package Button;

import Base.BaseTests;
import org.testng.annotations.Test;

public class SeleniumTrainingTests extends BaseTests {
    @Test
    public void clickGoToRegistrationTest(){
        var seleniumTrainingPage = homePage.clickSeleniumTrainingPage();
        seleniumTrainingPage.goToRegistration();
    }

}