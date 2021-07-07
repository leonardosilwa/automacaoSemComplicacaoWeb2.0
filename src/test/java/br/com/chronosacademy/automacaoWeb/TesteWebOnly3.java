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



public class TesteWebOnly3 {

    // Para que o driver seja visto em todos os metodos da classe teremos que colocar ele antes de todas as classes

    // Webdriver nome do cara que vai chamar o driver

    WebDriver driver;

    @Before

    public void inicializaTeste(){

        // chamada da dependencia . chamada do driver do navegador . chamada da configuração

        WebDriverManager.chromedriver().setup();

        //Cara que vai ter poder de mexer no driver = new nome do driver

        driver = new ChromeDriver();

        // aumentar a tela = chamada do cara que vai mexer no driver. configuração. janela. maximizar

        driver.manage().window().maximize();

        // chama o cara que mexe no driver ; chama o endereço = get("")
        //  https://www.chronosacademy.com.br

        driver.get("https://www.chronosacademy.com.br");

    }


    @Test
    public void testeAplicacao(){


        // Tipo Variavel nome Variavel = "colocar o elemento achado" (qual elemento a ser procurado)
        //   /html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4

        String textoSite = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4";

        //WebElement + nome da variavel = cara que mexe no driver.findElement(By.tipo(elementoachado) Buscar dentro do driver esse elemento

        WebElement textoencontrado = driver.findElement(By.xpath(textoSite));

        //Tipo Varivael nome Variavel = Variavel do WebElement.getText() - Para pegar o texto da variavel encontrada do WebElement

        String textoElemento = textoencontrado.getText();


        //Verificar se o texto encontrato esta de acordo com o que esperamos
        // assertEquals ("Porque Tempo É Conhecimento", variavel encontrada) ;

        assertEquals("Porque Tempo É Conhecimento", textoElemento);



    }

    @Test

    public void segundoTeste(){

       String textobtn = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[2]/div/div/a";


       //WebElement + nome da variavel = cara que mexe no driver.findElement(By.tipo(elementoachado) Buscar dentro do driver esse elemento

       WebElement btnEncontrado = driver.findElement(By.xpath(textobtn));

        // variavel atribuida do WebElemente.click();

        btnEncontrado.click();

        // Tipo de Variavel + nome da variavel = "xpah do elemento a ser validado"
        String xpathTituto = "/html/body/div/div/div/div/section[2]/div/div/div/div/div/section/div/div/div/div/div/div/div/h2";

        //WebElement + nome da variavel = cara que mexe no driver.findElement(By.tipo(elementoachado) Buscar dentro do driver esse elemento
        WebElement h2Titulo = driver.findElement(By.xpath(xpathTituto));

        //Verificar se o texto encontrato esta de acordo com o que esperamos
        // assertEquals ("AUTOMAÇÃO SEM COMPLICAÇÃO WEB 2.0", variavel encontrada) ;

        assertEquals("AUTOMAÇÃO SEM COMPLICAÇÃO WEB 2.0", h2Titulo.getText());


    }


    @After

    public void finalizarTeste(){
        // chama o cara que mexe no driver. sair do navegador = quit();

        driver.quit();
    }

}
