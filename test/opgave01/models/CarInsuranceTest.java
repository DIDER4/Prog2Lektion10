package opgave01.models;

import static org.junit.jupiter.api.Assertions.*;

class CarInsuranceTest {

    @org.junit.jupiter.api.Test
    void calculatePremium() {
        double expected = 712.5;
        double actual = new CarInsurance(1000).calculatePremium(30, true, 8);
        assertEquals(expected, actual);
    }
}