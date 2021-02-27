package SelWork;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration extends Main{
    private String browser_name;
    private String driver_path;
    private String application_url;
    private String inputFile;

    //Default setting
    Configuration() {
        browser_name = "Firefox";
        driver_path = "/Users/rasandesh/Code/Drivers/geckodriver";
        application_url = "https://www.google.com";
        properties = new Properties();
    }
    public void initializeConfiguration() {
        try
        {
            properties.load(new FileInputStream("/Users/rasandesh/Code/Java/src/SelWork/config.properties"));
        }
        catch(FileNotFoundException exception)
        {
            System.out.println("config.properties file not found");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        this.browser_name = properties.getProperty("BROWSER_NAME");
        this.application_url = properties.getProperty("URL");
        this.inputFile = properties.getProperty("INPUT_FILE");
    }

    public String getInputFile() { return inputFile; }
    public void setInputFile(String inputFile) { this.inputFile = inputFile; }

    public String getBrowser_name() {
        return browser_name;
    }
    public void setBrowser_name(String browser_name) {
        this.browser_name = browser_name;
    }

    public String getDriver_path() {
        return driver_path;
    }
    public void setDriver_path(String driver_path) {
        this.driver_path = driver_path;
    }

    public String getApplication_url() {
        return application_url;
    }
    public void setApplication_url(String application_url) {
        this.application_url = application_url;
    }
}
