package net.darkdev.projects.quickmatch.hello.stories;

import net.darkdev.projects.quickmatch.hello.pages.HomePage;
import net.darkdev.projects.quickmatch.hello.pages.PageFactory;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;


public class HomeSteps 
{
	private final PageFactory pageFactory;
	private HomePage home;
	
	public HomeSteps(PageFactory pageFactory) 
	{
		this.pageFactory = pageFactory;
	}

	@Given("I open the web application")
	public void openWebApplication() {
		
		home = pageFactory.home();
		home.open();
	}

	@Then("I should see \"$text\"")
	public void iShouldSeeTheFollowingText(String text){
		home.textIsVisible(text);
	}
}
