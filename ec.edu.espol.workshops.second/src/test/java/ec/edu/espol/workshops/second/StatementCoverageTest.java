package ec.edu.espol.workshops.second;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StatementCoverageTest {

    String license = "0801129210";
    char male = 'M';
    char female = 'F';

    @Test
    void statementCoverage1() {
        Customer c = new Customer(10, female, true, "1711129210");
        assertEquals(-1, CarInsurance.calculatePremium(c));
    }
    
    @Test
    void statementCoverage2() {
        Customer c = new Customer(23, male, true, license);
        assertNotEquals(-1, CarInsurance.calculatePremium(c));
    }
    
    @Test
    void statementCoverage3()  {
        Customer c = new Customer(40, male, false, license);
        assertNotEquals(-1, CarInsurance.calculatePremium(c));
    }

}
