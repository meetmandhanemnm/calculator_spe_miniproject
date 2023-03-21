import org.junit.*;
import org.example.Calculator;

public class CalculatorTest {

    @Test
    public void TestFact1() { Assert.assertEquals(2,Calculator.factorial(2));}

    @Test
    public void TestFact2() {
        Assert.assertEquals(120,Calculator.factorial(5));
    }

    @Test
    public void TestRoot1() {
        Assert.assertEquals(2.0,Calculator.square_root(4),0.0f);
    }

    @Test
    public void TestRoot2() {
        Assert.assertEquals(9.0,Calculator.square_root(81),0.0f);
    }

    @Test
    public void Testlog1() { Assert.assertEquals(1.0,Calculator.natural_log(2.718),0.01f);}

    @Test
    public void Testlog2() { Assert.assertEquals(2.302,Calculator.natural_log(10),0.01f);}

    @Test
    public void Testpow1() { Assert.assertEquals(4.0,Calculator.power(2.0,2.0),0.01f);}

    @Test
    public void Testpow2() { Assert.assertEquals(1.0,Calculator.power(2.0,0.0),0.01f);}

}
