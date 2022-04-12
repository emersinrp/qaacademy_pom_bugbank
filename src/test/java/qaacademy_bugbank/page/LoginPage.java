package qaacademy_bugbank.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    
    WebDriver driver;

    String EMAIL = "//input[@id='inputEmail']";
    String SENHA = "//input[@id='inputPassword']";
    String BOTAOACESSAR = "//a[@id='btnAccess']";

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherEmail(String emailLogin) {
        driver.findElement(By.xpath(EMAIL)).clear();
        driver.findElement(By.xpath(EMAIL)).sendKeys(emailLogin);
    }

    public void preencherSenha(String senhaLogin) {
        driver.findElement(By.xpath(SENHA)).clear();
        driver.findElement(By.xpath(SENHA)).sendKeys(senhaLogin);
    }

    public void clicarAcessar() {
        driver.findElement(By.xpath(BOTAOACESSAR)).click();
    }

}
