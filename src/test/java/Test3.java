import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3 extends Base {

    WebDriver driver;

    @BeforeTest
    public void config() {
        driver = initializeDriver();
        driver.get("https://www.paytm.com");

    }

    @Test
    public void initialDemo() {
        System.out.println(driver.getTitle());
        driver.close();
    }
}
