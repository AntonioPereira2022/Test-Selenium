package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CadastrarPage;
import pages.CommonsPage;
import pages.LoginPage;
import runner.Runn;

import java.util.ArrayList;

import static pages.CommonsPage.*;

public class CadastrarSteps extends Runn {         //usando extends para instaciar o driver do Runn

    private LoginPage loginPage;
    private CadastrarPage cadastrarPage;
    private CommonsPage commonsPage;
    WebDriver driver;

    public CadastrarSteps() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        cadastrarPage = new CadastrarPage(driver);
        commonsPage = new CommonsPage(driver);
        // chamamos o metodo do
    }

    @Dado("^que eu esteja na tela inicial")
    public void Cadastrar_usuario() {
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");

    }

    @Quando("^clico em sing-in digito email no campo Email address$")
    public void clico_em_sing_in_digito_email_no_campo_Email_address() {
        loginPage.clico_em_sing_in_digito_email_no_capmpo_Email_address();

    }

    @Quando("^clico em create an account$")
    public void clico_em_create_an_account() {
        loginPage.clico_em_create_an_account();
    }

    @Então("^serei direcionado para a pagina CREATE AN ACCOUNT$")
    public void serei_direcionado_para_a_pagina_CREATE_AN_ACCOUNT() {
        Assert.assertEquals("First name *", cadastrarPage.validarPaginaCreateAnAccount());
    }

    @E("^preencho o relatorio de cadastro$")
    public void preenchoORelatorioDeCadastro() throws InterruptedException {

        commonsPage.clicar(cadastrarPage.gender);
        commonsPage.escrever(cadastrarPage.firstNameCustomer, "Antonio");
        commonsPage.escrever(cadastrarPage.lastNameCustomer, "Pereira");
        commonsPage.escrever(cadastrarPage.passwd, "Antonio12345");
//        cadastrarPage.preencherData();
        commonsPage.escrever(cadastrarPage.firstname, "Jordão");
        commonsPage.escrever(cadastrarPage.lastname, "Do Mar Vermelho");
        commonsPage.escrever(cadastrarPage.company, "Inmetrics");
        commonsPage.escrever(cadastrarPage.address1, "apartment");
        commonsPage.escrever(cadastrarPage.company, "12");
        commonsPage.escrever(cadastrarPage.city, "Sao Paulo");
        commonsPage.selecionarCombo(cadastrarPage.id_state, "Florida");
        commonsPage.escrever(cadastrarPage.postcode, "06632");
        commonsPage.escrever(cadastrarPage.phoneMobile, "1197623-8653");
        commonsPage.escrever(cadastrarPage.alias, "Rua Belem");
        commonsPage.clicar(cadastrarPage.submitAccount);
    }
}
