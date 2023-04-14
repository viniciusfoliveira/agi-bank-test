package pages;

import helpers.HelperWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import webdriver.Driver;

public class HomePage {

    @FindBy(id = "search-open")
    private WebElement btnBuscaImagem;

    @FindBy(name = "s")
    private WebElement inputPesquisar;

    @FindBy(className = "archive-title")
    private WebElement pesquisaTitulo;

    @FindBy(className = "search-submit")
    private WebElement btnSubmit;

    @FindBy(className = "entry-title")
    private WebElement naoEncontrado;


    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public boolean visibleInputPesquisar(){
        return HelperWait.waitVisible(inputPesquisar, 10);
    }


    public void clicarBtnImagem(){
        btnBuscaImagem.click();
    }

    public void inputPesquisar(String msg){
        HelperWait.waitVisible(inputPesquisar,10);
        inputPesquisar.sendKeys(msg);
    }

    public String getTextoPesquisa(){
        return pesquisaTitulo.getText();
    }

    public void clicarBtnPesquisar(){
        btnSubmit.click();
    }
    public String getNaoEncontrado(){
        return naoEncontrado.getText();
    }
}
