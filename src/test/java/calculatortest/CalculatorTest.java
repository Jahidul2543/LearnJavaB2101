package calculatortest;

import org.testng.Assert;
import org.testng.annotations.Test;
import practice.Calculator;

public class CalculatorTest {

    @Test
    public void addTest(){
        Calculator calculator = new Calculator();
        int actualValue = Calculator.add(2,2);
        int expectedValue = 4;
        // Find a way to programmatically compare two values actualValue == expectedValue
        // Test Passed
        Assert.assertEquals(actualValue, expectedValue);

    }

    @Test
    public void divisionTest(){
        Calculator calculator = new Calculator();
        int actualValue = Calculator.division(2,2);
        int expectedValue = 1;
        // Find a way to programmatically compare two values actualValue == expectedValue
        // Test Passed
        Assert.assertEquals(actualValue, expectedValue);

    }
}
