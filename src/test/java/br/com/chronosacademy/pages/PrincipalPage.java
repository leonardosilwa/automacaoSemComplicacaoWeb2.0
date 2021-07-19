package br.com.chronosacademy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrincipalPage {

     WebDriver driver;

    public PrincipalPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitulo() {
        String xpathTitulo = "//section[2]//h4";
        //     Atribuindo uma variavel para o elemento encontrado

        WebElement titulo = driver.findElement(By.xpath(xpathTitulo)); // encontramos o elemento no caminho
        String txtTitulo = titulo.getText(); // colocando o elemento encontrato em uma variavel
        return txtTitulo;
    }

    public void clickBotao() {
        String xpathBotao = "//section[2]/div[3]//a";
        //     Atribuindo uma variavel para o elemento encontrado

        WebElement btnTitulo = driver.findElement(By.xpath(xpathBotao)); // encontramos o elemento no caminho
        btnTitulo.click(); // Ação do elementro encontrado
    }

}
