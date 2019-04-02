import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Firsttest {
    protected static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src\\Browserdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        //asking driver to get the url

        driver.get("https://www.nopcommerce.com");

        driver.manage().window().maximize();

        //register for a new user
        driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/div[2]/div/ul[1]/li[1]/a")).click();

        driver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_txtFirstName\"]")).sendKeys("Sonal");

        driver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_txtLastName\"]")).sendKeys("Patel");

        driver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_Email\"]")).sendKeys("doldy_dev@2007yahoo.com");

        driver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_UserName\"]")).sendKeys("sonal1");

        driver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_ddlCountry\"]")).sendKeys("United Kingdom");

        driver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_ddlRole\"]")).sendKeys("Technical Developer");

        driver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm\"]/tbody/tr[1]/td/table/tbody/tr/td/div[5]/table/tbody/tr/td[1]")).click();

        driver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_Password\"]")).sendKeys("Sonal05");

        driver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_ConfirmPassword\"]")).sendKeys("Sonal05");

        driver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm___CustomNav0_StepNextButton\"]")).click();





    }


}







