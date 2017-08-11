package ga.gabrielaraujo;

class TriangleUtil {

    public enum TriangleType
    {
        NOT_TRIANGLE, EQUILATERAL, ISOSCELES, SCALENE;
    }

    static TriangleType defineType(int side1, int side2, int side3)
    {
        if (side1 > 100 || side1 < 1
                || side2 > 100 || side2 < 1
                || side3 > 100 || side3 < 1)
            throw new IllegalArgumentException("Just sides in [1, 100] interval, babe!");
        if (side1 >= side2 + side3 ||
                side2 >= side1 + side3 ||
                side3 >= side1 + side2) {
            return TriangleType.NOT_TRIANGLE;
        }

        TriangleType result = TriangleType.SCALENE;

        if (side1 == side2) {
            result = TriangleType.ISOSCELES;
            if (side3 == side1) {
                result = TriangleType.EQUILATERAL;
            }
        } else if (side2 == side3 || side1 == side3) {
            result = TriangleType.ISOSCELES;
        }


        return result;
    }
}
