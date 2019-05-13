package com.acttime.objectrepositorylib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.acttime.genericlib.BaseClass;
import com.thoughtworks.selenium.webdriven.commands.DragAndDrop;

import bsh.commands.dir;

public class CreateNewProject {
	
	@FindBy(id="projectPopup_projectNameField")
	private WebElement projectNAmeEdt;
	
	@FindBy(xpath="//button[text()='-- Please Select Customer to Add Project for  --']")
	private WebElement customerDd;
	
	@FindBy(xpath="//span[text()='Create Project']")
	private WebElement saveBtn;
	
	public void createProject(String customerNAme , String projectNAme) throws InterruptedException {
		
		customerDd.click();
		Thread.sleep(1000);
		String x = "//a[text()='"+customerNAme+"']";
		
		BaseClass.driver.findElement(By.xpath(x)).click();
		
		projectNAmeEdt.sendKeys(projectNAme);
		Thread.sleep(3000);
		saveBtn.click();
	}

}
