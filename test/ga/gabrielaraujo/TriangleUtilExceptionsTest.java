package ga.gabrielaraujo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.fail;

@RunWith(Parameterized.class)
public class TriangleUtilExceptionsTest {

    private static final boolean THROWS = true;
    private static final boolean NOT_THROWS = false;

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][]{
                {new int[] {3, 4, 5}, NOT_THROWS},
                {new int[] {3, 3, 3}, NOT_THROWS},
                {new int[] {-1, -1, -1}, THROWS},
                {new int[] {-1, 2, 3}, THROWS},
                {new int[] {0, -2, 3}, THROWS},
                {new int[] {0, -2, -3}, THROWS},
                {new int[] {0, 0, 0}, THROWS},
                {new int[] {1, 2, 3}, NOT_THROWS},
                {new int[] {4, 2, 3}, NOT_THROWS},
                {new int[] {2, 2, 3}, NOT_THROWS},
                {new int[] {3, 2, 2}, NOT_THROWS},
                {new int[] {1, 1, 1}, NOT_THROWS},
                {new int[] {100, 100, 100}, NOT_THROWS},
                {new int[] {3207882, 3, 3207884}, THROWS},
                {new int[] {3207882, 3, 3207885}, THROWS},
                {new int[] {3207882, 3, 3207886}, THROWS}
        });
    }


    private int side_a, side_b, side_c;
    private boolean exceptionExpected;

    public TriangleUtilExceptionsTest(int[] input, boolean expected) {
        side_a = input[0];
        side_b = input[1];
        side_c = input[2];

        exceptionExpected = expected;
    }

    @Test
    public void defineType() {
        try {
            //noinspection ResultOfMethodCallIgnored
            TriangleUtil.defineType(side_a, side_b, side_c);
            if (exceptionExpected)
                fail("Expect the triangle (" + side_a + ", " + side_b + ", " + side_c + ") type definition DOES THROW");
        } catch (IllegalArgumentException e) {
            if (!exceptionExpected)
                fail("Expect the triangle (" + side_a + ", " + side_b + ", " + side_c + ") type definition DOES NOT THROW");
        }
    }

}