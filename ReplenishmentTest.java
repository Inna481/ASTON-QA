import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReplenishmentTest {
    private WebDriver driver;

    @Before
    public void setDriver() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Test
    public void testOnlineReplenishment() {
        driver.get("https://www.mts.by/");

        WebElement blockTitle = driver.findElement(By.xpath("//h2[contains(text(), 'Онлайн пополнение без комиссии')]"));
        Assert.assertNotNull("Блок не найден", blockTitle);
        Assert.assertEquals("Название блока не совпадает", "Онлайн пополнение без комиссии", blockTitle.getText());

        Assert.assertTrue("Логотип Visa не найден", isElementPresent(By.xpath("//img[@alt='Visa']")));
        Assert.assertTrue("Логотип MasterCard не найден", isElementPresent(By.xpath("//img[@alt='MasterCard']")));

        WebElement infoLink = driver.findElement(By.linkText("Подробнее о сервисе"));
        infoLink.click();
        Assert.assertTrue("Не удалось перейти на страницу с информацией", driver.getCurrentUrl().contains("service-info-url"));

        driver.navigate().back();
        WebElement serviceRadiooButton = driver.findElement(By.id("serviceRadioButtonId"));
        serviceRadiooButton.click();

        WebElement fieldOfPhoneNumber = driver.findElement(By.id("phoneNumberFieldId"));
        fieldOfPhoneNumber.sendKeys("297777777");

        WebElement continueButton = driver.findElement(By.id("continueButtonId"));
        continueButton.click();

        Assert.assertTrue("Не удалось продолжить процесс", isElementPresent(By.id("successMessageId")));

    }
    private boolean isElementPresent (By by){
        try {
            driver.findElement(by);
            return true;
            } catch (Exception e) {
                 return false;
        }

    }
    @After
    public void tearDown(){
        if (driver != null){
            driver.quit();
        }
    }
}
