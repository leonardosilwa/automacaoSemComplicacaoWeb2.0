package br.com.chronosacademy.automacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteWebOnly4 {

    @Test

    public void testeAcesso(){

        // chamada da dependencia . chamada do driver do navegador . chamada da configuração
        WebDriverManager.chromedriver().setup();

        // nova instancia do webdriver (Cara que vai ter poder de mexer no driver) = new nome do driver
        WebDriver driver = new ChromeDriver();

        // aumentar a tela = chamada do cara que vai mexer no driver. configuração. janela. maximizar
        driver.manage().window().maximize();

        // chama o cara que mexe no driver ; chama o endereço = get("")
        driver.get("https://www.chronosacademy.com.br/");

        // colocar o elementro encontrado em uma variavel (nesse exmplo String)
        String xpathTitulo = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4";

        //Chamaelemento WebElement Atribui um nome para o elemento e busca ele dentro do driver
        WebElement titulo = driver.findElement(By.xpath(xpathTitulo));

        //colocando o elemento encontrado dentro de uma variavel
        String txtTitulo = titulo.getText();

        //comparando o elemento encontrato com o experado
        Assert.assertEquals("Porque Tempo É Conhecimento", txtTitulo);

        // chama o cara que mexe no driver. sair do navegador = quit();
        driver.quit();


        /*
        String texto = driver.findElement(By.xpath("/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4"))
                .getText();
        Assert.assertEquals("Porque Tempo É Conhecimento", texto);
        */

    }


}
