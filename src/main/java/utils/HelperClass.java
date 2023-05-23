package utils;

import org.openqa.selenium.WebDriver;

public class HelperClass {

	private static HelperClass helperClass;
    
    private static WebDriver driver;
    public final static int TIMEOUT = 10;
    
    private HelperClass() {
        
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        driver.manage().window().maximize();

 }  

}
