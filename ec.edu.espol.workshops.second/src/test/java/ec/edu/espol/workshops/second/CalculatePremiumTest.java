package ec.edu.espol.workshops.second;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatePremiumTest {
    String license = "0801129210";
    char male = 'M';
    char female = 'F';

    @Test
    void minorMaleWithLicenseShouldReturn2000() {
        Customer c = new Customer(16, male, false, license);
        assertEquals(2000, CarInsurance.calculatePremium(c));
    }
    
    @Test
    void minorFemaleWithLicenseShouldReturn300() {
        Customer c = new Customer(16, female, false, license);
        assertEquals(300, CarInsurance.calculatePremium(c));
    }  
    
    
    @Test
    void divorced50YearOldMaleWithLicenseShouldReturn400() {
        Customer c = new Customer(50, male, false, license);
        assertEquals(400, CarInsurance.calculatePremium(c));
    }
    
    @Test
    void married50YearOldFemaleWithLicenseShouldReturn200() {
        Customer c = new Customer(50, female, true, license);
        assertEquals(200, CarInsurance.calculatePremium(c));
    }
    
    @Test
    void divorced80YearOldFemaleWithLicenseShouldReturn300() {
        Customer c = new Customer(80, female, false, license);
        assertEquals(300, CarInsurance.calculatePremium(c));
    }
    
    @Test
    void married30YearOldMaleWithLicenseShouldReturn300() {
        Customer c = new Customer(30, male, true, license);
        assertEquals(300, CarInsurance.calculatePremium(c));
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
    void married20YearOldFemaleWithLicenseShouldReturn300() {
        Customer c = new Customer(20, female, true, license);
        assertEquals(300, CarInsurance.calculatePremium(c));
    }
    
    @Test
    void divorced25YearOldMaleWithLicenseShouldReturn500() {
        Customer c = new Customer(25, male, false, license);
        assertEquals(500, CarInsurance.calculatePremium(c));
    }
    
    //SystemTesting
    @Test
    void tc1() {
        Customer c = new Customer(20, male, false, license);
        assertEquals(2000, CarInsurance.calculatePremium(c));
    }
    
    @Test
    void tc2() {
        Customer c = new Customer(50, female, true, license);
        assertEquals(200, CarInsurance.calculatePremium(c));
    }
    
    @Test
    void tc3() {
        Customer c = new Customer(50, 'H', true, license);
        assertEquals(-1, CarInsurance.calculatePremium(c));
    }
    
    @Test
    void tc4() {
        Customer c = new Customer(50, female, T, license);
        assertEquals(-1, CarInsurance.calculatePremium(c));
    }
    
    @Test
    void tc5() {
        Customer c = new Customer(-1, female, true, license);
        assertEquals(-1, CarInsurance.calculatePremium(c));
    }
    
    @Test
    void tc6() {
        Customer c = new Customer(15, female, true, license);
        assertEquals(-1, CarInsurance.calculatePremium(c));
    }
    
    @Test
    void tc7() {
        Customer c = new Customer(100, female, true, license);
        assertEquals(-1, CarInsurance.calculatePremium(c));
    }
    
    @Test
    void tc8() {
        Customer c = new Customer(100, female, true, "1711129210");
        assertEquals(-1, CarInsurance.calculatePremium(c));
    }
}
