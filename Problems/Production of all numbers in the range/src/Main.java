import java.util.function.*;


class Operator {

    public static LongBinaryOperator binaryOperator = (l, r) -> {
        if (l==r) return (long)l;
        long a = (long)l;
        while (++l <= r) {
            a*=l;
        }
        return a;
    };// Write your code here
}