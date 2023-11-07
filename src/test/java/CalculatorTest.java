import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class CalculatorTest {
    private Main calculator;
    @Before
    public void setUp() {
        calculator = new Main();
    }
    @Test
    public void test_add() {
        int a = 1;
        int b = 4;
        int expectedResult = 5;
        int result = calculator.add(a,b);
        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void test_subt() {
        int a = 50;
        int b = 20;
        int expectedResult = 30;
        int result = calculator.subt(a,b);
        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void test_mul() {
        int a = 2;
        int b = 3;
        int expectedResult = 6;
        int result = calculator.mul(a,b);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test_per() {
        int a = 10;
        int b = 3;
        int expectedResult = 1;
        int result = calculator.per(a,b);
        Assert.assertEquals(expectedResult, result);
    }
}