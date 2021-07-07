package br.com.chronosacademy.automacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;
import java.sql.DriverManager;

public class TesteWebOnly4 {

    WebDriver driver;

    @Before


    public void inicializateste(){


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.aprendendotestar.com.br/treinar-automacao.php");

    }


    @Test

    public void primeiroTeste(){

        String textosite = "/html/body/section/section[1]/div/h1";
        WebElement elemento = driver.findElement(By.xpath(textosite));
        String textovalido = elemento.getText();
        assertEquals("INICIANDO NA AUTOMAÇÃO DE TESTES.", textovalido);

    }

    @Test
    public void atualizarPagina(){
        String textosite = "/html/body/section/section[2]/div/p[3]/a";
        WebElement elemento = driver.findElement(By.xpath(textosite));
        elemento.click();

    }


    @After

    public void finalizaTeste(){
        driver.quit();
    }


}