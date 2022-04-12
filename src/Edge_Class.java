import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_Class {
    public static void main(String[] args) {

        String utimateqaUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.edge.driver","Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(utimateqaUrl);
        driver.manage().window().maximize();
        System.out.println("Title of the page : "+ driver.getTitle());
        System.out.println("Current Url Page : " + driver.getCurrentUrl());// printing the current Url
        System.out.println("Page Source : " + driver.getPageSource());// printing the page source
        WebElement emailId = driver.findElement(By.id("user[email]"));
        emailId.sendKeys("myemail@yahoo.co.uk");
        WebElement password = driver.findElement(By.name("user[password]"));
        password.sendKeys("itseasy456");

        driver.close();
    }
}