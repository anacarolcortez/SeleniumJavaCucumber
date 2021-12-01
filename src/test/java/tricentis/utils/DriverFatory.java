package tricentis.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFatory {

    //Classe responsável pela instância do Driver

    private static WebDriver driver;

    public void startDriver(){
        //Driver do Chrome utilizado está na versão 95.0.4638.69, 64 bits. Se o seu navegador tiver outra versão, baixe a sua versão e substituia o driver no diretório
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
    }

    public WebDriver getDriver(){
        return driver;
    }

    public void closeDriver(){
        driver.quit();
    }

}