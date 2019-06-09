package general;

import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static general.Setup.*;

public class Step {

    protected static WebDriver driver;

    public Step(){
        closeDriver();
        driver = initDriver();
    }

    /**
     * Go to a page from the main url. Example: /account will access myMainUrl.com/account
     * @param aditionalUrl
     */
    public void goToPage(String aditionalUrl) {
        String mainUrl = getProperty("system", "url");
        driver.get(mainUrl + aditionalUrl);
    }

    /**
     * Waits for the element until 30 seconds.
     */
    public void implicitlyWait(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    /**
     * Wait some defined seconds.
     * @param seconds
     */
    public void threadSleepWait(int seconds) {
        long milisegundos = seconds * 1000;
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Kills the chromedriver process.
     */
    public void closeDriver() {
        try {
            Runtime.getRuntime().exec("taskkill -f -im chromedriver.exe").waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
