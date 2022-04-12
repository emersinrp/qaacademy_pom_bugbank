package qaacademy_bugbank.scenarios;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import qaacademy_bugbank.page.HomePage;
import qaacademy_bugbank.page.LoginPage;

public class TesteLogin {

    WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;

    String email = "teste17@teste.com";
    String senha = "teste123";

    @Before
    public void setupBrowser() {
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://localhost:3000/");
        cadastrarUsuario();
    }

    @Test
    public void testeLoginComSucesso() {
        loginPage.preencherEmail(email);
        loginPage.preencherSenha(senha);
        loginPage.clicarAcessar();
        validarMensagem("bem vindo ao BugBank :)");
        validarUrl("/home");
    }

    public void cadastrarUsuario() {
        homePage.clicarRegistrar();
        homePage.preencherEmail(email);
        homePage.preencherNome("QA Academy");
        homePage.preencherSenha(senha);
        homePage.preencherConfirmacaoSenha(senha);
        homePage.clicarEmCriarComSaldo();
        homePage.clicarCadastrar();
        validarMensagem("foi criada com sucesso");
        homePage.clicarBotaoFechar();
    }    

    public void validarMensagem(String msg) {
        Assert.assertTrue(driver.getPageSource().contains(msg));
    }
    public void validarUrl(String pagina) {
        Assert.assertTrue(driver.getCurrentUrl().contains(pagina));
    }

/*    @After
    public void finalizarBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
*/
}
