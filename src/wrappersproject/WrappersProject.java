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

    private WebDriver driver= null;
    
        /**
     * @return the driver
     */
    public WebDriver getDriver() {
        return driver;
    }

    /**
     * @param aDriver the driver to set
     */
    public void setDriver(WebDriver aDriver) {
        driver = aDriver;
    }
    
    public WrappersProject(String exepath) {
        //String exePath = "/home/yevbes/NetBeansProjects/WrappersProject/geckodriver/geckodriver";
        System.setProperty("webdriver.gecko.driver", exepath);
        setDriver(new FirefoxDriver());
    }
    
    /*public void Firefox()
    {
        
        String exePath = "/home/yevbes/NetBeansProjects/WrappersProject/geckodriver/geckodriver";
        System.setProperty("webdriver.gecko.driver", exePath);
        setDriver(new FirefoxDriver());
        getDriver().get("http://www.amazon.es");
        getDriver().manage().window().maximize();
    }   */
}
