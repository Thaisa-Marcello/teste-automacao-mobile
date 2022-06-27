package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import pages.UtilsPage;

public class ValidarCalculadora {


    public static UtilsPage utilspage;
    public static AppiumDriver<RemoteWebElement> driver;

    @Dado("^que abri o menu do celular$")
    public void abrirMenu() {
        utilspage.swipeMenu(540, 1788, 540, 689);
    }

    @E("^cliquei no aplicativo calculadora$")
    public void clicarNoApp() {
        utilspage.abrirCalculadora();
    }

    @E("^inseri um número inteiro$")
    public void inserirPrimeiroNumero() {
        utilspage.inserePrimeiroNumeroInteiro();
    }

    @E("^cliquei em soma$")
    public void clicarSoma() {
        utilspage.selecionaOperadorMatematico();
    }

    @E("^inseri o segundo número inteiro$")
    public void inserirSegundoNumero() {
        utilspage.insereSegundoNumeroInteiro();
    }

    @Quando("^clicar em =$")
    public void cliqueResultado() {
        utilspage.clicaNoIgual();
    }

    @Então("^o resultado da equação deve ser visualizado$")
    public void validarResultado() {
        utilspage.confereRsultado();

    }
}
