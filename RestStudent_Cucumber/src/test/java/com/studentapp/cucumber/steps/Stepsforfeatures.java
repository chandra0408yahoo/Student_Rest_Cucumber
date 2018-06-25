package com.studentapp.cucumber.steps;

import com.studentapp.testbase.BaseClass;
import com.studentapp.utils.StudentSerenitySteps;

import cucumber.api.java.en.Given;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

public class Stepsforfeatures {
	
	@Steps
	StudentSerenitySteps step;
	
	@Given("^retreive all data about students$")
	public void retreive_all_data_about_students()  {

	step.getallstudentdata().statusCode(200);
	
	}
}
