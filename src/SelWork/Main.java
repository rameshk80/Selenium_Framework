package SelWork;

import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class Main {
    protected static Configuration config;
    protected static WebDriver driver;
    protected static Properties properties;
    private static WebdriverFactory objDriverFactory;

    public static void main(String[] args) throws InterruptedException {
        properties = new Properties();
        config = new Configuration();
        objDriverFactory = new WebdriverFactory();

        config.initializeConfiguration();
        objDriverFactory.initializeWebdriver();

        objDriverFactory.navigateTo();
        Thread.sleep(4000);
        objDriverFactory.quit();
    }
}
