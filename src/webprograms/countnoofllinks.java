package webprograms;

import org.openqa.selenium.firefox.FirefoxDriver;

public class countnoofllinks {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://mercurytravels.co.in");
		int links=driver.findElementsByTagName("a").size();
		System.out.println(links);

	}

}
