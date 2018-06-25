package com.studentapp.cucumber.steps;

import org.junit.runner.RunWith;

import com.studentapp.testbase.BaseClass;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/feature")
public class SerenityRunner extends BaseClass{
	
	

}
