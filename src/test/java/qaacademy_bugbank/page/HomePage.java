package qaacademy_bugbank.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    // Variavel miuscula = FINAL. Uma variavel que muda pouco ou nunca o seu valor.
    String REGISTRAR = "//a[@id='btnRegister']";
    String EMAIL = "//input[@id='inputEmail']";
    String NOME = "//input[@id='inputName']";
    String SENHA = "//input[@id='inputPassword']";
    String CONFIRM_SENHA = "//input[@id='inputPasswordConfirmation']";
    String CRIAR_SALDO = "//span[@id='toggleAddBalance']";
    String CADASTRAR = "//a[@id='btnRegister']";
    String BOTAOFECHAR = "//a[@id='btnCloseModal']";

    public HomePage(WebDriver driverParametroVindoDoTeste) {//metodo contrutor
        this.driver = driverParametroVindoDoTeste;

    }

    public void clicarRegistrar() {
        driver.findElement(By.xpath(REGISTRAR)).click();

    }

    public void preencherEmail(String email) {
        driver.findElement(By.xpath(EMAIL)).sendKeys(email);

    }

    public void preencherNome(String nome) {
        driver.findElement(By.xpath(NOME)).sendKeys(nome);

    }

    public void preencherSenha(String senha) {
        driver.findElement(By.xpath(SENHA)).sendKeys(senha);

    }

    public void preencherConfirmacaoSenha(String senhaConfirmacao) {
        driver.findElement(By.xpath(CONFIRM_SENHA)).sendKeys(senhaConfirmacao);

    }

    public void clicarEmCriarComSaldo() {
        driver.findElement(By.xpath(CRIAR_SALDO)).click();
    }

    public void clicarCadastrar() {
        driver.findElement(By.xpath(CADASTRAR)).click();
    }

    public void clicarBotaoFechar() {
        driver.findElement(By.xpath(BOTAOFECHAR)).click();
    }

}
