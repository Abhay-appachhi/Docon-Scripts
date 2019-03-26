package core.pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import agent.IAgent;
import central.Configuration;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import page.Page;

public abstract  class FullPage extends Page {
		
	public FullPage(Configuration config, IAgent agent, Map<String, String> testData) throws Exception {
		super(config, agent, testData);
	}
	
	AppiumDriver<MobileElement> driver = this.getAgent().getMobileDriver();
  	protected StringBuffer generateString(int length) {
   		StringBuffer output = new StringBuffer();
   		String characterSet = "";
   		characterSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
   		for (int i=0; i<length; i++) {
   			double index = Math.random()*characterSet.length();
   			output.append(characterSet.charAt((int)index));
   		}
   		return(output);
   	}

   	protected StringBuffer generateRandomNumber(int length) { 
   		StringBuffer output = new StringBuffer(); 
   		String characterSet = ""; 
   		characterSet = "0987654321"; 
   		for (int i=0; i<length; i++) { 
   			double index = Math.random()*characterSet.length(); 
   			output.append(characterSet.charAt((int)index)); 
   		} 
   		return(output);
   	}
   	
   	protected void waitTillElementisVisible(int timeout, String element) {
   		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
		
   	}

}
