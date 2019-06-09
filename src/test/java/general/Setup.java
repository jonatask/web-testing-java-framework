package general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Setup {

  /**
   * Starts the driver. The properties should be set by the job manager, e.g. Jenkins, when calling
   * the automation.
   */
  public static WebDriver initDriver() {
    WebDriver driver = null;

    try {
      DesiredCapabilities capabilities = DesiredCapabilities.chrome();
      capabilities.setJavascriptEnabled(true);
      capabilities.setCapability(
          "chrome.binary", "C:/Program Files (x86)/Google/Chrome/Application/chrome.exe");
      capabilities.setCapability("acceptInsecureCerts", true);
      capabilities.setCapability("acceptSslCerts", true);

      ChromeOptions options = new ChromeOptions();
      options.addArguments("--incognito", "--start-maximized");
      options.setAcceptInsecureCerts(true);

      capabilities.setCapability(ChromeOptions.CAPABILITY, options);

      System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
      driver = new ChromeDriver(options);

    } catch (Exception e) {
      e.printStackTrace();
    }
    return driver;
  }

  /**
   * Gets the value of a property from properties folder of this automation project.
   *
   * @param fileName
   * @param propertyName
   * @return value of property
   */
  public static String getProperty(String fileName, String propertyName) {
    Properties properties = new Properties();
    String value = null;

    try {
      properties.load(new FileInputStream("properties/" + fileName));
      value = properties.getProperty(propertyName);

    } catch (IOException e) {
      e.printStackTrace();
    }
    return value;
  }
}
