package ec.edu.espol.workshops.second;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepsDefs {

	private boolean isMarried;
	private int age;
    private char sex;
    private int answer;
    private String license = "0801129210";
    
    @Given("the customer is {string}")
    public void the_customer_is(String sex) {
        this.sex = sex.charAt(0);
    }
    
    @And("married is {}")
    public void married_is(boolean isMarried) {
    	this.isMarried = isMarried;
    }
    
    @And("age is {int}")
    public void age_is(int age) {
    	this.age = age;
    }
    
    @When("calculating the premium")
    public void calculating_the_premium() {
    	Customer c = new Customer(age, sex, isMarried, license);
    	answer = CarInsurance.calculatePremium(c);
    }
    
    @Then("I should be told {int}")
    public void i_should_be_told (int expectedAnswer) {
    	assertEquals(expectedAnswer,answer);
    }
}
