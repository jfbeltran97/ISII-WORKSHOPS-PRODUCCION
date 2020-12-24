package ec.edu.espol.workshops.second;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatePremiumTest {
    String license = "0801129210";
    char male = 'M';
    char female = 'F';

    @Test
    void minorMaleWithLicenseShouldReturn2100() {
        Customer c = new Customer(16, male, false, license);
        assertEquals(2100, CarInsurance.calculatePremium(c));
    }
    
    @Test
    void minorFemaleWithLicenseShouldReturn400() {
        Customer c = new Customer(16, female, false, license);
        assertEquals(400, CarInsurance.calculatePremium(c));
    }  
    
    
    @Test
    void divorced50YearOldMaleWithLicenseShouldReturn500() {
        Customer c = new Customer(50, male, false, license);
        assertEquals(500, CarInsurance.calculatePremium(c));
    }
    
    @Test
    void married50YearOldFemaleWithLicenseShouldReturn300() {
        Customer c = new Customer(50, female, true, license);
        assertEquals(300, CarInsurance.calculatePremium(c));
    }
    
    @Test
    void divorced80YearOldFemaleWithLicenseShouldReturn400() {
        Customer c = new Customer(80, female, false, license);
        assertEquals(400, CarInsurance.calculatePremium(c));
    }
    
    @Test
    void married30YearOldMaleWithLicenseShouldReturn400() {
        Customer c = new Customer(30, male, true, license);
        assertEquals(400, CarInsurance.calculatePremium(c));
    }
    
    @Test
    void divorced85YearOldMaleWithoutLicenseShouldReturnMinus1() {
        Customer c = new Customer(85, male, false, "");
        assertEquals(-1, CarInsurance.calculatePremium(c));
    }
    
    @Test
    void divorced35YearOldFemaleWithoutLicenseShouldReturnMinus1() {
        Customer c = new Customer(35, female, false, "");
        assertEquals(-1, CarInsurance.calculatePremium(c));
    }
    
    @Test
    void married20YearOldFemaleWithLicenseShouldReturn400() {
        Customer c = new Customer(20, female, true, license);
        assertEquals(300, CarInsurance.calculatePremium(c));
    }
    
    @Test
    void divorced25YearOldMaleWithLicenseShouldReturn600() {
        Customer c = new Customer(25, male, false, license);
        assertEquals(600, CarInsurance.calculatePremium(c));
    }
}
