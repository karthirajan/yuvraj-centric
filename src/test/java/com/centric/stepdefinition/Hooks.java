package com.centric.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.centric.resources.Commonactions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Commonactions {
	
	Commonactions ca = new Commonactions();

	
	@Before
	public void before() {

	 //	 ca.launch(System.getProperty("url"));
      ca.launch("http://win16sql19-cce.centricsoftware.com/WebAccess/login.html");
		 
	}
	
	@After
	public void after(Scenario scenario) {
		
		if(scenario.isFailed()){
			
			final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			
			scenario.embed(screenshot, "image/png");
			
		}else{
			scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
		}
		
		//driver.close();
      
		
	}

}
