import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class firstclass {

    @Test
    public void test(){
        WebDriverManager.chromedriver().setup();
        //System.getProperty("Webdriver.chrome.driver", "D:\\framework\\TestProject\\chromedriver.exe");
        WebDriver d1= new ChromeDriver();
        d1.get("https://money.rediff.com/gainers");
        d1.getTitle();
    }
}
