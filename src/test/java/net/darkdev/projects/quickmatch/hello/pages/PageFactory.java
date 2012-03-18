package net.darkdev.projects.quickmatch.hello.pages;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.condition.ConditionRunner;

public class PageFactory {
	private final Selenium selenium;
	private final ConditionRunner conditionRunner;

	public PageFactory(Selenium selenium, ConditionRunner conditionRunner) {
		this.selenium = selenium;
		this.conditionRunner = conditionRunner;
	}

	public HomePage home() {
		return new HomePage(selenium, conditionRunner);
	}

}
