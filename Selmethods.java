package week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selmethods {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fundsindia.com/");
		driver.quit();
		 
		
	}

	}


