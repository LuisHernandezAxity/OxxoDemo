package Pruebas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://201.163.179.27:18081/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        WebElement login = driver.findElement(By.xpath("//*[@alt='profile']"));
        login.click();
        WebElement usuario= driver.findElement(By.id("username"));
        usuario.sendKeys("USER6");
        WebElement password= driver.findElement(By.id("password"));
        password.sendKeys("QeZ9yqfS");
        WebElement Entrar= driver.findElement(By.id("kc-login"));
        Entrar.click();
        WebElement menu= driver.findElement(By.xpath("//img[@alt='menu-hamburguesa']"));
        menu.click();
        WebElement menuLista= driver.findElement(By.xpath("//mat-expansion-panel-header[@id-test='Listas']"));
        menuLista.click();
        WebElement menuListaNF= driver.findElement(By.id("/national-fleet"));
        menuListaNF.click();
        Thread.sleep(1000);
        /*WebElement buscarLN= driver.findElement(By.className("mat-autocomplete-trigger"));//localiza el buscador de la national fleet
        buscarLN.sendKeys("zdrus");
        Thread.sleep(5000);
        WebElement buscarLN2= driver.findElement(By.id("national-fleet-table-search"));//localiza el buscador de la national fleet otra opcion
        buscarLN2.clear();
        */WebElement filtros= driver.findElement(By.id("btn-filter-national-fleet"));
        filtros.click();
        WebElement filtrosLinea= driver.findElement(By.id("national-fleet-filter-line"));
        filtrosLinea.click();
        WebElement Linea=driver.findElement(By.id("national-fleet-filter-line-option-1"));
        Linea.click();
        WebElement aplicarFiltros=driver.findElement(By.id("btn-deleate-filters-national-fleet"));
        aplicarFiltros.click();
        //Thread.sleep(5000);
        //WebElement borrarFiltro= driver.findElement(By.tagName("Borrar filtros"));
        //borrarFiltro.click();
    }
}
