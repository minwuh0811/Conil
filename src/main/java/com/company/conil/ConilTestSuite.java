package com.company.conil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class ConilTestSuite {


    private static final String DRIVER_IE_LOCATION = "C:\\Users\\bishe\\IdeaProjects\\JenkinsMavenConil\\webdriver\\IEDriverServer.exe";
    private static final String DEFAULT_HOME_PAGE_SV = "https://www.dev.conil.se";
    private static final String DRIVER_IE = "webdriver.ie.driver";
    private static final String DRIVER_CHROME = "webdriver.chrome.driver";
    private static final String DRIVER_CHROME_LOCATION = "C:\\Users\\bishe\\IdeaProjects\\JenkinsMavenConil\\webdriver\\chromedriver.exe";

    static WebDriver driver;


    public static void main(String[] args) {


        ConilTestSuite conilTestSuite = new ConilTestSuite();

        WebDriver chromeDriver =conilTestSuite.webDriver(DRIVER_CHROME,DRIVER_CHROME_LOCATION);
        chromeDriver.get("https://www.dev.conil.se");
        System.out.println("Selenium Webdriver Script in Chrome browser using chrome Driver | Software Testing Material");
        chromeDriver.close();




    }

    public String runWebdriver(WebDriver webDriver,String webSidan) {
        try {
            webDriver.get(webSidan);
            return "Success";
        } catch (Exception e) {
            System.out.println(e.toString());
            return "Failed";

        }
    }

    public static WebDriver webDriver(String driverName, String driverLocation) {
        System.setProperty(driverName, driverLocation);
        if (driverName.contains("ie")) {
            driver=new InternetExplorerDriver();
        } else if (driverName.contains("chrome")) {
            driver = new ChromeDriver();
        }
        return driver;

    }







}
