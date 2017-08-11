package ga.gabrielaraujo;

import ga.gabrielaraujo.TriangleUtil.TriangleType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static ga.gabrielaraujo.TriangleUtil.TriangleType.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TriangleUtilReturnTest {

    @Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][]{
                {new int[] {3, 4, 5}, SCALENE},
                {new int[] {3, 3, 3}, EQUILATERAL},
                {new int[] {1, 2, 3}, NOT_TRIANGLE},
                {new int[] {4, 2, 3}, SCALENE},
                {new int[] {2, 2, 3}, ISOSCELES},
                {new int[] {3, 2, 2}, ISOSCELES},
                {new int[] {1, 1, 1}, EQUILATERAL},
                {new int[] {1, 2, 100}, NOT_TRIANGLE},
                {new int[] {50, 2, 20}, NOT_TRIANGLE},
                {new int[] {100, 100, 100}, EQUILATERAL}
        });
    }

    private int side_a, side_b, side_c;
    private TriangleType expectedType;

    public TriangleUtilReturnTest(int[] input, TriangleType expected) {
        side_a = input[0];
        side_b = input[1];
        side_c = input[2];

        expectedType = expected;
    }

    @Test
    public void defineType() {
        String reason = "Testing triangle (" + side_a + ", " + side_b + ", " + side_c + ") ";
        assertThat(reason, TriangleUtil.defineType(side_a, side_b, side_c), is(expectedType));
    }


}