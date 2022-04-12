import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser_Class {


    static String browser ="firefox";
    static String project5_Url = "https://courses.ultimateqa.com/users/sign_in";
    static WebDriver driver;
    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){

            System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("Edge")){

            System.setProperty("webdriver.edge.driver","Drivers/msedgedriver.exe");
            driver = new EdgeDriver();

        }
        else if(browser.equalsIgnoreCase("Firefox")){

            System.setProperty("webdriver.gecko.driver","Drivers/geckodriver.exe");
            driver = new FirefoxDriver();

        }
        else{
            System.out.println("Wrong Browser Name");
        }
        driver.get(project5_Url);
        driver.manage().window().maximize();
        System.out.println("Title of the page : " + driver.getTitle());// Printing the title of the page
        System.out.println("Current Url Page : " + driver.getCurrentUrl());// printing the current Url
        System.out.println("Page Source : " + driver.getPageSource());// printing the page source
        WebElement emailId = driver.findElement(By.id("user[email]"));
        emailId.sendKeys("myemail@yahoo.co.uk");
        WebElement password = driver.findElement(By.name("user[password]"));
        password.sendKeys("itseasy456");

        driver.close();


    }
}
