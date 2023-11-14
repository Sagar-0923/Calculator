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
        int a = 10;
        int b = 50;
        int expectedResult = 60;
        int result = calculator.add(a,b);
        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void test_subt() {
        int a = 20;
        int b = 5;
        int expectedResult = 15;
        int result = calculator.subt(a,b);
        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void test_mul() {
        int a = 10;
        int b = 2;
        int expectedResult = 20;
        int result = calculator.mul(a,b);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test_per() {
        int a = 10;
        int b = 4;
        int expectedResult = 2;
        int result = calculator.per(a,b);
        Assert.assertEquals(expectedResult, result);
    }
}