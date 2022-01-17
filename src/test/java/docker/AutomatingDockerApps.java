package docker;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AutomatingDockerApps {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities ds=new DesiredCapabilities();
		ds.setBrowserName("chrome");
		ds.setPlatform(Platform.LINUX);
		URL url=new URL("http://192.168.1.122:4444/wd/hub");
		WebDriver driver=new RemoteWebDriver(url,ds);
		driver.get("https://github.com/Nikunj-Thakur");
	}
}
