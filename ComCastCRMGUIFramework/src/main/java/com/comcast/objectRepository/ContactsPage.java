package com.comcast.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {

	 WebDriver driver;
	 @FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	 WebElement icon;

	public ContactsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getIcon() {
		return icon;
	}

		
	}

