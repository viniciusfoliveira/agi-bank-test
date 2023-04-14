import helpers.HelperDriver;
import org.junit.*;
import pages.HomePage;

public class DesafaioAgi {

    HomePage homePage = new HomePage();

    @Before()
    public void setup() {
        HelperDriver.inicializar();
    }

    @Test
    public void validarBuscaComSucesso() {
        homePage.clicarBtnImagem();
        homePage.inputPesquisar("AgiBank");
        homePage.clicarBtnPesquisar();
        Assert.assertEquals(homePage.getTextoPesquisa(), "Resultados da busca por: AgiBank");
    }

    @Test
    public void validarBuscaNaoEncontrado() {
        homePage.clicarBtnImagem();
        homePage.inputPesquisar("kaka");
        homePage.clicarBtnPesquisar();
        Assert.assertEquals(homePage.getNaoEncontrado(), "Nenhum resultado");
    }

    @After
    public void tearDown() {
        HelperDriver.finalizar();
    }
}
