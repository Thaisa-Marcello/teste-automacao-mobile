package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

import static steps.ValidarCalculadora.driver;

public class UtilsPage {

    public UtilsPage(AppiumDriver<RemoteWebElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy()
    private RemoteWebElement swipeNaTelaInicial;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Calculator\"]")
    private RemoteWebElement cliqueNoAppCalculadora;

    @AndroidFindBy(xpath = "com.android.calculator2:id/digit_1")
    private RemoteWebElement inserirPrimeiroNumeroInteiro;

    @AndroidFindBy(id = "com.android.calculator2:id/op_add")
    private RemoteWebElement selecionarOperadorMatematico;

    @AndroidFindBy(id = "com.android.calculator2:id/digit_2")
    private RemoteWebElement inserirSegundoNumeroInteiro;

    @AndroidFindBy(id = "com.android.calculator2:id/eq")
    private RemoteWebElement cliqueNoIgual;

    @AndroidFindBy(id = "com.android.calculator2:id/result")
    private RemoteWebElement resultadoDaEquacao;

    public void swipeMenu(int from540, int from1788, int to540, int to689) {
            TouchAction touchAction = new TouchAction(driver);
            touchAction.tap(from540, from1788).waitAction(1000).moveTo(to540,
                    to689).release().perform();
        }

    public void abrirCalculadora() {
        cliqueNoAppCalculadora.click();
    }
    public void inserePrimeiroNumeroInteiro() {
        inserirPrimeiroNumeroInteiro.click();
    }
    public void selecionaOperadorMatematico() {
        selecionarOperadorMatematico.click();
    }
    public void insereSegundoNumeroInteiro() {
        inserirSegundoNumeroInteiro.click();
    }
    public void clicaNoIgual() {
        cliqueNoIgual.click();
    }
    public void confereRsultado(){
        resultadoDaEquacao.getText();
        Assert.assertEquals("3", resultadoDaEquacao);
    }
}
