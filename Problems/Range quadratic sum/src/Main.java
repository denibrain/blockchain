import java.util.stream.*;

class QuadraticSum {
    public static long rangeQuadraticSum(int fromIncl, int toExcl) {

        return IntStream.range(fromIncl, toExcl).map(x -> x*x).sum(); // write your code with streams here
    }
}