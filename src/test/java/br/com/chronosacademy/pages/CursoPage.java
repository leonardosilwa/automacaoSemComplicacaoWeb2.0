package br.com.chronosacademy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CursoPage {

    WebDriver driver;

    public CursoPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitulo2() {
        String xpathTituto = "//section[2]//h2";
        WebElement h2Titulo = driver.findElement(By.xpath(xpathTituto));
        return h2Titulo.getText();
    }



}
