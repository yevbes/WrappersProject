/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrappersproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author yevbes
 */
public class WrappersProject {
    
    private static WebDriver driver= null;
    
    public static void Firefox()
    {
        //Hola mundo
        String exePath = "/home/yevbes/NetBeansProjects/WrappersProject/geckodriver/geckodriver";
        System.setProperty("webdriver.gecko.driver", exePath);
        driver = new FirefoxDriver();
        driver.get("http://www.amazon.es");
        driver.manage().window().maximize();
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Firefox();
    }
    
}
