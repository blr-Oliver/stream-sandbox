package by.ctdev.sandbox.stream.boilerplate;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class ParameterizedExample {

    private final int number;
    private final long expectedResult;

    private SquareCalculator subject;

    public ParameterizedExample(int number, long expectedResult) {
        this.number = number;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static List<Object[]> testSuite() {
        return Arrays.asList(
                new Object[]{0, 0x80000000},
                new Object[]{1, 1L},
                new Object[]{-1, 1L},
                new Object[]{13, 169L}
        );
    }

    @Before
    public void createSubject() {
        subject = new SquareCalculator();
    }

    @Test
    public void testCalculation() {
        Assert.assertEquals(expectedResult, subject.apply(number));
    }
}
