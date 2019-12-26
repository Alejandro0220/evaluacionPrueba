package com.choucair.pruebas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ServiciosBusiness {
    public static void main(String[] args) throws InterruptedException {
        //Instancias Objeto webDriver
        WebDriver driver;

        //Declarar  variables
        String baseURL ="https://www.choucairtesting.com/";
        String actualResult="";
        String expecteResult ="Pruebas para Business Intelligence ";


        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");

        //Abrir navegador chrome
        driver =new ChromeDriver();

        //abrir navegador en pantalla completa
        driver.manage().window().maximize();

        //Navegar en la pagina
        driver.get(baseURL);

        //Clic en servicios
        driver.findElement(By.linkText("Servicios")).click();

        //Clic en aceptar cookies
        driver.findElement(By.linkText("ACEPTAR")).click();

        //Clic en portafolio de soluciones
        driver.findElement(By.linkText("Portafolio de Soluciones")).click();

        //Tiempo espera
        Thread.sleep(5000);

        //Clic en opción Business Intellingence de Portafolio de soluciones
        driver.findElement(By.linkText("Business Intellingence")).click();

        //Se envia texto que tiene el titulo
        actualResult = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/section[23]/div/div/div[2]/div/div/div/div/div/p[1]/strong")).getText();

        //Se compara resultado actual y el resultado esperado para saber si la prueba tuvo exito
        if(actualResult.contentEquals(expecteResult)){
            System.out.println("Prueba pasada");
        }else {
            System.out.println("Prueba falló"+ actualResult);
        }

    }

}
