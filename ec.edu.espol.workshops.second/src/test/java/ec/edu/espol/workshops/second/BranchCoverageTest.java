package ec.edu.espol.workshops.second;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BranchCoverageTest {

    String license = "0801129210";
    char male = 'M';
    char female = 'F';

    @Test
    void branchCoverage1() {
        Customer c = new Customer(10, female, true, "1711129210");
        assertEquals(-1, CarInsurance.calculatePremium(c));
    }
    
    @Test
    void branchCoverage2() {
        Customer c = new Customer(23, male, true, license);
        assertNotEquals(-1, CarInsurance.calculatePremium(c));
    }
    
    @Test
    void branchCoverage3()  {
        Customer c = new Customer(40, male, false, license);
        assertNotEquals(-1, CarInsurance.calculatePremium(c));
    }

}
