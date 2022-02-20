package example;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class FelineParameterizedTest {

    private final int expected;

    public FelineParameterizedTest(int expected){
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getDateKittens(){
            return new Object[][]{
                    {2},
                    {5},
                    {7},
            };
    }

    @Test
    public void kittensArgument(){
        Feline feline = new Feline();
        int actual = feline.getKittens(expected);
        Assert.assertEquals(expected, actual);
    }
}