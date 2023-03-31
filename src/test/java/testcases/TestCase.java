package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestCase {

    @Test
    public void startBrowser() {
        System.setProperty("webdriver.chrome.driver", "/Users/makhabatmb/IdeaProjects/SeleniumProject/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://www.nytimes.com");

    }

    String id_input = "//*[@id='email']";
    String password_input = " //*[@id='password']";
    String remember_me_input = "//label[@for='auth-page-remember-me']";
    String forgot_password_input = "//a[@href='https://my-fork.com/password/reset']";
    String submit_input = "//button[@type='submit']";

}