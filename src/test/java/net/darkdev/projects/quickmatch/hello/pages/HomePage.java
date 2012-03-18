package net.darkdev.projects.quickmatch.hello.pages;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.condition.ConditionRunner;

public class HomePage extends Page {

	public HomePage(Selenium selenium, ConditionRunner conditionRunner) {
		super(selenium, conditionRunner);
	}
	
	public void open() {
		open("http://localhost:9001/hello/");
	}

	public void verifyPage() {
		textIsVisible("Hello world!");
	}

}
