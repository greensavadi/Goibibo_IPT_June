package com.Goibibo_IPT_June_10AM.pom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.IptTestNGTask.GoIbibo_BaseClass;

public class listOfFlights extends GoIbibo_BaseClass{
	
		public listOfFlights() {
			
			PageFactory.initElements(driver,this);
		}
	
		
	@FindBy(xpath="//div[@class='flexRow justifyBetween']//div[1]//div[@style='min-height: 110px;']//div[@class='roundTripResultCardstyles__Width30-sc-j11urj-2 dHrqdp padLR0 flexCol alignItemsEnd padB5']//span[@class='font18']")
	private WebElement onward_flight_xpath;
	
	@FindBy(xpath="//div[@class='flexRow justifyBetween']//div[2]//div[@style='min-height: 110px;']//div[@class='roundTripResultCardstyles__Width30-sc-j11urj-2 dHrqdp padLR0 flexCol alignItemsEnd padB5']//span[@class='font18']")
	private WebElement return_flight_xpath;


	
	
	@FindBy(xpath="//input[@class='srp-card-uistyles__Fltbook-sc-3flq99-35 hqAmOx f500 widthF105']")
	private WebElement book_button_xpath;
	
	// the concat value should come from baseclass
	@FindBy(xpath="//span[text()='"+withCommaOnwards+"']/ancestor::span[@class='padR5 alignItemsEnd flexCol']/following-sibling::div/input")
	private WebElement onward_flight_radio_button;
	// the concat value should come from baseclass
	@FindBy(xpath="//span[text()='"+withCommaReturn+"']/ancestor::span[@class='padR5 alignItemsEnd flexCol']/following-sibling::div/input")
	private WebElement return_flight_radio_button;
	
	
	public WebElement getOnward_flight_xpath() {
		return onward_flight_xpath;
	}
	public WebElement getReturn_flight_xpath() {
		return return_flight_xpath;
	}
	public WebElement getBook_button_xpath() {
		return book_button_xpath;
	}
	public WebElement getOnward_flight_radio_button() {
		return onward_flight_radio_button;
	}
	public WebElement getReturn_flight_radio_button() {
		return return_flight_radio_button;
	}
	
	
	
}