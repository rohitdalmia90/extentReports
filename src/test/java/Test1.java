import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 extends Base {

    WebDriver driver;

    @BeforeTest
    public void config() {
        driver = initializeDriver();
        driver.get("https://www.google.com");

    }

    @Test
    public void initialDemo() {
        System.out.println(driver.getTitle());
        driver.close();

    }


}
